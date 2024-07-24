package Data_Types;

public class Data_types {



    public static void main(String[] args) {
//        calling_method_to_main_method();
//        calling_method_to_mainmethod_with_parameters( 20,20.5,160.5f, "sun tech", 'S');
//        calling_staticmethod_to_mainmethod();
//        calling_staticmethod_to_mainmethod_using_parameters(10, 10.5, "sun", 's');
//        Data_types m = new Data_types();
//       m.calling_nonstaticmethod_to_mainmethod_objcr();
//       m.calling_nonstaticmethod_to_mainmethod_using_parameters(50, 60.5, "Technology", 'T');


       int i =253;

           System.out.println(i%10);
           System.out.println(i/10);

    }


    static void calling_method_to_main_method() {
        int a = 300;
        int b = 250;
        int c = a + b;
        System.out.println(a + b);
    }

    static void calling_method_to_mainmethod_with_parameters(int a, double b, float c, String d, char e) {
        System.out.println("add value after:" + a + b + c + d + e);
    }

    static void calling_staticmethod_to_mainmethod() {
        int a = 20;
        int b = 40;
        int c = a * b;
        System.out.println(c);
    }

    static void calling_staticmethod_to_mainmethod_using_parameters(int a, double b, String c, char d) {
        System.out.println("ADD VALUE AFTER:" + a + b + c + d);
    }


    public void calling_nonstaticmethod_to_mainmethod_objcr() {
        int a = 100;
        int b = 200;
        int c = a - b;
        System.out.println(c);
    }

    public  void calling_nonstaticmethod_to_mainmethod_using_parameters(int a, double b, String c, char d) {
        System.out.println("ADDING VALUE TO:" + a + b + c + d);}

}






//        int day = 3;
//        switch (day) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//        }
//
//        int month = 7;
//        switch (month) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            case 4:
//                System.out.println("4");
//                break;
//            case 5:
//                System.out.println("5");
//                break;
//            case 6:
//                System.out.println("6");
//                break;
//            case 7:
//                System.out.println("7");
//                break;
//            case 8:
//                System.out.println("8");
//
//
//

















