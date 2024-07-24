package Collections.Linked_list_LL;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist_practice {
    public static void main(String[] args) {
        LinkedList<String> l1 =new LinkedList<>();
        //Adding elements
        l1.add("y1");
        l1.add("y2");
        l1.add("y3");
        l1.add("y4");
        l1.add("y5");
        l1.add("y5");
        l1.add(null);
       // l1.add(1,"yy"); // adding by index
        System.out.println(l1);
//       LinkedList<String> l2 =new LinkedList<>();
//
  //      System.out.println(l1);
//
//        l2.add("z1");
//        l2.add("z2");
//
//
//
//        //addAl (collections)
//        l1.addAll(l2);
//        System.out.println(l1);
//
//        //add array list obj to linked list
//        ArrayList<String> a1 = new ArrayList<>();
//        a1.add("S1");
//        a1.add("s2");
//
//        l1.addAll(a1);
//        System.out.println(l1);
//
//         //retrive
        System.out.println(l1.get(0));
//
//        //verification
//        //contains by obj
//        System.out.println(l1.contains("y1"));
//
//        System.out.println(l1.contains("Y10"));
//
////containsall
//        System.out.println(l1.containsAll(l2));
//
//deletion
//        //remove by string
//        l2.remove("z2");
//        System.out.println(l2);
//
//        //remove by index
        l1.remove(2);
        System.out.println(l1);
//
//
//        //removeall by collections
//        l1.removeAll(a1);
//        System.out.println(l1);
//
//        //clear
//        l2.clear();
//        System.out.println(l2);



    }
}
