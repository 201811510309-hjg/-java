package KD02_MVC.bean;

import java.util.Objects;

public class Express {
    //快递单号
    private String number;
    //快递公司
    private String conpany;
    //取件码
    private int code;

    public Express(String number, String conpany, int code) {
        this.number = number;
        this.conpany = conpany;
        this.code = code;
    }

    public Express() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getConpany() {
        return conpany;
    }

    public void setConpany(String conpany) {
        this.conpany = conpany;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Express{" +
                "number='" + number + '\'' +
                ", conpany='" + conpany + '\'' +
                ", code=" + code +
                '}';
    }

    @Override    //解决比较快递问题  只认快递单号
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
