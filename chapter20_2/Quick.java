package chapter20_2;

public class Quick {

    static int pivotCalculate(int a[], int start, int end) {
        int i = start - 1;
        int pivot = a[end];
        for (int j = start; j < end; j++) {
            if (a[j] <= pivot) {
                i++;
                int x = a[i];
                a[i] = a[j];
                a[j] = x;
            }
        }
        i++;
        a[end] = a[i];
        a[i] = pivot;
        return i;
    }

    static void sort(int a[], int start, int end) {
        if (start < end) {
            int pivot = pivotCalculate(a, start, end);
            sort(a, start, pivot - 1);
            sort(a, pivot + 1, end);
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
