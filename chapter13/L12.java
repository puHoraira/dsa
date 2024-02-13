package chapter13;

import java.util.Scanner;

public class L12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = Integer.MIN_VALUE;
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans_st = 0, ans_en = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tm = 0;
                for (int k = i; k <= j; k++) {
                    tm += a[k];
                    System.out.print(a[k] + " ");
                }
                if (tm > ans) {
                    ans = tm;
                    ans_st = i;
                    ans_en = j;
                }
                System.out.println();
            }
        }
        System.out.println(ans);
        for (int i = ans_st; i <= ans_en; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
