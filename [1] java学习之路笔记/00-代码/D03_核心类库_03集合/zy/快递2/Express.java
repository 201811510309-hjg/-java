package D03_核心类库_03集合.zy.快递2;

import java.util.Objects;

public class Express {
    //快递单号
    private String number;
    //快递公司
    private String company;
    //取件码
    private int code;

    public Express(int code) {
        this.code = code;
    }

    public Express() {//无参构造参数
    }

    public Express(String number, String company, int code) {//有参构造参数
        this.number = number;
        this.company = company;
        this.code = code;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Express express = (Express) o;
        return code == express.code &&
                Objects.equals(number, express.number) &&
                Objects.equals(company, express.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, company, code);
    }

    @Override
    public String toString() {
        return "com.java.Express{" +
                "number='" + number + '\'' +
                ", company='" + company + '\'' +
                ", code=" + code +
                '}';
    }
}

