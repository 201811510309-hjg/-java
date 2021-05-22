package D03_核心类库_06网络编程.快递管理.dao;


import D03_核心类库_06网络编程.快递管理.bean.Express;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

// 实现可序列化标记接口 使得dao对象支持序列化与反序列化
public class ExpressDao {
    private File file = new File("SerializedData.txt");
    private boolean[][] cabinet = new boolean[10][];            // 二维数组表示快递柜位置是否被占用 true已占用 false未占用
    private ArrayList<Express> expresses = new ArrayList<>();   // 存放所有的Express对象 便于遍历
    private Random random = new Random();                       // 用于生成随机数

    /**
     * 反序列化获得快递柜中存放的对象HashMap<Integer, Express> data
     */
    public void readFromFile() {
        try (FileInputStream fis = new FileInputStream(file)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            expresses = (ArrayList<Express>) ois.readObject();  // 反序列化读取对象
            ois.close();                                        // 关闭输入流
        } catch (IOException | ClassNotFoundException e) {
            expresses = new ArrayList<Express>();               // 打开文件异常时 将expresses初始为空
        }
    }

    /**
     * 序列化存储对象HashMap<Integer, Express> data
     * @throws IOException
     */
    public void writeToFile() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(expresses);                             // 序列化对象
        oos.close();
    }

    /**
     * 初始化数据结构：cabinet（表示快递柜是否被占用），expresses（存储）
     */
    public void init() {
        for(int i = 0; i < 10; i++){
            cabinet[i] = new boolean[10];
        }
        for(Express e : expresses) {
            cabinet[e.posX][e.posY] = true;         // 表示此位置已被占用
        }
    }

    /**
     *
     * @param e 新加入的快递对象
     * @return
     */
    public synchronized boolean add(Express e){
        int size = expresses.size();
        if(size >= 100){
            return false;
        }
        // 1,随机生成两个0-9的下标
        int x = -1, y = -1;
        while (true){
            x = random.nextInt(10);
            y = random.nextInt(10);
            if(cabinet[x][y] == false){
                break;                                  // 此位置未被占用
            }
        }
        // 2,判断取件码是否重复(最简单的 一个个对比)
        int code = randomCode();           // 获得没有重复的取件码
        e.setCode(code);
        e.posX = x;                                     // 快递柜存放快递的位置
        e.posY = y;
        size++;                                         // 快递数目加一
        cabinet[x][y] = true;                           // 此位置已被占用
        expresses.add(e);                              //
        return true;
    }

    /**
     * 遍历所有对象 生成独一无二的取件码
     * @return
     */
    private int randomCode(){
        while (true) {
            int code = random.nextInt(900000) + 100000; // 范围(000000-899999)+1000000
            Express e = findByCode(code);
            if(e == null) { // 说明取件码未重复
                return code;
            }
        }
    }

    /**
     * 快递员根据快递单号查询HashMap中存放的快递
     * @param number
     * @return
     */
    public Express findByNumber(String number){
        for(Express e : expresses) {
            if(e.getNumber().equals(number)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 根据取件码查询快递
     * @param code 取件码
     * @return 查询到结果 查询失败返回null
     */
    public Express findByCode(int code){
        for(Express e : expresses) {
            if(e.getCode() == code) {
                return e;
            }
        }
        return null;
    }

    /**
     * 多余的操作 为了MVC更圆润
     * @param oldExpress
     * @param newExpress
     */
    public synchronized Boolean update(Express oldExpress, Express newExpress){
        delete(oldExpress);
        return add(newExpress);
    }

    /**
     * 删除特定的快递对象
     * @param e
     */
    public synchronized boolean delete(Express e){
        cabinet[e.posX][e.posY] = false;
        return expresses.remove(e);// 删除指定对象
    }

    /**
     * 获取所有的快递对象
     * @return
     */
    public synchronized ArrayList<Express> getAll() {
        return expresses;
    }
}
