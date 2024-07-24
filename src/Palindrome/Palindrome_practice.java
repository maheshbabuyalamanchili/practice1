package Palindrome;

public class Palindrome_practice {
    public static void main(String[] args) {
        String str = "MADAM";
        String rev = "";
       char [] c= str.toCharArray();     // 'M'  'A' 'D' 'A' 'M'
        System.out.println(c.length);
        for (int i =4;i>=0;i--){
            rev=rev+c[i];
        }
        System.out.println(rev);
        if (str.equals(rev)) {

            System.out.println("string:"+"palindrome");
        }
        else {
            System.out.println("STRING:"+"NOT PALINDROME");
        }




//        String s= "EYE";
//        String revs=" ";
//        char[]c=s.toCharArray();  //e y e
//        System.out.println(c.length);
//        for (int i= 2;i>=0;i--){
//            revs=revs+c[i];
//        }
//        System.out.println(revs);
//        if (s.equals(revs)){
//            System.out.println("string:"+"palindrome");
//        }
//        else {
//            System.out.println("string:"+"not a palindrome");
//        }

    }
    }

