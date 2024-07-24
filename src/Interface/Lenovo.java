package Interface;

public class Lenovo implements Laptop  {



    public void copy() {
        System.out.println("lenovo copy code");

    }


    public void cut() {
        System.out.println("lenovo cut code");

    }


    public void paste() {
        System.out.println("lenovo paste code");

    }

    public void move(){
        System.out.println("lenovo move code");//extra feature not in interface doc
    }

    public void security(){
        System.out.println("lenovo security code");
    }
}
