package Collections.Vector_V;

import java.util.*;

public class Vec_updation_to_list {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("ydr");
        v1.add("jvn");
        v1.add("raj");


        Vector v2 = new Vector();
        v2.add("rmsh");
        v2.add("srsh");

        System.out.println(v1);

        //addALL
        v1.addAll(v2);
        System.out.println(v1);

        //set

        v1.set(1,"msh");
        v1.set(2,"nrsh");
        System.out.println(v1);

    }
}
