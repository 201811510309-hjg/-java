package C02_OOP_06异常处理.快递hjg;

import java.util.Random;

public class Dao {
    private Express[][] data = new Express[10][];
    {
        for (int i = 0;i<10;i++){
            data[i] = new Express[10];
        }
    }
    //当前存储的快递数量
    private int size;
    //随机数准备
    private Random random = new Random();

    public boolean add(Express e){
        if (size == 100){
            return false;
        }

        //1. 生成快递坐标
        int x,y = -1;
        while (true){
            x = random.nextInt(10);
            y = random.nextInt(10);
            if (data[x][y] == null){
                //无快递
                break;
            }
        }

        //2. 取件码
        int code = randomCode();
        e.setCode(code);
        data[x][y] = e;
        return true;


    }
    //模板方法设计模式
    private int randomCode() {
        while (true){
            int code = random.nextInt(900000)+100000;
            Express e = findByCode(code);
            if (e == null){
                return code;
            }
        }
    }
    public Express findByNumber(String number){
        Express e = new Express();
        e.setNumber(number);
        for (int i=0; i<10;i++){
            for (int j=0;j<10;j++){
                if (e.equals(data[i][j])){
                    return data[i][j];
                }
            }
        }
        return null;

    }


    /**
     * 根据取件码查询快递
     * @param code 要查询的取件码
     * @return 查询的结果 查询失败时返回null
     */
    public Express findByCode(int code) {
        for (int i=0; i<10;i++){
            for (int j=0;j<10;j++){
                if (data[i][j] != null)
                    if (data[i][j].getCode() == code){
                        return data[i][j];
                    }
            }
        }
        return null;
    }

    /**
     * 多余的操作，为了MVC 更圆润
     * @param oldExpress
     * @param newExpress
     */
    public void update(Express oldExpress,Express newExpress){
        delete(oldExpress);
        add(newExpress);

    }
    public void delete(Express e){
        p:for (int i=0; i<10;i++){
            for (int j=0;j<10;j++){
                if (e.equals(data[i][j])){
                    data[i][j] = null;
                    break p;
                }
            }
        }
    }


    public Express[][] findAll() {
        return data;
    }
}
