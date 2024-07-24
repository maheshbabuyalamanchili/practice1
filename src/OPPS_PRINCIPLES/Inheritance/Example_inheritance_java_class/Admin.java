package OPPS_PRINCIPLES.Inheritance.Example_inheritance_java_class;

public class Admin extends Developer {

    public void manage(){
       super.read();
        write();
        System.out.println("manage code");

    }
    public  void read(){
        System.out.println(" admin read code");
    }


}
