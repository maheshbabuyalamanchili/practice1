package Access_modifier2_public_SUBCLASS;

//ACCESS WITHIN THE  SUB-CLASS IN DIFF PACKAGE

import Access_modifiers_public_CLASS.SAMECLASS;

public class Subclass extends SAMECLASS {
   public static void main(String[] args) {
       Subclass sbc = new Subclass();
       sbc.test();
       System.out.println(rollno);
    }
    public void test() {
        printrollnumber();

    }

}