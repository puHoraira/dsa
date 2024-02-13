package chapter6;

import java.util.Scanner;

public class L12 {
    public static void main(String[] args) {
        float a, b;
        Scanner sca = new Scanner(System.in);
        a = sca.nextFloat();
        b = 3.14159f;
        System.out.println(a * b * a);
        sca.close();
    }
}
