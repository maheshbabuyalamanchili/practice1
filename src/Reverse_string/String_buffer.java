package Reverse_string;

public class String_buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("selenium");
        System.out.println(sb.length());
        System.out.println(sb.append("java"));
        //System.out.println(sb.deleteCharAt(1));//index
        System.out.println(sb.substring(5));
        System.out.println(sb.replace(0,5,"abcd"));
        ;

    }

}
