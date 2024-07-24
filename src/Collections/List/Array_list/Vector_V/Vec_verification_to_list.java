package Collections.Vector_V;

import java.util.Vector;

public class Vec_verification_to_list {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("ydgr");
        v1.add("jvn");
        v1.add("raj");


        Vector v2 = new Vector();
        v2.add("rmsh");
        v2.add("srsh");


        Vector v3 = new Vector();
        v3.add("srsh");
        v3.add("rmsh");


        System.out.println(v1);


        //addall(colection)
        v1.addAll(v2);
        System.out.println(v1);


        v1.addAll(v3);
        System.out.println(v1);


        //contains
        System.out.println(v1.contains("raj"));     //true
        System.out.println(v2.contains("srsh"));   //true
        System.out.println(v1.contains("raja"));   //false
        System.out.println(v3.contains("rmsh"));   //true

        //contains All
        System.out.println(v1.containsAll(v2));    //true
        System.out.println(v1.containsAll(v3));    //true


    }
}
