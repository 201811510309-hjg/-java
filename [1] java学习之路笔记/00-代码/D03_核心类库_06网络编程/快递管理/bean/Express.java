package D03_核心类库_06网络编程.快递管理.bean;



import java.io.Serializable;
import java.util.Objects;

/**
 *
 */
public class Express implements Serializable {
    private String number;  // 快递单号
    private String company; // 公司
    private int code;       // 取件码
    public int posX, posY;  // 快递所在快递柜中的位置

    // 构造方法
    public Express(String number, String company, int code) {
        this.number = number;
        this.company = company;
        this.code = code;
    }

    public Express() {
    }

    // getter/setter

    public String getNumber() {
        return number;
    }

    public String getCompany() {
        return company;
    }

    public int getCode() {
        return code;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCode(int code) {
        this.code = code;
    }

    // 重写toString 方法

    @Override
    public String toString() {
        return "Express{" +
                "number='" + number + '\'' +
                ", company='" + company + '\'' +
                ", code=" + code +
                '}';
    }

    // 重写equals方法

    /**
     * 只要快递单号相同就认为快递相同
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Express express = (Express) o;
        return Objects.equals(number, express.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}