package chapter23;

import java.util.*;

public class L15 {
    public static void main(String aeeeeeee[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.add(x);
        }
        int keuy = sc.nextInt();
        int pv = 0;
        for (int i = 1; i < n; i++) {
            if (a.get(i) < a.get(i - 1)) {
                pv = i;
            }
        }
        int max = 0;
        if (pv == 0) {
            max = n - 1;
        } else {
            max = pv - 1;
        }
        System.out.println(pv + " " + max);
        int lp = pv, rp = max;
        while (lp != rp) {
            if (a.get(lp) + a.get(rp) == keuy) {
                System.out.println("Found at: " + lp + " and " + rp);
            }
            if (a.get(lp) + a.get(rp) < keuy) {
                lp++;
            } else {
                rp--;
                if (rp < 0) {
                    rp = n - 1;
                }
            }
        }
        sc.close();

    }
}
