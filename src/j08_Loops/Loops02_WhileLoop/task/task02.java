package j08_Loops.Loops02_WhileLoop.task;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner sc = new Scanner(System.in);
        int sayı1 = sc.nextInt();
        int sayı2 = sc.nextInt();
        for (int i = 1; i <= sayı1; i++) {
            for (int j = 1; j <= sayı2; j++) {
                System.out.print(i + " " + j + " ");
            }
            System.out.println();
        }
        System.out.println("**while ile***");
        int i = 1;
        while (i <= sayı1) {
            for (int j = 1; j <= sayı2; j++) {
                System.out.print(i + " " + j + " ");
            }
            System.out.println();
            i++;
        }

    }
}