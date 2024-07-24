package Access_modifiers_public_CLASS;


//ACCESS WITHIN THE DIF CLASS IN SAME PACKAGE

public class DIFFCLASS {
    public static void main(String[] args) {
        SAMECLASS sc=new SAMECLASS();     //ACCESS CONSTRUCTOR IN DIF CLASS IN SAME PACKAGE
        sc.printrollnumber();             //ACCESS METHOD IN DIF CLASS IN SAME PACKAGE
        System.out.println(sc.rollno);    //ACCESS VARIABLE IN DIF CLASS IN SAME PACKAGE
    }
}
