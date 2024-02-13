package chapter20;

import java.util.Scanner;

public class Quick {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        sorting(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void sorting(int a[], int start, int end) {

        if (start >= end) {
            return;
        }
        int idx = partition(a, start, end);
        sorting(a, start, idx - 1);
        sorting(a, idx + 1, end);
    }

    public static int partition(int a[], int start, int end) {
        int pivot = a[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (a[j] <= pivot) {
                i++;
                int tm = a[j];
                a[j] = a[i];
                a[i] = tm;
            }
        }
        i++;
        a[end] = a[i];
        a[i] = pivot;
        return i;
    }
}