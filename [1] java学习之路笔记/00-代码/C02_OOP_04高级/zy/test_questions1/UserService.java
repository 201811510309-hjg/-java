package C02_OOP_04高级.zy.test_questions1;

public class UserService {
    private String account_number = "admin";
    private String password = "123";

    boolean login(String a,String b){
        if (this.account_number.equals(a)  && this.password.equals(b)){
            System.out.println("输入正确，正在登入。。。");
            return true;
        }else {
            System.out.println("输入有误");
            return false;
        }
    }
}
