package chapter20_2;

public class Pro {
    public static int rotated(int a[], int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + ((end - start) / 2);
        if (a[mid] == key) {
            return mid;
        }
        if (a[start] <= a[mid]) {
            if (a[start] <= key && a[mid] >= key) {
                return rotated(a, key, start, mid - 1);
            } else {
                return rotated(a, key, mid + 1, end);
            }
        } else {
            if (a[mid] >= key && key <= a[end]) {
                return rotated(a, key, mid + 1, end);
            } else {
                return rotated(a, key, start, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.err.println(rotated(a, 9, 0, a.length - 1));
    }
}
