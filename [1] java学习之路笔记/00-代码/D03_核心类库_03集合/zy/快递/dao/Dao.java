package D03_核心类库_03集合.zy.快递.dao;

import D03_核心类库_03集合.zy.快递.bean.Express;

import java.util.ArrayList;
import java.util.List;

public class Dao {
    //创建集合对象
    private List<Express> list = new ArrayList<>();

    //数据录入
    public boolean insert(Express e){
        //添加到集合中
        list.add(e);
        return true;
    }

    //删除数据
    public boolean delete(Express e){
        return  list.remove(e);
    }

    //修改
    public boolean update(Express e1,Express e2){
        //删除旧的
        list.remove(e1);
        //添加新的
        list.add(e2);
        return true;
    }

    //查询所有数据
    public List<Express> getList(){
        return list;
    }

    //数据查询，根据快递单号查询
    public Express getByNumber(String number){
        //增强for循环
        for (Express e:list){
            if (number.equals(e.getId())){
                return e;
            }
        }
        return null;
    }
    //数据查询，根据取件码查询
    public Express getByCode(int code){
        //遍历获取集合中所有元素，拿集合中的取件码和输入的取件对比
        for (Express e:list){
            if (e.getCode() == code){
                return e;
            }
        }
        return null;
    }
    //获取位置
    public int getIndex(Express e){
        return list.indexOf(e)+1;
    }
}




