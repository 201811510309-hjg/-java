package D03_核心类库_02常用类库.敲敲敲.kkb;
//指定类型
public class D2_main1 implements D2_IntercaceName<String>{
    private String text;

    @Override
    public String getData() {
        return text;
    }
}
