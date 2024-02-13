package chapter14;

public class Sort {
    public static void main(String[] args) {
        // int a[] = { 45, 9, -32, 8, 102, 1, 4 };
        // bubble(a);
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i] + " ");
        // }
        // System.out.println();
        // int b[] = { 45, 9, -32, 8, 102, 1, 4 };
        // selection(b);
        // for (int i = 0; i < b.length; i++) {
        // System.out.print(b[i] + " ");
        // }
        // System.out.println();
        int c[] = { 45, 9, -32, 8, 102, 1, 4 };
        insertion(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        // int d[] = { 45, 9, -32, 8, 102, 1, 4 };
        // insertion2(d);
        // for (int i = 0; i < d.length; i++) {
        // System.out.print(d[i] + " ");
        // }
        // System.out.println();
        // int x[] = { 15, 3, 1, 56, 21, 9, 31, 4, 0, 0, 0, 1, 1, 2, 3, 5, 3 };
        // counting(x);
        // for (int i = 0; i < x.length; i++) {
        // System.out.print(x[i] + " ");
        // }
        // System.out.println();
        // insertion2(x);
        // for (int i = 0; i < x.length; i++) {
        // System.out.print(x[i] + " ");
        // }
    }

    public static void bubble(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tm = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tm;
                }
            }
        }
    }

    public static void selection(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minpos = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minpos]) {
                    minpos = j;
                }
            }
            int tm = a[minpos];
            a[minpos] = a[i];
            a[i] = tm;
        }
    }

    public static void insertion(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] > a[j - 1]) {
                    break;
                } else {
                    int tm = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tm;
                }
            }
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }

    public static void insertion2(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int cur = a[i];
            int prev = i - 1;
            while (prev >= 0 && a[prev] > cur) {
                a[prev + 1] = a[prev];
                prev--;
            }
            a[prev + 1] = cur;
        }
    }

    public static void counting(int a[]) {
        int n = a.length;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            maxi = Integer.max(maxi, a[i]);
        }
        int b[] = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            b[a[i]]++;
        }
        int j = 0;
        for (int i = 0; i < maxi + 1; i++) {
            while (b[i] > 0) {
                a[j] = i;
                j++;
                b[i]--;
            }
        }
    }
}
