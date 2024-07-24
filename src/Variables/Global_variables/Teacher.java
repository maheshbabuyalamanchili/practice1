package Variables.Global_variables;

public class Teacher {
    //class variables(static fields)static

    static int age=30;  //non-static
    String name = "abc"; //if there in no word of static creaate object
    public static void main(String[] args) {
        Teacher T = new Teacher();
        System.out.println(age);
        System.out.println(T.name);
    }



    //accessing in methods
    public static void test(){
        System.out.println(age);
    }
}
