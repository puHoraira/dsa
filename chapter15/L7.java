package chapter15;

import java.util.Scanner;

public class L7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        int up = 0, down = row - 1, right = col - 1, left = 0;
        while (up <= down && left <= right) {
            if (up < down && right < left) {
                System.out.print(a[up][right] + " ");
                break;
            }
            // print up
            for (int i = left; i <= right; i++) {
                System.out.print(a[up][i] + " ");
            }
            up++;

            // print right
            for (int i = up; i <= down; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            if (up <= down) {
                // print down
                for (int i = right; i >= left; i--) {
                    System.out.print(a[down][i] + " ");
                }
                down--;
            }
            if (right >= left) {
                // print left
                for (int i = down; i >= up; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
        sc.close();
    }
}