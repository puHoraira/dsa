package chapter20;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        merging(a, 0, a.length - 1);
        printArray(a);
        sc.close();

    }

    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void merging(int a[], int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;
            merging(a, st, mid);
            merging(a, mid + 1, end);
            merge(a, st, mid, end);
        }
    }

    static void merge(int a[], int st, int mid, int end) {
        int i = st;
        int j = mid + 1;
        int k = 0;
        int tm[] = new int[end - st + 1];
        while (i <= mid && j <= end) {
            if (a[i] > a[j]) {
                tm[k++] = a[j++];
            } else {
                tm[k++] = a[i++];
            }
        }
        while (i <= mid) {
            tm[k++] = a[i++];
        }
        while (j <= end) {
            tm[k++] = a[j++];
        }
        for (i = 0; i < tm.length; i++) {
            a[st + i] = tm[i];
        }
        printArray(a);
    }
}
