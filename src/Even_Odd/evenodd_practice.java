package Even_Odd;

import java.util.Scanner;

public class evenodd_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int x = sc.nextInt();

            if (x % 2 == 0) {
                System.out.println("even");

            } else {
                System.out.println("odd");
            }
        }
    }
