package 问题解决.鱼C_java_课堂.使用对象;

/*
 * 负责创建对象的类
 */
public class FishcPeople{

    PersonName name;
    float height,weight;
    String head;

    void speak(String s){
        if(name == PersonName.小甲鱼){
            head = "美男头";
        }
        else if(name == PersonName.拈花小仙){
            head = "美女头";
        }
        System.out.println(s);
    }

}
