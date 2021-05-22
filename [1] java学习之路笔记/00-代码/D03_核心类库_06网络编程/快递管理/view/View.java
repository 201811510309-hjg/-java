package D03_核心类库_06网络编程.快递管理.view;


import D03_核心类库_06网络编程.快递管理.bean.Express;

import java.util.List;
import java.util.Scanner;

/**
 * 视图层
 * 只负责展示视图 不包含其他任何逻辑
 */
public class View {
    public Scanner input = new Scanner(System.in);

    /**
     * 获得用户的角色选择输入，并进入相应的功能
     * @return 返回功能码 1：管理员 2：普通用户 0：退出
     */
    public int menu(){
        System.out.println("根据提示输入功能序号：");
        System.out.println("1,管理员");
        System.out.println("2,普通用户");
        System.out.println("0,退出");
        String s = input.nextLine();
        int funcNum = -1;
        try{
            funcNum = Integer.parseInt(s);
        }catch (NumberFormatException e){   // 格式异常 递归继续获取功能码
            return menu();
        }
        if(funcNum < 0 || funcNum > 2){     // 功能码不合法
            return menu();
        }
        return funcNum;
    }

    /*
    -----------------------------------------------------------------
     */

    /**
     * 获得管理员输入的功能码
     * @return 管理员输入的合法功能码 1：录入 2：修改 3：删除 4：查看所有 0：退出
     */
    public int gMenu(){
        System.out.println("根据提示输入功能序号：");
        System.out.println("1,快递录入");
        System.out.println("2,快递修改");
        System.out.println("3,快递删除");
        System.out.println("4,查看所有快递");
        System.out.println("0,退出");
        String s = input.nextLine();
        int funcNum = -1;
        try{
            funcNum = Integer.parseInt(s);
        }catch (NumberFormatException e){   // 格式异常 递归继续获取功能码
            return gMenu();
        }
        if(funcNum < 0 || funcNum > 4){     // 功能码不合法
            return gMenu();
        }
        return funcNum;
    }

    /**
     * 1快递员录入信息
     * @return 返回包含了快递单号和快递公司的快递对象
     */
    public Express insert(){
        System.out.println("请根据提示输入快递信息：");
        System.out.print("请输入快递单号：");
        String number = input.nextLine();
        System.out.print("请输入快递公司：");
        String company = input.nextLine();
        Express e = new Express();
        e.setNumber(number);
        e.setCompany(company);
        return e;
    }

    /**
     * 2修改快递信息
     */
    public Express update(){
        System.out.print("请输入新的快递单号：");
        String number = input.nextLine();
        System.out.print("请输入新的快递公司");
        String company = input.nextLine();
        Express e = new Express();
        e.setNumber(number);
        e.setCompany(company);
        return e;
    }

    /**
     * 3询问是否删除
     * @return 给出快递管理员的选择 1：删除 2：取消
     */
    public int delete(){
        System.out.println("确认是否删除：");
        System.out.println("1,确认删除");
        System.out.println("2,取消删除");
        System.out.println("0,退出");
        String s = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(s);
        }catch (NumberFormatException e){
            return delete();
        }
        if(num < 0 || num > 2){
            return delete();
        }
        return num;
    }

    /**
     * 4遍历显示所有快递信息
     * @param es
     */
    public void printAll(List<Express> es){
        int count = 0;
        for(Express e : es) {
            count++;
            printExpress(e);
        }
        if(count == 0){
            System.out.println("暂无快递信息");
        }
    }

    /**
     * 提示用户输入快递单号
     * @return
     */
    public String findByNumber(){
        System.out.println("请根据提示输入快递信息：");
        System.out.print("请输入需要操作的快递单号：");
        String number = input.nextLine();
        return number;
    }

    /**
     * 显示快递信息
     * @param e
     */
    public void printExpress(Express e){
        if(e == null){
            System.out.println("快递信息不存在");
            return;
        }
        System.out.println("快递信息如下：");
        System.out.println("位置：第" + (e.posX + 1) + "排，" + (e.posY + 1) + "列; " +
                "快递公司：" + e.getCompany() + "; " + "快递单号：" + e.getNumber() + ";" +
                "取件码：" + e.getCode() + ";");
    }


    /*
    -----------------------------------------------------------------
     */

    /**
     * 获得用户输入的取件码（这里简化，只要取件码相同，就算取件成功）
     * @return 用户输入的合法功能码(6位)
     */
    public int uMenu(){
        System.out.println("根据提示输入功能序号：");
        System.out.println("0,退出");
        System.out.println("1,取出快递");
        String s = input.nextLine();
        int funcNum = -1;
        try{
            funcNum = Integer.parseInt(s);
        }catch (NumberFormatException e){   // 格式异常 递归继续获取功能码
            System.out.println("格式异常");
            return uMenu();
        }
        if(funcNum < 0 || funcNum > 1){     // 功能码不合法
            System.out.println("功能码不合法");
            return uMenu();
        }
        return funcNum;
    }

    /**
     * 用户取件
     * @return
     */
    public int getExpress() {
        System.out.println("根据提示进行取件：");
        System.out.print("请输入取件码：");
        String s = input.nextLine();
        int code = -1;
        try{
            code = Integer.parseInt(s);
        }catch (NumberFormatException e){   // 格式异常 递归继续获取功能码
            System.out.println("格式异常");
            return getExpress();
        }
        if(code < 100000 || code > 999999){     // 功能码不合法
            System.out.println("输入有误，请重试！");
            return getExpress();
        }
        return code;
    }

    public void expressExist(){
        System.out.println("此快递单号已存在，请勿重复存储");
    }
    public void printCode(Express e) {
        System.out.println("新快递的取件码为：" + e.getCode());
    }
    public void success(){
        System.out.println("操作成功！");
    }
    public void fail(){
        System.out.println("操作失败！");
    }
    public void choiceError() {
        System.out.println("输入选项有误，请重新输入！");
    }
    public void printNull(){
        System.out.println("快递不存在，请检查输入");
    }
    public void connectSuccess() {
        System.out.println("服务器连接成功");
    }
}