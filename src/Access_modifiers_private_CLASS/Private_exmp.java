package Access_modifiers_private_CLASS;
//access with in the same class only

public class Private_exmp {
    public static void main(String[] args) {
        Private_exmp p = new Private_exmp();
        p.returnid();             //accessing method in same class
        System.out.println(p.id); //accessing variable in same class
    }
    private int id=10;            //variable

   private Private_exmp() {      //constructor
       id=15;
   }


    private void returnid(){     //method
        System.out.println(id);
    }

    public void abc(){  //public method
       returnid();
    }


}
