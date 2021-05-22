package C02_OOP_06异常处理.快递hjg;

public class Main {
    //
    private static View  v = new View();
    //
    private static Dao expressDao = new Dao();

    public static void main(String[] args) {
        //1. 欢迎
        v.welcome();
        m:while (true){
            //2. 弹出菜单选择
            int menu = v.memu();
            switch (menu){
                case 3:
                    break m;
                case 1:
                    CClient();
                    break ;
                case 2:
                    uClient();
                    break ;

            }
        }
        v.bye();

    }

    private static void CClient() {
        while (true){
            int menu = v.cMenu();
            switch (menu){
                case 0:
                    return;
                //存
                case 1: {
                    //1.提示输入快递信息
                    Express e = v.insert();
                    //2.此快递已存在
                    Express e2 = expressDao.findByNumber(e.getNumber());
                    //3. 存快递
                    if (e2 == null) {
                        //空的，可以存
                        expressDao.add(e);
                        v.printExpress(e);
                    } else {
                        v.expressExist();
                    }
                }break;
                //改
                case 2:{
                    //1.提示输入快递信息
                    String number = v.findByNumber();
                    //2.查找快递
                    Express e = expressDao.findByNumber(number);
                    Express e2 = e;
                    //3.打印快递信息
                    if (e == null){
                        v.printNull();
                    }else {
                        v.printExpress(e);
                        //4. 提示修改
                        v.update(e2);
                        expressDao.update(e,e2);
                        v.printExpress(e2);
                    }
                }break;
                //删除
                case 3:{
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


                }break;
                //查找所有
                case 4:{
                    Express[][] data = expressDao.findAll();
                    v.printAll(data);

                }break;
            }
        }
    }

    private static void uClient() {
        //1. 获取取件码
        int code  = v.uMenu();
        //2. 根据取件码 取出快递
        Express e = expressDao.findByCode(code);
        if (e == null){
            v.printNull();
        }else {
            v.success();
            v.printExpress(e);
        }
    }
}
