package chapter15;

import java.util.Scanner;

public class L8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        do {
            row = sc.nextInt();
            col = sc.nextInt();
        } while (row != col);
        int ans = 0;
        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int ans2 = 0;
        for (int i = 0; i < row; i++) {
            ans += a[i][i];
            ans2 += a[i][row - i - 1];
        }
        System.out.println(ans + " " + ans2 + " ");
        sc.close();
    }
}