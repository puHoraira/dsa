package chapter13;

import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int x = find(a, n);
        if (x == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found at: " + x);
        String s[] = new String[5];

        sc.nextLine();// next line k nilam

        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }
        String sb = sc.nextLine();
        x = find(s, sb);
        if (x == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found at: " + x);
        sc.close();
    }

    public static int find(String a[], String n) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        return -1;
    }

    public static int find(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
