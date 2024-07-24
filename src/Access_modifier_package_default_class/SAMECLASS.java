package Access_modifier_package_default_class;

 class SAMECLASS {       //CLASS

     int rollno=101;  //Variable

     SAMECLASS(){  //Constructur
        rollno=102;
    }
      void printrollnumber(){   //METHOD
        System.out.println(rollno);
    }


     void abc(){
        printrollnumber();               //method access in same class
        System.out.println(rollno);  //variable access in same class


    }

}

