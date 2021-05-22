package C02_OOP_06异常处理.快递管理2.main;

import C02_OOP_06异常处理.快递管理2.bean.Express;
import C02_OOP_06异常处理.快递管理2.dao.ExpressDao;
import C02_OOP_06异常处理.快递管理2.view.Views;

public class Main {
    //初始化视图对象
    private static Views v = new Views();
    //初始化dao对象
    private static ExpressDao dao = new ExpressDao();

    public static void main(String[] args) {
        //1. 欢迎
        v.welcome();
        m:
        while (true) {
            //2. 弹出身份选择菜单
            int menu = v.menu();
            switch (menu) {
                case 0:
                    break m;
                case 1:
                    cClient();
                    break;
                case 2:
                    uClient();
                    break;
            }
        }
        v.bye();

    }

    private static void uClient() {
        //1.取件码获取
        int code = v.uMenu();
        //2. 根据取件码取出快递
        Express e = dao.findByCode(code);
        if(e == null){
            v.printNull();
        }else{
            v.success();
            v.printExpress(e);
            dao.delete(e);

        }

    }

    private static void cClient() {
        while (true) {
            int menu = v.cMenu();
            switch (menu) {
                case 0:
                    return;
                case 1: {
                    //1. 提示输入快递信息
                    Express e = v.insert();
                    //2. 此快递是否已经存储过
                    Express e2 = dao.findByNumber(e.getNumber());
                    //3. 存储快递
                    if(e2 == null){
                        //未存储过,存
                        dao.add(e);
                        v.printExpress(e);
                    }else{
                        //单号在快递柜中已经存在  注意要用的方法没有 比如前后端密码
                        v.espressExist();

                    }

                }
                    break;
                case 2:{   //删除
                    //1. 输入快递单号
                    String number = v.findByNumber();
                    //2. 查找快递对象
                    Express e = dao.findByNumber(number);
                    //3.    打印快递信息
                    if(e == null){
                        v.printNull();
                    }else{
                        v.printExpress(e);
                        int type = v.delete();
                        if(type == 1){
                         dao.delete(e);
                         v.success();

                        }
                    }
                }
                    break;
                case 3:{//快递修改
                    //1. 提示输入快递信息
                    String number = v.findByNumber();
                    //查找数据
                    Express e = dao.findByNumber(number);
                    Express e2 = e;
                    //打印快递信息
                    if(e == null){
                        v.printNull();
                    }else{
                        v.printExpress(e);
                        //提示新的输入
                        v.update(e2);
                        dao.update(e,e2);
                        v.printExpress(e2);
                    }


                }
                    break;
                case 4:{//查看所有
                    Express[][] data = dao.findAll();
                    v.printAll(data);

                }
                    break;
            }

        }

    }

}