package chapter9;

import java.util.Scanner;

public class L8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        do {
            System.out.print(n % 10);
            n /= 10;
        } while (n > 0);
    }
}
