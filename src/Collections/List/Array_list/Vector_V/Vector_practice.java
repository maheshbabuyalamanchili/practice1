package Collections.Vector_V;


import java.util.*;

public class Vector_practice {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("ydgri");  //0(index)-1(element)
        v1.add("jvn");    //1-1
        v1.add(0,"raj");   //2-3   pasing index
        v1.add("arsh");   //3-4
        v1.add("rmsh");   //4-5
        v1.add("ngsh");   //5-6
        v1.add("srsh");   //6-7
        v1.add("y1");     //7-8
        v1.add("y2");     //8-9
        v1.add("y3");     //9-10

        v1.add("y4");     //10-11



        System.out.println(v1);


       System.out.println("Size" + v1.size());  //size=no.of elements in list
       System.out.println("capacity" + v1.capacity());  //capacity=array capacity
    }

}

