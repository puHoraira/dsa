package janiNaKIsu;

import java.util.*;

public class EtoPoreKiHobe {
    static void mergeSort(int a[], int start, int end) {
        if (start < end) {
            int mid = start + ((end - start) / 2);
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, end, mid);
        }
    }

    static void merge(int a[], int start, int end, int mid) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int x[] = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                x[k++] = a[i++];
            } else {
                x[k++] = a[j++];
            }
        }
        while (i <= mid) {
            x[k++] = a[i++];
        }
        while (j <= end) {
            x[k++] = a[j++];
        }
        for (k = 0; k < x.length; k++) {
            a[k + start] = x[k];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            mergeSort(a, 0, n - 1);
            for (int j = 0; j < n; j++) {
                System.out.println(a[j]);
            }
        }
        sc.close();
    }
}