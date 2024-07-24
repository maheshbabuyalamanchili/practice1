package Collections.Vector_V;

import java.util.Vector;

public class Vec_retrieval_to_list {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("ydgr");
        v1.add("jvn");
        v1.add("raj");




        Vector v2 = new Vector();
        v2.add("rmsh");
        v2.add("srsh");

        System.out.println(v1);

        //addAll
        v1.addAll(v2);
        System.out.println(v1);

        System.out.println(v1.get(2));



    }
}

