package chapter13;

import java.util.Scanner;

public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        swapArray(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        swapArray2(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sc.close();
    }

    public static void swapArray(int a[]) {
        for (int i = 0; i < a.length / 2; i++) {
            int tm = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tm;
        }
    }

    public static void swapArray2(int a[]) {
        int first = 0, last = a.length - 1;
        while (first < last) {
            int tm = a[first];
            a[first] = a[last];
            a[last] = tm;
            first++;
            last--;
        }
    }
}
