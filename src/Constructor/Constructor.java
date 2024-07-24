package Constructor;

public class Constructor {
    //default or Implicity constructor
int i;
    public static void main(String[] args) {
        Constructor C = new Constructor(20,40);
        System.out.println(C.i);
        Constructor a = new Constructor();
        System.out.println(a.i);

    }

    //Explicity constructor(WITHOUT PARAMETERS)
    public Constructor(){
        i=20;

    }

    //Explicity Constructor (with parameters)
    public Constructor(int a, int b){
         a = 20;
         b= 40;
        System.out.println(a+b);

    }
}
