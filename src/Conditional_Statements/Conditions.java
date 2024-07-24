package Conditional_Statements;                                   //CONDITIONS

public class Conditions {



    public static void main(String[] args) {

       // if condition

       //// Ex:1

        int a = 10;

        if (a <= 10) {
            System.out.println("cond is  true execute a in if stmt");
        }

        //// Ex:2

        int r = 30;
        if (r <= 40) {
            System.out.println("cond is  true execute r in if stmt");
        }

        //// Ex:3
        int e = 100;
        if (e <= 90) {
            System.out.println("cond is  true execute e in if stmt ");
        }



 //       if else condition

        //// Ex:1

        int m = 100;
        if (m <= 90) {
            System.out.println("cond is  true execute m in if stmt");
        }
        else {
            System.out.println("cond is  false execute m in else stmt");
        }

        //// Ex:2

        int f = 15;
        if (f <= 10) {
            System.out.println("cond is  true execute f in if stmt");
        }
        else {
            System.out.println("cond is  false execute f in else stmt");
        }

        //// Ex:3


        int x = 30;
        if (x <= 40) {
            System.out.println("cond is  true execute x in if stmt");
        }
        else {
            System.out.println("cond is  false execute x in else stmt");
        }



   //     else if

        //// Ex:1

        int y = 10;

        if (y == 10) {
            System.out.println("cond1 true execute y value 10 in if stmt");
        }

        else if (y == 20) {
            System.out.println("cond2 true execute y value 20 in else if 1 stmt");
        }

        else if (y == 30) {
            System.out.println("cond3 true execute y value 30 in else if 2 stmt");
        }

        else {
            System.out.println(" all cond false execute y value in else  stmt");
        }

        //// Ex:2

        int b = 200;

        if (b == 100) {
            System.out.println("cond1 true execute b value 100 in if stmt");
        }

        else if (b == 200) {
            System.out.println("cond2 true execute b value 200 in else if 1 stmt");
        }

        else if (b == 300) {
            System.out.println("cond3 true execute b value 300 in else if 2 stmt");
        }

        else {
            System.out.println(" all cond false execute b value in else  stmt");
        }

        //// Ex:3

        int c = 3000;

        if (c == 1000) {
            System.out.println("cond1 true execute c value 1000 in if stmt");
        }

        else if (c == 2000) {
            System.out.println("cond2 true execute c value 2000 in else if 1 stmt");
        }

        else if (c == 3000) {
            System.out.println("cond3 true execute c value 3000 in else if 2 stmt");
        }

        else {
            System.out.println(" all cond false execute c value in else  stmt");
        }


        //// Ex:4

        int d = 10;

        if (d == 20) {
            System.out.println("cond1 true execute d value 20 in if stmt");
        }

        else if (d == 30) {
            System.out.println("cond2 true execute d value 30 in else if 1 stmt");
        }

        else if (d == 40) {
            System.out.println("cond3 true execute d value 300040 in else if 2 stmt");
        }

        else {
            System.out.println("all cond false execute d value in else  stmt");
        }


       // Nested if condition

      ////  Ex : 1

        int i = 10;
        int j = 20;

        if (i == 10) {
            System.out.println("cond1 true i move to cond 2");
            if (j == 20) {
                System.out.println("cond2 true execute i j value in if 2 stmt");
            }
            else {
                System.out.println("cond2 false execute  inner else stmt");
            }
        }
        else {
            System.out.println("cond1 false execute outer else stmt");
        }


        ////  Ex : 2


        int p = 100;
        int q = 50;

        if (p == 60) {
            System.out.println("cond1 true p move to cond 2");

            if (q == 50) {
                System.out.println("cond2 true execute p q value in if 2 stmt");
            } else {
                System.out.println("cond2 false execute  inner else stmt");
            }
        }
        else {
            System.out.println("cond1 false execute outer else stmt");
        }

        ////  Ex : 3

        int s = 100;
        int t = 200;

        if (s == 100) {
            System.out.println("cond1 true s move to cond 2");

            if (t == 500) {
                System.out.println("cond2 true execute s t value in if 2 stmt");
            } else {
                System.out.println("cond2 false execute  inner else stmt");
            }
        }
        else {
            System.out.println("cond1 false execute  outer else stmt");
        }

       //// Ex : 4

        int u = 50;
        int v = 100;
        if (u == 20) {
            System.out.println("cond1 true u move to cond 2");
            if (v == 30) {
                System.out.println("cond2 true execute u v value in if 2 stmt");
            } else {
                System.out.println("cond2 false execute  inner else stmt");
            }
        }
        else {
            System.out.println("cond1 false execute  outer else stmt");
        }

    }
}















