package Arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Single_dimensional_array {
    public static void main(String[] args) {
        ///INT
        // 1
//        int [] a = new int[5];
//
//        a[0]=2;
//        a[1]=4;
//        a[2]=6;
//        a[3]=8;
//        a[4]=10;
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);
//
//        for (int i= 0;i<a.length;i++) {
//            System.out.println(a[i]);
//
//        }
//          // 2
//            int [] b =new int[] {2,4,6,8,10};
//            System.out.println(b[0]);
//            System.out.println(b[1]);
//
//            for (int i= 0;i<b.length;i++){
//                System.out.println(b[i]);
//            }
//
//         // 3
//        int [] c = {2,4,6,8,10};
//        System.out.println(c[0]);
//        System.out.println(c[1]);
//
//        for (int i= 0;i<c.length;i++){
//            System.out.println(c[i]);
//        }
//
//        ////////STRING
//        String[] d = new String[5];
//        d[0] = "abc";
//        d[1] = "def";
//        d[2] = "ghi";
//        d[3] = "jkl";
//        d[4] = "mno";
//        System.out.println(d[0]);
//        System.out.println(d[1]);
//        System.out.println(d[2]);
//        System.out.println(d[3]);
//        System.out.println(d[4]);
//
//        for (int i = 0; i < d.length; i++) {
//            System.out.println(d[i]);
//
//        }
//
//        ////CHAR
//        char[]e=new char[3];
//        e [0] ='a';
//        e [1] ='b';
//        e [2] ='c';
//        System.out.println(e[0]);
//        System.out.println(e[1]);
//        System.out.println(e[2]);
//
//        for ( int i=0; i<e.length;i++){
//            System.out.println(e[i]);
//        }


        //size 5
//        int[] a = new int [5];
//        a[0]=2;
//        a[1]=4;
//        a[2]=6;
//        a[3]=8;
//        a[4]=10;
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);
//
//        for (int i=0; i<a.length;i++){
//            System.out.println(a[i]);
//
//        }
//
        //bubble sort

//        int[] a = {-4, -2, 1, 5, 3,0,-6,-1,-9}; //n=9 == n-1=(9-1)=8 passes
//        System.out.println("Array before sorting:" + Arrays.toString(a));
//        int size = a.length-1;  //length of array //n=9 == n-1=(9-1)=8 passes
//
//        for (int i=0; i<size;i++) {                        //no.of passes
//
//            for (int j=0;j<size;j++) {                     //swaping in each pass
//                if (a[j]>a[j+1]){
//                    int temp = a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//
//                }
//            }
//        }
//        System.out.println("Array after sorting:" + Arrays.toString(a));


        int b[] = {4, 2, 1, 5, 3};
        System.out.println("array beforing sorting:" + Arrays.toString(b));
        int size = b.length;   //n-1 = 5-1 =4
        for (int i = 0; i < size - 1; i++) {    //no of passes
            for (int j = 0; j < size - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;

                }

            }


        }
        System.out.println("array after sorting:" + Arrays.toString(b));

    }
}










