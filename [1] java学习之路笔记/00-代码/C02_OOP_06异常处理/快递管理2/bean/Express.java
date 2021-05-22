package C02_OOP_06异常处理.快递管理2.bean;

import java.util.Objects;

/**
 * 快递
 */
public class Express {
    //快递单号
    private String number;
    //快递公司
    private String company;
    //取件码
    private int code;


    public Express(String number, String company, int code) {
        this.number = number;
        this.company = company;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Express{" +
                "number='" + number + '\'' +
                ", company='" + company + '\'' +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Express express = (Express) o;
        return code == express.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    public Express() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
