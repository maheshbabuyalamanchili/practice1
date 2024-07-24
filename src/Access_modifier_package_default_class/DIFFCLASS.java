package Access_modifier_package_default_class;

import Access_modifiers_public_CLASS.SAMECLASS;

 class DIFFCLASS {
    public static void main(String[] args) {
        Access_modifiers_public_CLASS.SAMECLASS sc=new SAMECLASS();     //ACCESS CONSTRUCTOR IN DIF CLASS IN SAME PACKAGE
        sc.printrollnumber();                                     //ACCESS METHOD IN DIF CLASS IN SAME PACKAGE
        System.out.println(sc.rollno);                            //ACCESS VARIABLE IN DIF CLASS IN SAME PACKAGE
    }
}
