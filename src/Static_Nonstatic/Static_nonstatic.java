package Static_Nonstatic;

public class Static_nonstatic {
    public static void main(String[] args) {
        mystaticmethod();
        Static_nonstatic p=new Static_nonstatic();
        p.mypublic(50,100);
        training();
        p.training1(45.15f,50.55f);
        p.demo("mouse","keyboard");


    }




    static void mystaticmethod() {
        int a = 50;
        int b = 100;
        int c = a + b;
        System.out.println(c);
    }

     public void mypublic(int a,int b){
//        int a = 50;
//        int b = 100;
        int c = a + b;
        System.out.println(c);
    }

    static void training(){
        double a= 122.5;
        double b= 150.75;
        double c= a+b;
        System.out.println(c);
    }


    public void training1(float a,float b){
//        float a = 45.75f;
//        float b = 50.55f;
        float c = a*b;
        System.out.println(c);}

    public void demo(String a,String b){
//        String a = "mouse";
//        String b = "keyboard";
        String c = (a+b);
        System.out.println(c);}


    }









