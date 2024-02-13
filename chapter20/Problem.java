package chapter20;

import java.util.Scanner;

public class Problem {
    public static void main(String mnkk[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        sc.close();
        System.out.println(finding(a, 0, n - 1, key));
    }

    static int finding(int a[], int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (a[mid] == key) {
            return mid;
        }
        // mid ache L1
        if (a[start] <= a[mid]) {
            if (a[start] <= key && key <= a[mid]) {
                return finding(a, start, mid - 1, key);
            } else
                return finding(a, mid + 1, end, key);
        } else {
            if (a[mid] <= key && key <= a[end]) {
                return finding(a, mid + 1, end, key);
            } else
                return finding(a, start, mid - 1, key);
        }
    }
}
