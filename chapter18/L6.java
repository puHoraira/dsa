package chapter18;

public class L6 {
    public static void main(String[] args) {
        Student s1 = new Student("Horaira");
        System.out.println(s1.name);
        Student s2 = new Student();
        Student s3 = new Student(123);
        s1.name = "ami";
        s1.pass = "12345567";
        s1.roll = 123;
        s1.marks[0] = 99;
        s1.marks[1] = 100;
        s1.marks[2] = 8;
        Student s4 = new Student(s1);
        s2.pass = "notun";
        for (int i = 0; i < 3; i++) {
            System.out.print(s4.marks[i] + " ");
        }
        System.out.println();
        s1.marks[2] = 1;
        for (int i = 0; i < 3; i++) {
            System.out.print(s4.marks[i] + " ");
        }
        System.out.println();
    }

}

class Student {
    String name;
    int roll;
    String pass;
    int marks[];

    // shallow copy constructor
    // Student(Student s) {
    // this.name = s.name;
    // this.roll = s.roll;
    // marks = new int[3];
    // this.marks = s.marks;
    // }
    // deep copy constructor
    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
        marks = new int[3];
        for (int i = 0; i < 3; i++) {
            marks[i] = s.marks[i];
        }
    }

    Student() {
        marks = new int[3];
    }

    Student(String name) {
        this.name = name;
        marks = new int[3];
        System.out.println("Constructor CAlled");
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
