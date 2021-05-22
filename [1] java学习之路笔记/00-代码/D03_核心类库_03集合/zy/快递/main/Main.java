package D03_核心类库_03集合.zy.快递.main;

import D03_核心类库_03集合.zy.快递.bean.Express;
import D03_核心类库_03集合.zy.快递.dao.Dao;
import D03_核心类库_03集合.zy.快递.view.View;

import java.util.List;

public class Main {
    private static Dao dao; //增删改查方法
    private static View view;//操作界面
    public static void main(String[] args) {
        init();
        login();
    }
    //初始化
    public static void init(){
        dao = new Dao();
        view = new View();
    }
    //权限选择
    public static void login(){
        o: while (true){
            int num = -1;
            num = view.login();
            switch (num){
                case 0://退出
                    break o;
                case 1://快递员
                    adminLogin();
                    break ;
                case 2://用户
                    userLogin();
                    break ;
                default:
                    view.choiceError();
                    break ;
            }
        }
    }

    private static void userLogin() {
        q:while (true){
            int num = -1;
            num = view.userLogin();
            switch (num){
                case 0:
                    break q;
                case 1:
                    int code = view.getExpress();
                    Express e = dao.getByCode(code);
                    if (e!=null){
                        view.address(dao.getIndex(e));//输出位置
                        view.printExpress(e);//输出快递信息
                        view.printGet();//取件提醒
                        //删除对应快递
                        if (dao.delete(e)){
                            //单独 删除取件码
                            view.deleteCode(e.getCode());
                            view.getSuccess();
                        }else {
                            view.getFail();
                        }
                    }else {
                        view.error();
                    }
                    break ;
                default:
                    view.choiceError();
                    break ;
            }
        }
    }

    private static void adminLogin() {
        p:while (true){
            int num = -1;
            num = view.adminLogin();
            switch (num){
                case 0://结束
                    break p;
                case 1://添加
                    insert();
                    break ;
                case 2://删除
                    delete();
                    break;
                case 3://修改
                    update();
                    break ;
                case 4://打印
                    printAll();
                    break;
                default:
                    view.choiceError();
                    break ;
            }
        }
    }

    private static void printAll() {
        List<Express> list = dao.getList();
        if (list.size()>0){
            view.printAllExpress(list);
        }else {
            view.nullExpress();
        }
    }

    private static void update() {
        String update = view.update();
        //从快递单号修改
        Express e = dao.getByNumber(update);
        if (e!=null){
            view.printExpress(e);
            Express e2 = view.newUpdate();
            if (dao.update(e,e2)){
                view.updateSuccess();
                //同理code单独存放在集合中，需要删除
                view.deleteCode(e.getCode());
            }else {
                view.updateFail();
            }
        }else {
            view.error();
        }
    }

    private static void delete() {
        String delete = view.delete();
        Express byNumber = dao.getByNumber(delete);
        if (byNumber != null){//判断快递是否存在
            int confirm = view.deleteConfirm();
            switch (confirm){
                case 1:
                    if (dao.delete(byNumber)){
                        view.deleteSuccess();
                        //取件码单独存放，把取件码从集合中删除
                        view.deleteCode(byNumber.getCode());
                    }else {
                        view.deleteFail();
                    }
                    break;
                case 2:
                    break;
                default:
                    view.choiceError();
                    break;
            }
        }else {
            view.error();
        }
    }

    private static void insert() {
        Express e = view.insert();
        //判断是否存在
        if (dao.getByNumber(e.getId())!=null){
            view.repeat();
        }else {
            //没有快递，开始存
            if (dao.insert(e)){
                view.success();
                view.printExpress(e);
            }else {
                //添加失败
                view.fail();
            }
        }
    }
}


