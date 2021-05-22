package D03_核心类库_06网络编程.快递管理.main;


import D03_核心类库_06网络编程.快递管理.bean.Express;
import D03_核心类库_06网络编程.快递管理.dao.ExpressDao;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerMain {
    private ServerSocket serverSocket;
    private ExpressDao dao = new ExpressDao();
    private int numOfClient = 0;
    // 服务器
    public static void main(String[] args) throws IOException {
        ServerMain server = new ServerMain();
        server.start();
    }

    /**
     * 启动服务器，并与客户端进行连接
     */
    public void start() {
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("服务器已启动");
            dao.readFromFile();// 从文件中读取数据
            dao.init();// 初始化数据结构
            System.out.println("数据初始化成功");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("第" + (++numOfClient) + "个客户端连接了");
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            receive(socket);// 准备连接 进入主功能模块
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(serverSocket != null){
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 创建对象输入/输出流，与客户端进行数据交互；
     * 进入主模块，选择角色；
     * @param socket
     * @throws IOException
     */
    public void receive(Socket socket) throws IOException {
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        try(is; os; ois; oos) {// 这种方式可以在try/catch执行结束后 自动关闭资源
            o: while (true) {
                switch (ois.readInt()) {
                    case 0:// 退出
                        dao.writeToFile();// 退出服务器端 将数据对象写回文件
                        break o;
                    case 1:
                        gClient(ois, oos);// 进入管理员操作功能模块
                        break ;
                    case 2:
                        uClient(ois, oos);// 进入用户操作功能模块
                        break ;
                    default: break ;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 服务端——管理员模块，负责与客户端——管理员模块进行数据交互
     * @param ois
     * @param oos
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void gClient(ObjectInputStream ois, ObjectOutputStream oos) throws IOException, ClassNotFoundException {
        while (true) {
            switch (ois.readInt()) {
                case 0:// 退出
                    return;
                case 1:// 插入
                    insert(ois, oos);
                    break;
                case 2:// 修改
                    update(ois, oos);
                    break;
                case 3:// 删除
                    delete(ois, oos);
                    break;
                case 4:// 显示所有
                    printAll(ois, oos);
                    break;
            }
        }
    }

    /**
     * 服务端——用户模块，负责与客户端——用户模块进行数据交互
     * @param ois
     * @param oos
     * @throws IOException
     */
    public void uClient(ObjectInputStream ois, ObjectOutputStream oos) throws IOException {
        while (true) {
            switch (ois.readInt()) {
                case 0:
                    return;
                case 1:// 取件
                    Express e = dao.findByCode(ois.readInt());// 根据客户端传过来的取件码 查找快递对象
                    oos.writeObject(e);// 向客户端传送查找的对象
                    oos.flush();
                    if(e != null) {
                        oos.writeBoolean(dao.delete(e));
                        oos.flush();
                    }
                    break;
                default: break;
            }
        }
    }

    /**
     * 插入快递对象；
     * 接受客户端发来的新快递对象，用dao对象对数据进行操作，并将操作结果返还给客户端
     * @param ois
     * @param oos
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void insert(ObjectInputStream ois, ObjectOutputStream oos) throws IOException, ClassNotFoundException {
        Express e = (Express) ois.readObject();
        Express e1 = dao.findByNumber(e.getNumber());// 根据快递单号判断对应快递是否已存在
        oos.writeObject(e1);
        oos.flush();
        if(e1 == null) {
            oos.writeBoolean(dao.add(e));
            oos.flush();
        }
    }

    /**
     * 删除快递对象
     * @param ois
     * @param oos
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void delete(ObjectInputStream ois, ObjectOutputStream oos) throws IOException, ClassNotFoundException {
        String id = (String) ois.readObject();
        Express e = dao.findByNumber(id);
        oos.writeObject(e);
        oos.flush();
        if(e != null) {// 快递对象存在
            switch (ois.readInt()) {// 再次向用户确认是否删除
                case 1:
                    oos.writeBoolean(dao.delete(e));
                    oos.flush();
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * 更新快递对象
     * @param ois
     * @param oos
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void update(ObjectInputStream ois, ObjectOutputStream oos) throws IOException, ClassNotFoundException {
        String id = (String) ois.readObject();
        Express e = dao.findByNumber(id);
        oos.writeObject(e);
        oos.flush();
        if(e != null) {
            Express e1 = (Express) ois.readObject();
            oos.writeBoolean(dao.update(e, e1));
            oos.flush();
        }
    }

    /**
     * 向客户端传送所有快递对象
     * @param ois
     * @param oos
     * @throws IOException
     */
    public void printAll(ObjectInputStream ois, ObjectOutputStream oos) throws IOException {
//        oos.writeObject(dao.getAll());
//        oos.flush();
        ArrayList<Express> list = dao.getAll();
        Express[] expresses = new Express[list.size()];
        list.toArray(expresses);
        oos.writeObject(expresses);
        oos.flush();
    }
}