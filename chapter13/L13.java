package chapter13;

import java.util.Scanner;

public class L13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        b[0] = a[0];
        for (int i = 1; i < n; i++) {
            b[i] = a[i] + b[i - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        int ans = 0;
        int ans_st = 0, ans_en = 0;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                int tm = (start == 0 ? b[end] : b[end] - b[start - 1]);
                if (tm > ans) {
                    ans = tm;
                    ans_st = start;
                    ans_en = end;
                }
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
