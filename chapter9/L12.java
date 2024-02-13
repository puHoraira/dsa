package chapter9;

import java.util.Scanner;

public class L12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println(n);
                break;
            }
        }
        sc.close();
    }
}
