package C02_OOP_07设计模式.a_principle.f_lod;

public class Client {
    public static void main(String[] args) {
        Agent agent=new Agent();
        agent.setStar(new Star("迪丽热巴"));
        agent.setFans(new Fans("小九"));
        agent.meeting();
        agent.setCompany(new Company("荔枝电视台"));
        agent.business();
    }
}



class Agent{
    private Star star;
    private Fans fans;
    private Company company;

    public void meeting(){
        System.out.println(this.fans.getName()+"与明星"+this.star.getName()+"见面啦");
    }

    public void business(){
        System.out.println(this.company.getName()+"与明星"+this.star.getName()+"商谈合作");
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
class Star{
    private  String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Fans{
    private  String name;

    public Fans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Company{
    private  String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}