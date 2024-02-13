package chapter18;

public class Practice {
    public static void main(String[] args) {
        Fish a = new Fish();
        a.eat();
    }

}

class Animal {
    void eat() {
        System.out.println("Eats");
    }
}

class Fish extends Animal {
    void eat() {
        System.out.println("Eats rice");
    }
}

class Bird extends Animal {

}

class Mammal extends Animal {

}

class Tuna extends Fish {

}

class Shark extends Fish {

}

class Robin extends Bird {

}

class Dog extends Mammal {

}

class Human extends Dog {

}
