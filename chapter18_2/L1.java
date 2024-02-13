package chapter18_2;

public class L1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        System.out.println(p1.color);
        p1.setColor("Holud");
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercent(int phy, int che, int bio) {
        this.percentage = (phy + che + bio) / 3;
    }
}
