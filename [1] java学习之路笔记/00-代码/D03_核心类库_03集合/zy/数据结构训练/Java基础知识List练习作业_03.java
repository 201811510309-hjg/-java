package D03_核心类库_03集合.zy.数据结构训练;

/*3、请随机生成一注双色球号码。（要求同色号码不重复）。双色球规则：双色球每注投注号码由 6 个红色 球号码和 1 个蓝色球号码组成。
        红色球号码从 1—33 中选择；蓝色球号码从 1—16 中选择；*/

import java.util.HashSet;
import java.util.Set;

public class Java基础知识List练习作业_03 {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        while(set1.size() < 6) {
            set1.add((int)(Math.random()*33+1)+" ");
        }
        set2.add((int)(Math.random()*16+1)+"");
        System.out.println("红色："+set1+"蓝色："+set2);

    }

}

