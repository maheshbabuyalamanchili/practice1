package Reverse_string;

public class Reversing_multi_words_atsameplace {
    public static void main(String[] args) {
        String str = "java programming language";    //java,programming,language
        String revstr = " ";
        String [] words=str.split(" ");
        for (int i =0;i< words.length;i++){
            String word=words[i];                    //java
            String revword=" ";
            for (int j=word.length()-1;j>=0;j--){
                revword=revword+word.charAt(j);

            }
            revstr=revstr+revword;
        }
        System.out.println("Reverse string:"+revstr);






        //2 :example


        String sent="java is a programming language";
        String revers=" ";
        String [] word1=sent.split(" ");
        for (int i=0;i< word1.length;i++){
            String word = words[i];
            String revword =" ";
            for (int j=word.length()-1;j>=0;j--){
                revword=revword+word.charAt(j);

            }
            revers=revers+revword;


        }



    }
}

