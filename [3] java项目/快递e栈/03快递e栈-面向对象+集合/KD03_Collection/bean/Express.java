package KD03_Collection.bean;


import java.util.Objects;

public class Express {
    private String number;  //快递单号
    private String conpany; //快递公司
    private int code; //取件码
    public int posX,posY; //// 快递所在快递柜中的位置

    //构造方法
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
        return Objects.hash(number);
    }
}

