package chapter23;

public class L10_2 {
    public static void main(String arafa[]) {
        int a[] = { 2, 1, 7, 9, 2, 9, 4, 8, 3, 7 };
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                ans = Integer.max(ans, (j - i) * Integer.min(a[i], a[j]));
            }
        }
        System.out.println(ans);
        // ==========================AnotherApproach===========================//
        ans = 0;
        int rp = a.length - 1;
        int lp = 0;
        while (rp != lp) {
            ans = Integer.max(ans, Integer.min(a[rp], a[lp]) * (rp - lp));
            if (a[rp] < a[lp]) {
                rp--;
            } else {
                lp++;
            }
        }
        System.out.println(ans);
    }
}
