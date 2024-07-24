package Collections.Stack;
//STACK=stack is a class in java which implements the collection interface and extends the vector class
// and represents the LIFO principle3

//LIFO-LAST IN FIRST OUT
//FIFO=FIRST IN FIRST OUT

//push
//pop
//peek
//search
import java.util.*;


public class stack {
    public static void main(String[] args) {
    Stack<String>books=new Stack<>();

//books.add("red");
//books.add("black");
//books.add("white");



//push (adding elements)
        books.push("red");
        books.push("black");
        books.push("white");
       // System.out.println(books);


        //pop(removing last element)

        //System.out.println(books.pop());
       //System.out.println(books);

            //peek(displaying last added element)

        //System.out.println(books.peek());
        //System.out.println(books);

        //search(searching elements from top to bottom 1,2,3...)

//        System.out.println(books.search("red"));  //3
//        System.out.println(books.search("white"));//1
//       System.out.println(books.indexOf("white"));  //2
//        System.out.println(books);

            //empty
        //System.out.println(books.empty());  //false

        /////////////////////////////////////////////////////////////////////////////

        //1...add
        //System.out.println(books);


        //2..reterival

      // System.out.println(books.get(1));

          //3..updation
        //books.set(0,"yellow");
        //System.out.println(books);

        //4..deletion
      //books.remove(0);  //by passing index
        //System.out.println(books);

        //books.remove("red"); //by passing element
        //System.out.println(books);

        //books.removeAll(books);
        //System.out.println(books);  //removing entier collection

        //5..verification

//        System.out.println(books.contains("red")); //true
//
//        System.out.println(books.contains("green"));//false
//
//        System.out.println(books.containsAll(books));  //true


    }
}
