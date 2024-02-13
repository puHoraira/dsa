package chapter23;

import java.util.*;

public class L14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            a.add(c);
        }
        int key = sc.nextInt();
        Collections.sort(a);
        int lp = 0, rp = n - 1;
        while (lp < rp) {
            int ans = a.get(lp) + a.get(rp);
            if (ans == key) {
                System.out.println("Yes pos: " + lp + " and " + rp);
            }
            if (ans < key) {
                lp++;
            } else {
                rp--;
            }
        }
        sc.close();
    }
}
