package Collections.Array_list;

import java.util.ArrayList;

public class Ary_updation_to_list {
    public static void main(String[] args) {
        ArrayList a1 =new ArrayList();
        a1.add("ydr");
        a1.add("jvn");
        a1.add("raj");




        ArrayList a2 = new ArrayList();
        a2.add("rmsh");
        a2.add("srsh");

        System.out.println(a1);

        //addAll-collections

        a1.addAll(a2);
        System.out.println(a1);


//
//        //reterival
//        System.out.println(a1.get(3));

        //set
        a1.set(2,"msh");
        System.out.println(a1);



    }
}
