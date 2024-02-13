package chapter23;

import java.util.ArrayList;
import java.util.Collections;

public class L1 {
    static void swap(ArrayList<Integer> l, int pos1, int pos2) {
        int tm = l.get(pos1);
        l.set(pos1, l.get(pos2));
        l.set(pos2, tm);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ami");
        list1.add(100);
        list1.add(101);
        list1.add(102);
        list1.add(102);
        list1.add(104);
        list1.add(105);
        list3.add(106);
        list3.add(107);
        System.out.print(list1);
        System.out.println();
        System.out.print(list1.get(1));
        System.out.println();
        System.out.print(list1);
        System.out.println();
        list1.remove(3);
        System.out.println(list1);
        list1.set(3, 99);
        System.out.println(list1);
        // System.out.println(list1.contains(list2));
        // System.out.println(list1.contains(list3));
        System.out.println(list1.contains(99));
        list1.add(2, 5);
        System.out.println(list1);
        System.out.println(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        for (int i = list1.size() - 1; i >= 0; i--) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        int maxi = Integer.MIN_VALUE;
        for (int i = list1.size() - 1; i >= 0; i--) {
            maxi = Integer.max(maxi, list1.get(i));
        }
        System.out.println(maxi);
        System.out.println(list1);
        swap(list1, 1, 4);
        System.out.println(list1);
        int tm = list1.get(3);
        list1.set(3, list1.get(1));
        list1.set(1, tm);
        System.out.println("--------------" + "\n" + list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
    }
}
