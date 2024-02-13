package chapter23;

import java.util.*;

public class L10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        sc.close();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans = Integer.max((j - i) * Integer.min(arr.get(i), arr.get(j)), ans);
            }
        }
        System.out.println(ans);
    }
}
