package D03_核心类库_03集合.zy.快递.bean;

import java.util.Objects;

public class Express {
    //快递单号
    private String id;
    //快递公司
    private String company;
    //取件码
    private int code;

    @Override
    public String toString() {
        return "Express{" +
                "id='" + id + '\'' +
                ", company='" + company + '\'' +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Express express = (Express) o;
        return code == express.code &&
                Objects.equals(id, express.id) &&
                Objects.equals(company, express.company);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, company, code);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Express(String id, String company, int code) {
        this.id = id;
        this.company = company;
        this.code = code;
    }

    public Express() {
    }
}



