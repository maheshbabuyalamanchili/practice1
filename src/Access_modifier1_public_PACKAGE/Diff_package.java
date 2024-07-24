package Access_modifier1_public_PACKAGE;


import Access_modifiers_public_CLASS.DIFFCLASS;
import Access_modifiers_public_CLASS.SAMECLASS;

//ACCESS WITHIN THE  CLASS IN DIFF PACKAGE

public class Diff_package extends DIFFCLASS {
    public static void main(String[] args) {
        SAMECLASS sc=new SAMECLASS();     //ACCESS CONSTRUCTOR IN DIF CLASS IN DIF PACKAGE
        sc.printrollnumber();             //ACCESS METHOD IN DIF CLASS IN DIF PACKAGE
        System.out.println(sc.rollno);    //ACCESS VARIABLE IN DIF CLASS IN DIF PACKAGE

    }
}

