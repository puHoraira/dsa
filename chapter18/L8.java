package chapter18;

public class L8 {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.eat();
        Dogs kutta = new Dogs();
        kutta.eat();
        kutta.legs = 2;
        System.out.println(kutta.legs);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("EATS");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

class Fish extends Animal {
    int fins;

    void swims() {
        System.out.println("Swimming");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dogs extends Mammal {
    String breed;
}
