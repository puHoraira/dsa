package chapter9;

import java.util.Scanner;

public class L15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while (i != n) {
            if (n % i == 0) {
                sc.close();
                System.out.println("Not prime");
                return;
            }
            i++;
        }
        System.out.println("prime");
        sc.close();
    }
}
