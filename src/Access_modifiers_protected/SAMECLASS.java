package Access_modifiers_protected;

//ACCESS WITHIN THE SAME CLASS IN SAME PACKAGE

public class SAMECLASS {       //CLASS

protected int  rollno=101;  //Variable

protected SAMECLASS(){  //Constructur
     rollno=102;
}
    protected   void printrollnumber(){   //METHOD
        System.out.println(rollno);
    }


    public void abc(){
    printrollnumber();               //method access in same class
        System.out.println(rollno);  //variable access in same class


    }

        }







