package C02_OOP_06异常处理.快递管理2.dao;

import C02_OOP_06异常处理.快递管理2.bean.Express;

import java.util.Random;

public class ExpressDao {
    private Express[][] data = new Express[10][];
    //当前存储的快递数
    private int size;
    {
        for(int i=0;i<10;i++){
            data[i] = new Express[10];
        }
    }
    private Random random = new Random();

    /**
     * 用于存储快递
     * @param e
     * @return
     */
    public boolean add(Express e){
        if (size == 100){
            return false;
        }
        //随机生成 2 个0-9的下标
        int x = -1;
        int y = -1;
        while(true){
            x = random.nextInt(10);
            y = random.nextInt(10);
            if(data[x][y] == null){
                //此位置无快递
                break;
            }
        }
        //生成取件码
        int code = randomCode(); //模板方法设计模式
        e.setCode(code);
        data[x][y] = e;
        return true;
    }

    //模板方法设计模式
    private int randomCode(){
        //0-99999
        //100000-999999
        //0-899999 + 100000
        while(true) {
            int code = random.nextInt(900000)+100000;
            Express e = findByCode(code);
            if (e == null) {
                return code;
            }
        }
    }


    public Express findByNumber(String number){
        Express e = new Express();
        e.setNumber(number);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(e.equals(data[i][j])){
                    return data[i][j];
                }
            }
        }
        return null;
    }

    /**
     * 根据取件码查询快递
     * @param code
     * @return
     */
    public Express findByCode(int code) {
        for(int i=0;i<10;i++){  // 固定 10 和 数组.length 各有优点
            for(int j=0;j<10;j++){
                if(data[i][j]!=null)
                if(data[i][j].getCode() == code){
                    return data[i][j];
                }
            }
        }
        return null;
    }

    /**
     * 多余的操作，为了MVC更圆润
     * @param oldExpress
     * @param newExpress
     */
    public void update(Express oldExpress,Express newExpress){
        delete(oldExpress);
        add(newExpress);
    }

    /**
     * 删除快递
     * @param e
     */
    public void delete(Express e){
        p:for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(e.equals(data[i][j])){
                    data[i][j] = null;
                    break p;
                }
            }
        }
    }


    public Express[][] findAll(){
        return data;

    }
}
