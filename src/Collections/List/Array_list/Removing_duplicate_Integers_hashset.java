package Collections.Array_list;

import java.util.HashSet;
import java.util.Set;

public class Removing_duplicate_Integers_hashset {
    public static void main(String[] args) {
        int[] num = {23, 45, 54, 23, 34, 45, 54, 12};
        Set<Integer> S = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            S.add(num[i]);
        }
        System.out.println(num);
        System.out.println("after removing duplicates:" + S);

        ///////////////////

        int[] a = {2, 3, 2, 4, 3, 5, 6, 3, 7, 8, 7, 4, 2, 1};
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set1.add(a[i]);
        }

        System.out.println(a);
        System.out.println("After removing the duplicates : " + set1);

    }
}


