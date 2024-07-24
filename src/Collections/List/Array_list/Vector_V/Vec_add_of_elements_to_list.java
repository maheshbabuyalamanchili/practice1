package Collections.List.Array_list.Vector_V;

import java.util.*;

public class Vec_add_of_elements_to_list {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("ydgri");
        v1.add("jvn");
        v1.add("raj");



        Vector v2 = new Vector();
        v2.add("rmsh");
        v2.add("srsh");

        System.out.println(v1);

        //addAll collections

        v1.addAll(v2);
        System.out.println(v1);

        //addAll index

        v1.addAll(0,v2);
        System.out.println(v1);


    }
}
