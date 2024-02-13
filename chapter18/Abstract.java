package chapter18;

public class Abstract {
    public static void main(String[] args) {

        Hores h = new Hores();
        Chicken c = new Chicken();
        // Animal a = new Animal();=======not possible
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("abstract method");
    }

    abstract void walk();
}

class Hores extends Animal {
    void changeColor() {
        color = "dark";
    }

    void walk() {
        System.out.println("walk fast");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walk slow");
    }

    void changeColor() {
        color = "dfark";
    }
}