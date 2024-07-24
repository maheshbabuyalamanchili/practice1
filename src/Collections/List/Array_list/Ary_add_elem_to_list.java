package Collections.Array_list;

import java.util.*;

public class Ary_add_elem_to_list {
    public static void main(String[] args) {
        ArrayList a1 =new ArrayList();
        a1.add("ydr");
        a1.add("jvn");
        a1.add("raj");


        ArrayList a2 = new ArrayList();
        a2.add("rmsh");
        a2.add("srsh");

        System.out.println(a1);

        //addAll-adding index

        a1.addAll(0,a2);
        System.out.println(a1);


        //addAll-collections

        a1.addAll(a2);
        System.out.println(a1);


    }
}
