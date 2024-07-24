package Up_Down_Class_TypeCasting;

public class Cat extends anml {
    public void noise() {
        System.out.println("sound");
    }

    public static void main(String[] args) {
        anml A = new Cat();
        A.add();
        Cat C = (Cat) A;
        C.add();
        C.noise();

    }

}