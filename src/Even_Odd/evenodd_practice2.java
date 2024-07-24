package Even_Odd;

public class evenodd_practice2 {
    public static void main(String[] args) {
        int x = 100;
        int i;
        for (i = 1; i <= 100; i++) {
            System.out.println(i);


            if (i % 2 == 0) {
                System.out.println("even:"+i);
            } else {
                System.out.println("odd:"+i);
            }
        }



    }
}

