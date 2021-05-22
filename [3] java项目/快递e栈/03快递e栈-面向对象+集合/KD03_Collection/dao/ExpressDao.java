package KD03_Collection.dao;


import KD03_Collection.bean.Express;

import java.util.Collection;
import java.util.HashMap;
import java.util.Random;

public class ExpressDao {
    //private Express[][] data = new Express[10][];
    boolean[][] cabinet = new boolean[10][];            // 二维数组表示快递柜
    HashMap<Integer, Express> data = new HashMap<>();   // HashMap代替二维数组表示快递柜
    Collection<Express> expresses = data.values();      // 存放所有的Express对象
    {
        for(int i = 0; i < 10; i++){
            cabinet[i] = new boolean[10];
        }
    }
    private Random random = new Random();               // 用于生成随机数
    private int size;   // 当前存储的快递数目(便于判断是否还有空位 否则在随机生成取件码时可能陷入死循环)

    /**
     * 存快递
     * @param e
     * @return
     */
    public boolean add(Express e){
        if(this.size >= 100){
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
        int code = randomCode();                        // 获得没有重复的取件码
        e.setCode(code);
        e.posX = x;                                     // 快递柜存放快递的位置
        e.posY = y;
        size++;                                         // 快递数目加一
        cabinet[x][y] = true;                           // 此位置已被占用
        data.put(code,e);                              // 添加键值对 key 为取件码，value 为快递对象
        return true;
    }

    private int randomCode() {
        while (true) {
            int code = random.nextInt(900000) + 100000; // 范围(000000-899999)+1000000
            Express e = findByCode(code);
            if(e == null) { // 说明取件码未重复
                return code;
            }
        }
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
     * 快递员根据快递单号查询HashMap中存放的快递
     * @param number
     * @return
     */
    public Express findByNumber(String number){
        // 遍历HashMap中的Express对象 找到其快递单号相对应的那个对象并返回
        for(Express e : expresses) {
            if(e.getNumber().equals(number)) {
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
    public void update(Express oldExpress, Express newExpress){
        delete(oldExpress);
        add(newExpress);
    }
    public void delete(Express e){
        data.remove(e.getCode());
        cabinet[e.posX][e.posY] = false;
        size--;
    }
    public Collection<Express> findAll(){
        return expresses;
    }


}
