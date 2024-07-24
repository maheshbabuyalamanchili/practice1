package OPPS_PRINCIPLES.Polymorphism;

public class Overding_1 extends Overriding {
    int a=10;
    int b=20;





    public void add(int a,int b){
        System.out.println(a+b);
        System.out.println("new fun");
    }

    public  static void main(String[] args) {
        Overding_1 objnm = new Overding_1();
        objnm.add(10,20);
    }
}
