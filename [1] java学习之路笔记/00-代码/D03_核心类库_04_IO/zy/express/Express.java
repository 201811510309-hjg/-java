package D03_核心类库_04_IO.zy.express;

import java.io.Serializable;
import java.util.Objects;

public class Express implements Serializable {
    //快递信息
    private String number;//快递编号
    private String company; //快递公司
    private int code; //取件码

    public Express() {}
    public Express(String number, String company, int code) {
        this.number = number;
        this.company = company;
        this.code = code;
    }

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

    @Override
    public String toString() {
        return "快递信息： " +
                "快递单号： " + number +
                ", 快递公司： " + company  +
                ", 取件码： " + code ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Express express = (Express) o;
        return Objects.equals(number, express.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

