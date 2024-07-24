package Interface;

public class User {
    public static void main(String[] args) {
        Lenovo lnv= new Lenovo();
        lnv.copy();
        lnv.cut();
        lnv.paste();
        lnv.move();
        lnv.security(); //interface implement method

        Hp hp = new Hp();
        hp.copy();
        hp.cut();
        hp.paste();


        Apple apl = new Apple();
        apl.copy();
        apl.cut();
        apl.paste();


   Laptop.audio();//STATIC METHOD
    }
}
