package chapter20_2;

public class Merge {
    static void sort(int a[], int first, int last) {
        if (first < last) {
            int mid = first + ((last - first) / 2);
            sort(a, first, mid);
            sort(a, mid + 1, last);
            merge(a, first, mid, last);
        }
        return;
    }

    static void merge(int a[], int first, int mid, int last) {
        int i = first;
        int j = mid + 1;
        int k = 0;
        int tm[] = new int[last - first + 1];
        while (i <= mid && j <= last) {
            if (a[i] < a[j]) {
                tm[k++] = a[i++];
            } else {
                tm[k++] = a[j++];
            }
        }
        while (i <= mid) {
            tm[k++] = a[i++];
        }
        while (j <= last) {
            tm[k++] = a[j++];
        }
        for (i = 0; i < tm.length; i++) {
            a[first + i] = tm[i];
        }
    }

    public static void main(String[] args) {
        int a[] = { 88, 4, 1, -21, 31, 45 };
        sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
