package Reverse_string;

import java.util.ArrayList;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        ArrayList a1= new ArrayList();
        a1.add("aaa");
        a1.add("bbb");
        a1.add("ccc");

        System.out.println(a1);

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String str= sc.nextLine();
        if (a1.contains(str)){
            System.out.println("STRING:"+str);
        }
        else {
            System.out.println("String:"+a1);
        }
    }
}




