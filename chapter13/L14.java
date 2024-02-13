package chapter13;

import java.util.Scanner;

public class L14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int cs = 0, ms = Integer.MIN_VALUE;
        int co = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                co = 1;
            }
        }
        if (co == 1) {
            for (int i = 0; i < n; i++) {
                cs = cs + a[i];
                if (cs < 0) {
                    cs = 0;
                }
                if (cs > ms) {
                    ms = cs;
                }
            }
            System.out.println(ms);
        } else {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}
