package Collections.Array_list;

import java.util.ArrayList;

public class Ary_deletion_to_list {
    public static void main(String[] args) {
        ArrayList a1 =new ArrayList();
        a1.add("ydr");
        a1.add("jvn");
        a1.add("raj");
        a1.add("rmsh");
        a1.add("srsh");



        ArrayList a2 = new ArrayList();
        a2.add("rmsh");
        a2.add("srsh");

        System.out.println(a1);


        //add
        a1.addAll(a2);
        System.out.println(a1);

        //remove (index)
        a1.remove(3);
        System.out.println(a1);

        // remove (object)

        a1.remove("jvn");
        System.out.println(a1);

        //reomveall(collection)
        a1.removeAll(a2);
        System.out.println(a1);

        //clear
        a1.clear();
        System.out.println(a1);





    }
}
