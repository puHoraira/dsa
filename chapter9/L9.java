package chapter9;

import java.util.Scanner;

public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = 0;
        do {
            ans = (ans * 10) + (n % 10);
            n /= 10;
        } while (n > 0);
        System.out.println(ans);
    }
}
