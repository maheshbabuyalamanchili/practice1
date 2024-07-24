package Scanner_class;

import java.util.Scanner;

public class Scanner_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //predefined class read input from the keyboard
        System.out.println("what is your name?");
        String name=sc.nextLine();
        System.out.println(name);
        String status = sc.nextLine();
        System.out.println("age?");
        int age = sc.nextInt();


    }
}
