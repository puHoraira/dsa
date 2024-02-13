package chapter13;

import java.util.Scanner;

public class L16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        int left[] = new int[n + 1];
        int right[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                left[i] = a[i];
            } else {
                if (a[i] > left[i - 1]) {
                    left[i] = a[i];
                } else {
                    left[i] = left[i - 1];
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                right[i] = a[i];
            } else {
                if (a[i] > right[i + 1]) {
                    right[i] = a[i];
                } else {
                    right[i] = right[i + 1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(right[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            ans += min(right[i], left[i]) - a[i];
        }
        System.out.println(ans);
        sc.close();
    }

    public static int min(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }
}
