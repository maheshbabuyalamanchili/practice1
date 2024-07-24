package Reverse_string;

public class Reversing_words_bypassing_index {
    public static void main(String[] args) {
        String inputstrg="java programming language";
        String revstrg ="";
        String sub=inputstrg.split(" ")[2];

        for (int i = sub.length()-1; i >=0 ; i--) {
            revstrg=revstrg + sub.charAt(i);
        }
        System.out.println(inputstrg);
        System.out.println(revstrg);
        System.out.println(inputstrg.replace(sub,revstrg));


        System.out.println();



        String str = "Apache Jmeter tool";
        String rvstg = "";
        String  words=str.split(" ")[2];
        for (int i=words.length()-1;i>=0;i--){
          rvstg=rvstg+words.charAt(i);
        }
        System.out.println(str);
        System.out.println(rvstg);
        System.out.println(str.replace(words,rvstg));


        System.out.println();

        String s="Selenium Web Driver";

        String rvs = "";
        String Wrd=s.split(" ")[1];
        for (int i=Wrd.length()-1;i>=0;i--){
            rvs=rvs+Wrd.charAt(i);//bew
        }
        System.out.println(s);
        System.out.println(rvs);
        System.out.println(s.replace(Wrd,rvs));

        System.out.println();


        String A = "AUTOMATION TESTING TOOL";
        String revA="";
        String wrs=A.split(" ")[1];
        for (int i = wrs.length()-1;i>=0;i--){
            revA=revA+wrs.charAt(i);
        }
        System.out.println(A);
        System.out.println(revA);
        System.out.println(A.replace(wrs,revA));


    }
}
