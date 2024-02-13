package chapter23;

public class L13_2 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int k = 5;
        // =======================chotoBabu===================//
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == k) {
                    System.out.println("Index: " + i + "+" + j + "=" + k);
                }
            }
        }
        // ===================ektuBoro=========================//
        int lp = 0;
        int rp = a.length - 1;
        while (lp < rp) {
            if (a[lp] + a[rp] == k) {
                System.out.println("Index: " + lp + "+" + rp + "=" + k);
                lp++;
                rp--;
            } else if (a[lp] + a[rp] > k) {
                rp--;
            } else {
                lp++;
            }
        }
        // ================sortedSatheRotated=================//
        int pv = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                pv = i;
                break;
            }
        }
        int max;
        if (pv == 0) {
            max = a.length - 1;
        } else {
            max = pv - 1;
        }
        lp = pv;
        rp = max;
        while (lp != rp) {
            if (a[lp] + a[rp] == k) {
                System.out.println("Index: " + lp + "+" + rp + "=" + k);
                lp++;
            } else if (a[lp] + a[rp] > k) {
                rp--;
                if (rp == -1) {
                    rp = a.length - 1;
                }
            } else {
                lp++;
            }
        }
    }
}
