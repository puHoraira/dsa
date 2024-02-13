package chapter16;

import java.util.Scanner;

public class L7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, s = 0, e = 0, w = 0;
        String ss = sc.nextLine();
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) == 'N') {
                n++;
            }
            if (ss.charAt(i) == 'S') {
                s++;
            }
            if (ss.charAt(i) == 'E') {
                e++;
            }
            if (ss.charAt(i) == 'W') {
                w++;
            }
        }
        double ans = Math.sqrt(Math.pow(n - s, 2) + Math.pow(w - e, 2));
        System.out.println(ans);
        sc.close();
    }
}
