package C02_OOP_06异常处理.快递管理.main;

import C02_OOP_06异常处理.快递管理.bean.Express;
import C02_OOP_06异常处理.快递管理.dao.ExpressDao;
import C02_OOP_06异常处理.快递管理.view.Views;

public class Main {
    //初始化试图对象
    private static Views v = new Views();
    //初始化dao对象
    private static ExpressDao expressDao = new ExpressDao();

    public static void main(String[] args) {
        //欢迎
        v.welcome();
        m:while (true){
            //2. 弹出菜单选择
            int menu = v.menu();
            switch (menu){
                case 0:
                    break m;
                case 1:
                    cClient();
                    break ;
                case 2:
                    uClient();
                    break ;
            }
        }
        //结束
        v.bye();

    }

    private static void uClient() {
        //1.获取取件码
        int code = v.uMenu();
        //2.根据取件码 取出快递
        Express e = expressDao.findByCode(code);
        if (e == null){
            v.printNull();
        }else {
            v.success();
            v.printExpress(e);
            expressDao.delete(e);
        }
    }
    private static void cClient() {
        while (true){
            int menu = v.cMenu();
            switch (menu){
                case 0:
                    return;
                case 1:{
                    //1.提示输入快递信息
                    Express e = v.insert();
                    //2.此快递已存在
                    Express e2 = expressDao.findByNumber(e.getNumber());
                    //3.存储快递
                    if (e2 == null){
                        //从未存储，cun
                        expressDao.add(e);
                        v.printExpress(e);
                    }else {
                        v.expressExist();
                    }
                }
                break;
                case 2:{//修改
                    //1.提示输入快递信息
                    String number = v.findByNumber();
                    //2.查找快递
                    Express e = expressDao.findByNumber(number);
                    Express e2 = e;
                    //3.打印快递信息
                    if (e == null){
                        v.printNull();
                    }else{
                        v.printExpress(e);
                        //4.提示修改
                        v.update(e2);
                        expressDao.update(e,e2);
                        v.printExpress(e2);
                    }
                }
                break;
                case 3:{
                    //删除
                    //1. 提示输入快递
                    String number = v.findByNumber();
                    //2. 查找快递对象
                    Express e = expressDao.findByNumber(number);
                    if (e == null){
                        v.printNull();
                    }else {
                        v.printExpress(e);
                        int type = v.delete();
                        if (type == 1){
                            expressDao.delete(e);
                            v.success();
                        }
                    }
                }
                break;
                case 4:{
                    //查找所有
                    Express[][] data = expressDao.findAll();
                    v.printAll(data);
                }
                break;
            }
        }

    }
}

