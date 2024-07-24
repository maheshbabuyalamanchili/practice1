package Stringsss;

import java.util.Scanner;

//write a java program to count the no of words in a string
public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter input string:");
        String input = sc.nextLine();
        System.out.println("Input:"+input);
        //1.   java is a programming language
      String[] words= input.split(" ");
        System.out.println("Output:"+ words.length);
        sc.close();
    }


}
