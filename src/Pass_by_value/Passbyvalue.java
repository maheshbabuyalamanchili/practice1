package Pass_by_value;

class Passbyvalue {

     public static void main(String[] args) {
         car("Tata", 15.5, 20);
         car1("tata1", 20.5, 40);
     }


     static void car(String a, double b, int c) {
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);


     }


     static void car1(String a, double b, int c) {
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);


     }

 }























