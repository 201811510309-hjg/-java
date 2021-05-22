package KD03_Collection.main;

import java.util.Collection;
import KD03_Collection.bean.Express;
import KD03_Collection.dao.ExpressDao;
import KD03_Collection.view.View;

public class Main {
    // 初始化视图对象
    private static View v = new View(); // 这样可以跨方法使用
    // 初始化dao对象
    private static ExpressDao dao = new ExpressDao();
    // 1，弹出身份选择菜单
    public  void op() {
        m:while (true){
            int menu = v.memu();
            switch (menu){
                case 0:
                    break m;
                case 1:
                    gClient();
                    break;
                case 2:
                    uClient();
                    break;
            }
        }
    }

    private static void uClient() {
        // 1，获得取件码
        int code = v.uMenu();
        // 2，根据取件码取出快递
        Express e = dao.findByCode(code);
        if(e == null){
            v.printNull();
        }else {
            v.success();
            v.printExpress(e);
            dao.delete(e);
        }
    }

    private static void gClient() {
        while (true){
            int menu = v.cMenu();
            switch (menu){
                case 0:
                    return;
                case 1:{
                    // 1，提示输入快递信息
                    Express e = v.insert();
                    // 2，此快递是否已经存储过
                    Express e2 = dao.findByNumber(e.getNumber());
                    // 3，存储快递
                    if(e2 == null){                 // 未存储过
                        dao.add(e);
                        v.printCode(e);
                    }else {                         // 单号重复
                        v.expressExist();
                    }
                    break;
                }
                case 2: {// 快递修改
                    // 1，提示输入快递信息
                    String number = v.findByNumber();
                    // 2，查找数据
                    Express e1 = dao.findByNumber(number);
                    // 3，打印快递信息
                    if(e1 == null){
                        v.printNull();
                    }else {
                        v.printExpress(e1);
                        // 4，提示修改
                        v.update(e1);               // 这里已经将快递的信息修改过了
                        dao.update(e1, e1);         // 这里只是为了强调 删除-修改的过程
                        v.printExpress(e1);
                    }

                    break;
                }
                case 3: {// 删除
                    // 1，输入快递单号
                    String number = v.findByNumber();
                    // 2，查找快递对象
                    Express e = dao.findByNumber(number);
                    if(e == null){
                        v.printNull();
                    }else {
                        v.printExpress(e);
                        int type = v.delete();
                        if(type == 1){
                            dao.delete(e);
                        }else {
                            v.success();
                        }
                    }
                    break;
                }
                case 4:{    // 查看所有
                    Collection<Express> data = dao.findAll();   // 从dao层获取数据
                    v.printAll(data);               // 在视图层显示
                    break;
                }
            }
        }
    }










}

