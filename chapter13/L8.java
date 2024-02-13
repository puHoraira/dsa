package chapter13;

import java.util.Scanner;

public class L8 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 33 };
        binarySearch(a);
    }

    public static void binarySearch(int a[]) {
        int st = 0, end = a.length - 1;
        Scanner sc = new Scanner(System.in);
        int find = sc.nextInt();
        sc.close();
        while (st <= end) {
            int mid = (st + end) / 2;
            if (a[mid] == find) {
                System.out.println("Found at: " + mid);
                return;
            } else if (a[mid] < find) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Not Foundddd");
        return;
    }
}
