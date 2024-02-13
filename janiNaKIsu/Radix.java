package janiNaKIsu;

public class Radix {
    static int getMax(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Integer.max(max, a[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = { 15, 1, 321, 10, 802, 2, 123, 90, 109, 11 };

        int max = getMax(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(max);
    }
}
