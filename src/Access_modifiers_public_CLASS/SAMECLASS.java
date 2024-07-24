package Access_modifiers_public_CLASS;

//ACCESS WITHIN THE SAME CLASS IN SAME PACKAGE

public class SAMECLASS {       //CLASS

public static int rollno=101;  //Variable

public SAMECLASS(){  //Constructur
     rollno=102;
}
    public static void printrollnumber(){   //METHOD
        System.out.println(rollno);
    }


    private void abc(){
    printrollnumber();               //method access in same class
        System.out.println(rollno);  //variable access in same class


    }

        }







