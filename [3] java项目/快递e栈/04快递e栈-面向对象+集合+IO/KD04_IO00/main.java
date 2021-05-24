package KD04_IO00;

import KD04_IO00.bean.Express;
import KD04_IO00.dao.ExpressDao;
import KD04_IO00.view.View;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;

public class main {
    // 初始化视图对象
    private static View v = new View(); // 这样可以跨方法使用

    // 初始化dao对象
    private static ExpressDao dao = new ExpressDao();

    // 1，弹出身份选择菜单
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 初始化数据结构
         */
        boolean[][] cabinet = new boolean[10][];    // 二维数组表示快递柜位置是否被占用
        HashMap<Integer, Express> data;             // HashMap存放 <取件码，快递对象>
        Collection<Express> expresses;              // 存放所有的Express对象 便于遍历
        for(int i = 0; i < 10; i++){
            cabinet[i] = new boolean[10];
        }
        int size = 0;   // 当前存储的快递数目(便于判断是否还有空位 否则在随机生成取件码时可能陷入死循环)

        /**
         * 反序列化获得快递柜中存放的对象HashMap<Integer, Express> data
         */
        try (FileInputStream fis = new FileInputStream("SerializedData.txt")) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            data = (HashMap<Integer, Express>) ois.readObject();
            ois.close();                            // 关闭输入流
        } catch (IOException | ClassNotFoundException e) {
            data = new HashMap<>();                 // 打开文件异常时 将data初始为空 在main函数结束时进行序列化
        }
        /**
         * 初始化必要数据结构
         */
        expresses = data.values();                  // 遍历map中的key字段 只能采用此方法先获取集合形式的key字段
        for(Express e : expresses) {
            cabinet[e.posX][e.posY] = true;        // 表示此位置已被占用
        }
        /**
         * 主要功能展示
         */
        m:while (true){
            int menu = v.menu();
            switch (menu){
                case 0:
                    break m;
                case 1:
                    gClient(data.size(), cabinet, data);
                    break;
                case 2:
                    uClient(data.size(), cabinet, data);
                    break;
            }
        }

        /**
         * 序列化存储对象HashMap<Integer, Express> data
         */
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SerializedData.txt"));
        oos.writeObject(data);
        oos.close();


    }

    private static void uClient(int size, boolean[][] cabinet, HashMap<Integer, Express> data) {
        Collection<Express> expresses = data.values();// 获得所有快递对象 便于遍历查找
        // 1，获得取件码
        int code = v.uMenu();
        // 2，根据取件码取出快递
        Express e = dao.findByCode(code, expresses);
        if(e == null){
            v.printNull();
        }else {
            v.success();
            v.printExpress(e);
            dao.delete(e, cabinet, data);
        }
    }

    private static void gClient(int size, boolean[][] cabinet, HashMap<Integer, Express> data) {
        while (true){
            int menu = v.gMenu();
            switch (menu){
                case 0:
                    return;
                case 1:{                            // 快递录入
                    // 1，提示输入快递信息
                    Express e = v.insert();
                    // 2，此快递是否已经存储过
                    Express e2 = dao.findByNumber(e.getNumber(), data.values());
                    // 3，存储快递
                    if(e2 == null){                 // 未存储过
                        dao.add(e, cabinet, data);
                        v.printCode(e);
                    }else {                         // 单号重复
                        v.expressExist();
                    }
                    break;
                }
                case 2: {                           // 快递修改
                    // 1，提示输入快递信息
                    String number = v.findByNumber();
                    // 2，查找数据
                    Express e1 = dao.findByNumber(number, data.values());
                    // 3，打印快递信息
                    if(e1 == null){
                        v.printNull();
                    }else {
                        v.printExpress(e1);
                        // 4，提示修改
                        v.update(e1);               // 这里已经将快递的信息修改过了
                        dao.update(e1, e1, cabinet, data);// 这里只是为了强调 删除-修改的过程
                        v.printExpress(e1);
                    }

                    break;
                }
                case 3: {                           // 删除
                    // 1，输入快递单号
                    String number = v.findByNumber();
                    // 2，查找快递对象
                    Express e = dao.findByNumber(number, data.values());
                    if(e == null){
                        v.printNull();
                    }else {
                        v.printExpress(e);
                        int type = v.delete();
                        if(type == 1){
                            dao.delete(e, cabinet, data);
                        }else {
                            v.success();
                        }
                    }
                    break;
                }
                case 4:{                            // 查看所有
                    v.printAll(data.values());      // 在视图层显示
                    break;
                }
            }
        }
    }
}