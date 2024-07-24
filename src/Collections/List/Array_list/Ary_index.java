package Collections.Array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Ary_index {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("ydr");
        a1.add("jvn");
        a1.add("raj");


        ArrayList a2 = new ArrayList();
        a2.add("rmsh");
        a2.add("srsh");

        System.out.println(a1);

        //addALL
        a1.addAll(a2);
        System.out.println(a1);

        //index
        System.out.println(a1.indexOf("raj"));
        System.out.println(a1.indexOf("srsh"));

        //converting to array
         Object [] arr = a1.toArray();
        System.out.println(Arrays.toString(arr));

    }
}