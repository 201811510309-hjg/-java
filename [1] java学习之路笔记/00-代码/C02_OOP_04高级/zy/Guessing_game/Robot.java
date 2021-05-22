package C02_OOP_04高级.zy.Guessing_game;

public class Robot {
    private int number;

    public Robot() { }

    public Robot(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void print() {
        switch (this.number) {
            case 1:
                System.out.println("电脑出的是剪刀");
                break;
            case 2:
                System.out.println("电脑出的是石头");
                break;
            case 3:
                System.out.println("电脑出的是布");
                break;
        }
    }
}

