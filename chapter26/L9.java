package chapter26;

public class L9 {
    public static void main(String[] args) {
        int a[] = { 6, 8, 0, 1, 3 };
        for (int i = 0; i < a.length; i++) {
            int max = -1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    max = a[j];
                    break;
                }
            }
            a[i] = max;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
