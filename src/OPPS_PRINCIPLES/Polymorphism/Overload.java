package OPPS_PRINCIPLES.Polymorphism;

public class Overload {


    public static void main(String[] args) {
        Overload objnm = new Overload();
        objnm.add(10,20);
        objnm.add(10,20,30.50d,40.50f);
        objnm.add(40.5f,80,'A');
    }


    public void add(int a, int b) {
        System.out.println("add value after:"+ a + b);
    }



    public void add(int a, int b,double c,float d){
        System.out.println("add value after:"+a+b+c+d);
    }

    public void add(float a, int b, char c){
        System.out.println("add value after:"+a+b+c);

    }


}



