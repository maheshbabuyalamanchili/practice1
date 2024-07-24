package Decision_making_statements;

public class DecisionStatements {
    public static void main(String[] args) {
        int a=70;
        int b= 80;
        int c= 30;
        if(a>=b || a>=c)
        {
            System.out.println("A is Greater "+a);
        } else if (b>=a || b>=c) {
            System.out.println("B is Greater "+b);
        }else {
            System.out.println("C is Greater "+c);
        }

        if (b>a  && c<b){
            System.out.println("b is greater");
        }
        else if (c<a  && a>c) {
            System.out.println("c is bigger");
        }
    }
}
