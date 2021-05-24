package KD04_IO00.dao;
import KD04_IO00.bean.Express;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;

// 实现可序列化标记接口 使得dao对象支持序列化与反序列化
public class ExpressDao {
    private Random random = new Random();               // 用于生成随机数

    /**
     *
     * @param e 新加入的快递对象
     * @param cabinet 标记快递柜位置是否已被占用
     * @param data 所有的快递对象
     * @return
     */
    public boolean add(Express e, boolean[][] cabinet, HashMap<Integer, Express> data){
        int size = data.size();
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
        int code = randomCode(data.values());           // 获得没有重复的取件码
        e.setCode(code);
        e.posX = x;                                     // 快递柜存放快递的位置
        e.posY = y;
        size++;                                         // 快递数目加一
        cabinet[x][y] = true;                           // 此位置已被占用
        data.put(code, e);                              // 添加键值对
        return true;
    }

    /**
     * 遍历所有对象 生成独一无二的取件码
     * @param expresses 所有的快递对象
     * @return
     */
    private int randomCode(Collection<Express> expresses){
        while (true) {
            int code = random.nextInt(900000) + 100000; // 范围(000000-899999)+1000000
            Express e = findByCode(code, expresses);
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
    public Express findByNumber(String number, Collection<Express> expresses){
        // 遍历HashMap中的Express对象 找到其快递单号相对应的那个对象并返回
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
    public Express findByCode(int code, Collection<Express> expresses){
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
    public void update(Express oldExpress, Express newExpress, boolean[][] cabinet, HashMap<Integer, Express> data){
        delete(oldExpress, cabinet, data);
        add(newExpress, cabinet, data);
    }
    public void delete(Express e, boolean[][] cabinet, HashMap<Integer, Express> data){
        data.remove(e.getCode());
        cabinet[e.posX][e.posY] = false;
    }
}