package D03_核心类库_03集合.zy.快递2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExpressOp {

    private Scanner sc = new Scanner(System.in);
    //存快递
    public Express create(){
        System.out.println("请输入快递单号：");
        String number = sc.nextLine();
        System.out.println("请输入快递公司：");
        String company = sc.nextLine();
        Express e = new Express();
        e.setNumber(number);
        e.setCompany(company);
        e.setCode(randomCode());
        return e;
    }
    //修改   存新快递
    public Express newCreat(){
        System.out.println("请输入新的快递单号");
        String number = sc.nextLine();
        System.out.println("请输入新的快递公司");
        String company = sc.nextLine();
        Express e = new Express();
        e.setNumber(number);
        e.setCompany(company);
        e.setCode(randomCode());
        return e;
    }

    public ArrayList<Express> insertOp(ArrayList<Express> expressArrayList, Express express){
        int result = findByNumber(expressArrayList, express.getNumber());
        if (result == -1){
            expressArrayList.add(express);
        }else {
            System.out.println("单号已存在，请重新输入");
        }

        return expressArrayList;
    }
    //判断是否存在并打印快递信息
    public void printExpressInfo(Express express){
        if (express == null){
            System.out.println("快递不存在，请检查输入是否正确！");
        }else{
            System.out.println("快递单号:" + express.getNumber());
            System.out.println("快递公司:" + express.getCompany());
            System.out.println(" 取件码: " + express.getCode());
        }
    }

    /**
     *判断快递单号
     * */
    public int findByNumber(ArrayList<Express> expressList, String number){
        for (int i = 0; i < expressList.size(); i++){
            if (expressList.get(i) != null){
                if (expressList.get(i).getNumber() == number || expressList.get(i).getNumber().equals(number)){
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     *判断取件码
     * */
    public int  findByCode(ArrayList<Express> expressList,int code){
        for (int i = 0;i < expressList.size();i++){
            if(expressList.get(i) != null){
                if(expressList.get(i).getCode() == code || expressList.get(i).equals(code)){
                    return i;
                }
            }
        }
        return -1;
    }
    //输入快递单号
    public String inputNumber(){

        System.out.println("请根据提示完成操作：");
        System.out.println("请输入快递单号：");
        String number = sc.nextLine();
        return number;
    }

    private int randomCode(){
        //0-899999+100000
        Random random = new Random();
        while(true){
            int code = random.nextInt(900000)+100000;
            return code;
        }
    }
}

