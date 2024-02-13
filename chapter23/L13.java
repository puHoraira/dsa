package chapter23;

import java.util.*;

public class L13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            ar.add(c);
        }
        Collections.sort(ar);
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar.get(i) + ar.get(j) == key) {
                    System.out.println("Yes pos: " + i + " and " + j);
                }
            }
        }
        sc.close();
    }
}
