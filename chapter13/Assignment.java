package chapter13;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        System.out.println(sol1());
        // sol2();
        // sol3();
        // sol4();
        // sol5();
    }

    public static boolean sol1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean sol2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;

    }
}
