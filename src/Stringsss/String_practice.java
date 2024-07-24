package Stringsss;

import java.util.Arrays;

public class String_practice {
    public static void main(String[] args) {
//        //method 1 direct creation of string
//        String s1 = "abc";
//        String email ="abc123@gmail.com";
//        System.out.println(s1);
//        System.out.println(email);
//        System.out.println(s1+email);  // adding 2 different strings
//
//        //method2 creating an object
//        String s2 = new String("hello");
//        System.out.println(s2);
//
//        //........... using = =  symbol(verify addresses) (stores in string pool)
//
//        String a1 = "java";
//        String a2 = new String("java");
//        System.out.println(a1==a2);  //FALSE
//        String a3 = "java";
//        System.out.println(a1==a3);  //TRUE (same adress)
//
////...........CREATING OBJ
//        String b1 = new String("hello");  //(stores in heap meamory)
//        String b2 = new String("java");
//        String b3 = new String("hello");
//        System.out.println(b1==b2);  //false
//        System.out.println(b1==b3);  //false(diff obj adress)
//
//        //.........data comparasion using (equals)
//
//        System.out.println(a1.equals(b2));   //true
//        System.out.println(b1.equals(b3));   //true
//        System.out.println(b1.equals(b2));   //false
//        System.out.println(s2.equals(b3));   //true


        ///string methods

        String d1 = "Class";
        String d2 = "class";
        String d3 = "CLASS";
        String d4 = "class";
        String d5 = "  hello class  ";
        String d6 ="HELLO";
        String d7 = "hello";
        String d8 = "HOW ARE YOU";

        System.out.println(d2.equals(d4));    //TRUE            //1.....equals(text equal with small & caps)
        System.out.println(d1.equals(d3));    //FALSE


        System.out.println(d1.equalsIgnoreCase(d2));  //TRUE    // 2 ..equals ignorecases(small & capital lettes)
        System.out.println(d6.equalsIgnoreCase(d7));  //TRUE
        System.out.println(d1.equalsIgnoreCase(d6));  //false

        System.out.println(d1.contains("las")); //TRUE          // 3. CONTAINS(text)
        System.out.println(d2.contains("LS"));  //FALSE


        System.out.println(d1.startsWith("Cl")); //TRUE          //4.startswith
        System.out.println(d4.startsWith("cl")); //TRUE
        System.out.println(d2.startsWith("CL")); //FALSE

        System.out.println(d4.endsWith("ss"));  //TRUE         //5.Endswith
        System.out.println(d1.endsWith("es"));  //False


        System.out.println(d1.length());   //5                   //6.length(no.of char in string)
        System.out.println(d5.length());   //15

        System.out.println(d5.trim());    //hello class          //7. Trim(reomving spaces)


        System.out.println(d6.toLowerCase());   //hello          //8.To lower case
        System.out.println(d1.toLowerCase());   //class


        System.out.println(d7.toUpperCase());   //HELLO          //9.To upper case
        System.out.println(d2.toUpperCase());   //CLASS


        System.out.println(d1.toCharArray());   //Class                //10.TO chararray (C,l,a,s,s)

        System.out.println(d1.indexOf("s"));  //3               //11.indexof
        System.out.println(d1.indexOf("e"));  //-1


        System.out.println(d1.lastIndexOf("s"));//4   //12.lastindex of
        System.out.println(d7.lastIndexOf("o"));
        System.out.println(d5.lastIndexOf("s"));


        System.out.println(d7.substring(2)); //llo    //13.substring
        System.out.println(d5.substring(5));  //lo class
        System.out.println(d5.substring(2,10));  //hello cl
        System.out.println(d3.substring(1,4));    //LAS
        System.out.println(d6.substring(2));     //LLO

        System.out.println(Arrays.toString(d8.split(" "))); //14.split
















//        ///////////...
//        String d = "efgh";
//        String e = "ijkl";
//        String f = "efgh";
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(d+e);
//
//        //==
//        System.out.println(d==f);
//        System.out.println(d==e);
//
//        //equals
//        System.out.println(d.equals(f));
//        System.out.println(d.equals(e));
//
//
//
//        String g =new String("efgh");
//        String h = new String("ijkl");
//        String i = new String("efgh");
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(g+h);
//
//        //==crearing obj
//
//        System.out.println(g==i);
//        System.out.println(g==h);
//
//        //equals
//        System.out.println(g.equals(i));
//        System.out.println(g.equals(h));
//        System.out.println(d.equals(f));
//        System.out.println(f.equals(i));


    }
}
