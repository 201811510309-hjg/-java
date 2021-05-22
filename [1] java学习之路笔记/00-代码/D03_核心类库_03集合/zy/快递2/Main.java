package D03_核心类库_03集合.zy.快递2;

import java.util.ArrayList;

public class Main {
    //初始化视图对象
    private View1 view = new View1();
    private ExpressOp op = new ExpressOp();
    private ArrayList<Express> expressList = new ArrayList<>();

    public void op(){
        //欢迎
        view.welcome();
        //身份菜单

        m:while(true){
            int menu = view.menu();
            switch (menu){
                case 1:
                    cClient();
                    break;
                case 2:
                    uClient();
                    break;
                case 0:
                    break m;
            }
        }
        view.bye();
    }


    private  void uClient() {
        //获取取件码
        int code = view.uMenu();
        //取快递
        int result = op.findByCode(expressList,code);
        if(result == -1){
            System.out.println("取件码错误！");;
        }else{
            System.out.println("取件成功");;
        }
    }

    private void cClient() {
        int menu = view.cMenu();
        switch (menu){
            case 0:
                return;
            /**
             * 存快递
             */
            case 1: {

                //生成快递信息
                Express e = op.create();

                //添加快递
                expressList = op.insertOp(expressList, e);

                //打印快递信息
                op.printExpressInfo(e);
            }
            break;

            /**
             * 删快递
             */
            case 2:{
                //输入快递单号
                String number = op.inputNumber();
                //查找
                int result = op.findByNumber(expressList, number);

                if (result == -1){
                    System.out.println("快递不存在，请检查输入是否正确！");
                }else{
                    System.out.println("所要删除的快递信息");
                    op.printExpressInfo(expressList.get(result));
                }

                //删除
                expressList.remove(result);
                System.out.println("快递已删除");
            }

            /**
             * 修改
             */
            case 3:{
                //修改
                String number = op.inputNumber();
                //查找
                int result = op.findByNumber(expressList, number);

                if(result == -1){
                    System.out.println("快递不存在，请检查输入是否正确！");
                }else{
                    System.out.println("所要修改的快递信息");
                    op.printExpressInfo(expressList.get(result));
                    Express e = op.newCreat();
                    expressList.set(result, e);
                    System.out.println("快递已更改");
                    System.out.println("更改之后的快递信息");
                    op.printExpressInfo(e);
                }
            }
            break;
            /**
             * 查看所有
             */
            case 4:{
                //查看所有
                System.out.println("快递单号\t" + "快递公司\t" + "取件码") ;
                for (Express express: expressList) {
                    if (express != null){
                        System.out.println(express.getNumber() + "\t\t" + express.getCompany() + "\t\t" +  express.getCode());
                    }
                }
                break;
            }
        }
    }
}

