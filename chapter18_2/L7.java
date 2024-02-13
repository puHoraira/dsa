package chapter18_2;

public class L7 {
    public static void main(String[] args) {

        Constructor co = new Constructor();
        co.print();
        Constructor dak = new Constructor(65, "tumi");
        dak.print();

    }
}

class Constructor {
    private int data;
    private String name;

    // non parameterized
    Constructor() {
        this.data = 5;
        this.name = "Ami";
    }

    // parameterized
    Constructor(int data, String jani) {
        this.data = data;
        this.name = jani;
    }

    void print() {
        System.err.println("Data is : " + data + " name is: " + name);
    }
}
