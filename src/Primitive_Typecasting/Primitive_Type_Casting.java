package Primitive_Typecasting;

public class Primitive_Type_Casting {
    // 1 .PRIMITIVE TYPE CASTING
    //WIDENING (IMPLICITY)

    int a= 20;
    float b = 60.50f;

    //EXPLICITY
    int x = 40;
    float y =70.50f;
    public static void main(String[] args) {
        float a =20;
        double b = 60.50;

        //EXPLICITY

        float x = (float) 40;
        double y = (double) 60.50;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}

//public class Type_Casting1 {

////PRIMITIVE TYPE CASTING
////NARROWING (EXPLICITY)
//
//    double g = 50.650;
//    int h = 30;
//
//    public static void main(String[] args) {
//        float g = (float) 50.650;
//        short h = (short) 30;
//        System.out.println(g);
//        System.out.println(h);
//    }
//}






