package Reverse_string;



public class Reversing_full_sentence {
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        String rev = "";
        char[] c = str.toCharArray();   // H, E, L, L, O W,O,R,L,D
        System.out.println(c.length);

        for (int i = c.length - 1; i >= 0; i--) {
            rev = rev + c[i];

        }
        System.out.println(rev);


        if (str!=rev) {
            System.out.println("string:" + "reverse");
        } else {
            System.out.println("string:" + "not reverse");
        }


        //////////////
        String orgstr = "AUTOMATION TESTING";
        String revstr = "";
        char [] x=orgstr.toCharArray();
        System.out.println(x.length);
        for (int i = x.length-1;i>=0;i--){
            revstr=revstr+x[i];
        }
        System.out.println(revstr);
        if (orgstr!=revstr){
            System.out.println("string:"+revstr);
        }
        else{
            System.out.println("string:"+orgstr);
        }



    }

    }



