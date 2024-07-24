package Returntypes;

public class Returntypes {

    public static void main(String[] args) {
        Returntypes re = new Returntypes();
        System.out.println(re.add(30,30));
        System.out.println(sub(30, 26));
        System.out.println(sub1(40,30));
        System.out.println(add11("sun","tech"));
        System.out.println(sub2(80,40));
    }

    int add(int a, int b) {
        return b-a;

    }

    static int sub(int a, int b) {
        return a - b;
    }



   static int sub1(int a,int b){
        return a-b;
   }

    static String add11(String a, String b){
        return a+b;
   }

   static int sub2(int a,int b){
        return a+b;
   }
}
