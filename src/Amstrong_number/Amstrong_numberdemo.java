package Amstrong_number;
//input value --153
//  153--    1      5       3
//        1*1*1   5*5*5   3*3*3
//          1   +   125 +   27
//o/p                 153

//370   3*3*3  7*7*7  0*0*0
//       27  +   343  +  0
// o/p          370

public class Amstrong_numberdemo {
    static int sum ; //27+125+1=153
    static int rem ;

    public static void main(String[] args) {

        int n = 153;
        int temp = n;

          //3--5--1

//        while (n > 0) {               //153>0   10)153(15
//            rem = n % 10;  //rem=3                 150
//            sum = sum + (rem * rem * rem);     // = 3
//            n = n / 10;   //15--1
//        }
//        System.out.println(temp);
//
        for(int i=0;i<3;i++){
            rem = n % 10;  //rem=3                 150
            sum = sum + (rem * rem * rem);     // = 3
            n = n / 10;   //15--1


        }


            if (temp == sum) {
                System.out.println("amstrong number");

            } else {
                System.out.println("not a amstrong number");
            }


        }







    }



