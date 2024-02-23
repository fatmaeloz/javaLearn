package j08_Loops.Loops01_ForLoop.Task;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı gir");
        int n = scan.nextInt();


        int toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += i * i;
        }
            System.out.println("Girilen sayıya kadar olan sayıların karelerinin toplamı:  "+ toplam);

        }
    }


