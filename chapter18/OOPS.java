package chapter18;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object named p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.color = "green";
        System.out.println(p1.color);
    }
}

class Pen {
    // prop + func
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
