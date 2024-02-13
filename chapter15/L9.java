package chapter15;

import java.util.Scanner;

class Point {
    int x, y;
}

public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int key = sc.nextInt();
        Point x = find1(a, key);
        if (x.x == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at : " + x.x + "," + x.y);
        }
        Point xx = find2(a, key);
        if (xx.x == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at : " + xx.x + "," + xx.y);
        }
        find3(a, key);
        searching(a, key);
        sc.close();
    }

    public static Point find1(int a[][], int key) {
        Point po = new Point();
        po.x = -1;
        po.y = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (key == a[i][j]) {
                    po.x = i;
                    po.y = j;
                    return po;
                }
            }
        }
        return po;
    }

    public static int binarySearch(int a[], int start, int end, int key) {

        if (end >= start) {
            int mid = (start + end) / 2;

            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                return binarySearch(a, mid + 1, end, key);
            } else {
                return binarySearch(a, start, mid - 1, key);
            }
        }
        return -1;
    }

    public static Point find2(int a[][], int key) {
        Point po = new Point();
        po.x = -1;
        po.y = -1;
        for (int i = 0; i < a.length; i++) {
            int nn = binarySearch(a[i], 0, a[i].length - 1, key);
            if (nn == -1) {
                continue;
            } else {
                po.x = i;
                po.y = nn;
                return po;
            }
        }
        return po;
    }

    public static void find3(int a[][], int key) {
        int row = 0;
        int col = a[0].length - 1;
        while (row < a.length && col >= 0) {
            if (key == a[row][col]) {
                System.out.println("Found at: " + row + "," + col);
                return;
            } else if (a[row][col] > key) {
                col--;
            } else {
                row++;
            }

        }
        System.out.println("Not Found");
    }

    public static void searching(int a[][], int key) {
        int row = 0;
        int col = a[0].length - 1;
        while (row < a.length && col >= 0) {
            System.err.println(a[row][col]);
            if (key == a[row][col]) {
                System.out.println("found");
                return;
            }
            if (key > a[row][col]) {
                row++;
            } else if (key <= a[row][col]) {
                col--;
            }
        }
        System.out.println("Not Found");
    }
}
