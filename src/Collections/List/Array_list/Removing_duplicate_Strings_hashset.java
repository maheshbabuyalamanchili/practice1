package Collections.Array_list;

import java.util.HashSet;
import java.util.Set;

public class Removing_duplicate_Strings_hashset {
    public static void main(String[] args) {
        Set<Character> A = new HashSet<>();
        String str = "world sun world sun earth";
        String temp = " ";
        for (int i = 0; i < str.length(); i++) {
            if (A.add(str.charAt(i))) {
                temp = temp + str.charAt(i);
            }
        }
            System.out.println("original string:" + str);
            System.out.println("after removing duplicates:" + temp);


            Set<Character> X = new HashSet<>();
            String s = "sun sun tech tech ";
            String temp1 = " ";
            for (int j = 0; j < s.length(); j++) {
                if (X.add(s.charAt(j))) {
                    temp1 = temp1 + s.charAt(j);
                }
            }
            System.out.println("original String:" + s);
            System.out.println("after removing duplicates:" + temp1);

        }

        }


