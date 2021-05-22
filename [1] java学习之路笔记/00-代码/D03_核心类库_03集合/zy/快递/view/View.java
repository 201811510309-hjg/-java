package D03_核心类库_03集合.zy.快递.view;

import D03_核心类库_03集合.zy.快递.bean.Express;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class View {
    private Scanner input = new Scanner(System.in);
    //随机码
    private Random random = new Random();
    //取件码是否重复的集合
    private List<Integer> list = new ArrayList<>();
    //欢迎
    public void welcom(){
        System.out.println("---欢迎使用---");
    }
    //结束
    public void end(){
        System.out.println("欢迎再次使用！");
    }
    //接收用户输入
    public int input(){
        while (true){
            int num = -1;
            try {
                num = input.nextInt();
                return num;
            }catch (Exception e){
                System.out.println("请输入正确序号");
                input.nextLine();
            }
        }
    }
    //打印
    public void printExpress(Express e){
        System.out.println("快递单号："+e.getId()+" 快递公司："+e.getCompany()+" 取件码："+e.getCode());
    }
    //输入有误
    public void error(){
        System.out.println("你输入的信息有误，快递不存在，请重新输入");
    }
    //输入选项有误
    public void choiceError(){
        System.out.println("你输入的信息有误，快递不存在，请重新输入");
    }
    //快递为空
    public void nullExpress(){
        System.out.println("当前快递为空");
    }
    //随机码生产取件码
    public int code(){
        while (true){
            int isRepeat = 0;
            int code = (int) (random.nextInt(900000)+100000);
            //拿集合中的取件码和生产的对比是否重复
            for (int i = 0;i < list.size();i++){
                if (list.get(i) == code){
                    isRepeat++;
                }
            }
            if (isRepeat==0){
                list.add(code);
                return code;
            }
        }
    }
    //登录
    public int login(){
        System.out.println("请选择登录用户");
        System.out.println("---1.管理员登录-----");
        System.out.println("---2.用户登录-------");
        System.out.println("---0.退出-----------");
        return input();
    }
    //管理员界面
    public int adminLogin(){
        System.out.println("---请选择要进行的操作---");
        System.out.println("---1.快递录入----------");
        System.out.println("---2.删除快递----------");
        System.out.println("---3.修改快递----------");
        System.out.println("---4.查看所有快递------");
        System.out.println("---0.返回上级目录------");
        return input();
    }
    //快递录入
    public Express insert(){
        System.out.println("请输入快递单号：");
        String number = input.next();
        System.out.println("请输入快递公司：");
        String company = input.next();
        //自定义取件码变量，并把随机生产的取件码赋给它
        int code = code();
        Express e = new Express(number,company,code());
        return e;
    }
    //重复录入
    public void repeat(){
        System.out.println("快递已存在！");
    }
    //录入成功
    public void success(){
        System.out.println("快递录入成功");
    }
    //录入失败
    public void fail(){
        System.out.println("快递录入失败");
    }
    //快递删除,根据快递单删除
    public String delete(){
        System.out.println("请输入要删除的快递单号");
        String delNumber = input.next();
        return delNumber;
    }
    //确认删除
    public int deleteConfirm(){
        System.out.println("---是否确认删除该快递---");
        System.out.println("---1.是---------------");
        System.out.println("---2.否---------------");
        return input();
    }
    //删除成功
    public void deleteSuccess(){
        System.out.println("快递删除成功");
    }
    //删除失败
    public void deleteFail(){
        System.out.println("快递删除失败");
    }
    //修改快递
    public String update(){
        System.out.println("---请输入需要修改的快递单号---");
        String number = input.next();
        return number;
    }
    //新的数据
    public Express newUpdate(){
        System.out.println("---请输入新的快递单号---");
        String number = input.next();
        System.out.println("---请输入新的快递公司---");
        String company = input.next();
        int code = code();
        Express e = new Express(number,company,code);
        return e;
    }
    //修改成功
    public void updateSuccess(){
        System.out.println("修改成功");
    }
    //修改失败
    public void updateFail(){
        System.out.println("修改失败");
    }
    //查询所有快递
    public void printAllExpress(List<Express> list){
        //遍历集合输出所有元素
        for (Express e :list){
            System.out.println(e);
        }
    }
    //用户界面
    public int userLogin(){
        System.out.println("---请选择要进行的操作---");
        System.out.println("---1.快递取出----------");
        System.out.println("---0.返回上级目录------");
        return input();
    }
    //取快递
    public int getExpress(){
        System.out.println("请输入取件码：");
        return input();
    }
    //快递柜位置
    public void address(int index){
        System.out.println("快递在"+index+"号快递柜");
    }
    //删除取件码
    public void deleteCode(int code){
        list.remove((Integer) code);
    }
    //取件提醒
    public void printGet(){
        System.out.println("请尽快取出快递！");
    }
    //取件失败
    public void getFail(){
        System.out.println("取件失败！");
    }
    //取件成功
    public void getSuccess(){
        System.out.println("取件成功！");
    }
}


