package Collections.Array_list;

import java.util.ArrayList;

public class Ary_verification_to_list {
    public static void main(String[] args) {


        ArrayList a1 = new ArrayList();
        a1.add("ydr");
        a1.add("jvn");
        a1.add("raj");


        ArrayList a2 = new ArrayList();
        a2.add("rmsh");
        a2.add("srsh");

        ArrayList a3 = new ArrayList();
        a3.add("srsh");
        a3.add("rmsh");

        System.out.println(a1);

        //add
        a1.addAll(a2);
        System.out.println(a1);

        a1.addAll(a3);
        System.out.println(a1);

        //contains (by object)
        System.out.println(a1.contains("raj"));   //true
        System.out.println(a2.contains("rmsh"));  //true
        System.out.println(a1.contains("raja"));  //false

        //containsALL (by collection)
        System.out.println(a1.containsAll(a2));  //true
        System.out.println(a1.containsAll(a3));  //true




    }
}
