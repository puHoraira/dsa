package chapter13;

import java.util.Scanner;

public class L17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
        // int buy[] = new int[n];
        // int sell[] = new int[n];
        // for (int i = 0; i < n; i++) {
        // if (i == 0) {
        // buy[i] = a[i];
        // } else {
        // if (a[i] < buy[i - 1]) {
        // buy[i] = a[i];
        // } else
        // buy[i] = buy[i - 1];
        // }
        // }
        // for (int i = n - 1; i >= 0; i--) {
        // if (i == n - 1) {
        // sell[i] = a[i];
        // } else {
        // if (a[i] > sell[i + 1]) {
        // sell[i] = a[i];
        // } else
        // sell[i] = sell[i + 1];
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // System.out.print(buy[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < n; i++) {
        // System.out.print(sell[i] + " ");
        // }
        // System.out.println(maxi - mini);
        int buyPr = Integer.MAX_VALUE;
        int max_pr = 0;
        for (int i = 0; i < n; i++) {
            if (buyPr < a[i]) {
                int profit = a[i] - buyPr;
                max_pr = Math.max(max_pr, profit);
            } else {
                buyPr = a[i];
            }
        }
        System.out.println(max_pr);
        sc.close();
    }
}
