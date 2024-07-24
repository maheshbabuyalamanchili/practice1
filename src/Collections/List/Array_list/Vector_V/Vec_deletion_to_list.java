package Collections.Vector_V;

import java.util.Vector;

public class Vec_deletion_to_list {
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

        //reterive index
        System.out.println(v1.get(2));


        //remove by index
        v1.remove(0);
        System.out.println(v1);

        //remove by object
        v1.remove("raj");
        System.out.println(v1);

        //remove all by collecton
        v1.removeAll(v2);
        System.out.println(v1);

        //clear list
        v1.clear();
        System.out.println(v1);




    }
}
