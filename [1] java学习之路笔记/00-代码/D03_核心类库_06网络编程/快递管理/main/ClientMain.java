package D03_核心类库_06网络编程.快递管理.main;


import D03_核心类库_06网络编程.快递管理.bean.Express;
import D03_核心类库_06网络编程.快递管理.view.View;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;

public class ClientMain {
    private Socket socket;
    private View v = new View();

    public static void main(String[] args) throws IOException {
        ClientMain client = new ClientMain();
        client.link();
    }

    /**
     * 创建套接字，与服务端进行连接；
     * 创建对象输入/输出流，与服务端进行数据交互；
     * @throws IOException
     */
    public void link() throws IOException {
        OutputStream os = null;
        InputStream is = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            socket = new Socket("127.0.0.1", 8888);
            v.connectSuccess();
            is = socket.getInputStream();
            os = socket.getOutputStream();
            oos = new ObjectOutputStream(os);// 由于服务器是先ois后oos 为了保证配对 这里需要顺序调换
            ois = new ObjectInputStream(is);
            o:while (true) {
                int num = v.menu();// 获得角色选择码
                oos.writeInt(num);
                oos.flush();
                switch (num) {
                    case 0:
                        break o;
                    case 1:
                        gClient(oos, ois);
                        break;
                    case 2:
                        uClient(oos, ois);
                        break;
                    default:
                        v.choiceError();
                        break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null) ois.close();
            if(oos != null) oos.close();
            if(socket != null) socket.close();
        }
    }

    /**
     * 客户端管理员模块
     * @param oos
     * @param ois
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void gClient(ObjectOutputStream oos, ObjectInputStream ois) throws IOException, ClassNotFoundException {
        while (true) {
            int num = v.gMenu();// 获得用户输入的功能码
            oos.writeInt(num);// 向服务器传送功能码 保证进入同样的功能模块
            oos.flush();
            switch (num) {
                case 0:// 退出
                    return;
                case 1:// 插入
                    insert(oos, ois);
                    break;
                case 2:// 修改
                    update(oos, ois);
                    break;
                case 3:// 删除
                    delete(oos, ois);
                    break;
                case 4:// 显示所有
                    printAll(oos, ois);
                    break;
                default:
                    v.choiceError();
                    break;
            }
        }
    }

    /**
     * 客户端用户模块
     * @param oos
     * @param ois
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void uClient(ObjectOutputStream oos, ObjectInputStream ois) throws IOException, ClassNotFoundException {
        while (true) {
            int num = v.uMenu();
            oos.writeInt(num);
            oos.flush();
            switch (num) {
                case 0:
                    return;
                case 1:
                    int code = v.getExpress();
                    oos.writeInt(code);
                    oos.flush();
                    Express e = (Express) ois.readObject();
                    if(e != null) {// 查询到有快递存在
                        v.printExpress(e);
                        if(ois.readBoolean()) v.success();
                        else v.fail();
                    } else {
                        v.printNull();// 取件码对应快递不存在
                    }
                    break;
                default:
                    v.choiceError();
                    break;
            }
        }
    }

    /**
     * 插入快递对象；
     * 利用view对象获取将要插入快递对象，并将其传送给服务端
     * @param oos
     * @param ois
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void insert(ObjectOutputStream oos, ObjectInputStream ois) throws IOException, ClassNotFoundException {
        Express e = v.insert();
        oos.writeObject(e);
        oos.flush();
        Express e1 = (Express) ois.readObject();// 返回对象为空 表示当前快递单号尚未被使用
        if(e1 == null) {
            if(ois.readBoolean()) {// 插入成功
                v.success();
            } else {
                v.fail();
            }
        } else {
            v.expressExist();
        }
    }

    /**
     * 删除快递对象
     * @param oos
     * @param ois
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void delete(ObjectOutputStream oos, ObjectInputStream ois) throws IOException, ClassNotFoundException {
        String id = v.findByNumber();
        oos.writeObject(id);
        oos.flush();
        Express e = (Express) ois.readObject();
        if(e != null) {
            int num = v.delete();// 再次向用户确认是否删除
            oos.writeInt(num);
            oos.flush();
            switch (num) {
                case 1:// 确认删除
                    if(ois.readBoolean()) v.success();
                    else v.fail();
                    break;
                default:// 取消删除或退出
                    break;
            }
        } else {
            v.printNull();
        }
    }

    /**
     * 更新快递对象
     * @param oos
     * @param ois
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void update(ObjectOutputStream oos, ObjectInputStream ois) throws IOException, ClassNotFoundException {
        String id = v.findByNumber();
        oos.writeObject(id);
        oos.flush();
        Express e = (Express) ois.readObject();
        if(e != null) {// 被更新的快递对象存在
            Express e1 = v.update();
            oos.writeObject(e1);

            oos.flush();
            if(ois.readBoolean()) v.success();
            else v.fail();
        } else {
            v.printNull();
        }
    }

    /**
     * 打印快递对象
     * @param oos
     * @param ois
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void printAll(ObjectOutputStream oos, ObjectInputStream ois) throws IOException, ClassNotFoundException {
//        ArrayList<Express> expresses = (ArrayList<Express>) ois.readObject();
//        v.printAll(expresses);
        Express[] es = (Express[]) ois.readObject();
        List<Express> expresses =  Arrays.asList(es);
        v.printAll(expresses);
    }
}