package chapter23;

import java.util.*;

public class L11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ar.add(x);
        }
        int lp = 0, rp = n - 1, max = 0;
        while (lp < rp) {
            max = Integer.max(max, Math.min(ar.get(lp), ar.get(rp)) * (rp - lp));
            if (ar.get(lp) < ar.get(rp)) {
                lp++;
            } else
                rp--;
        }
        System.out.println(max);
        sc.close();
    }
}
