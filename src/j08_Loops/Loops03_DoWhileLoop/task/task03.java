package j08_Loops.Loops03_DoWhileLoop.task;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {


  /*  Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

    Ornek :  input : 16, output: 4 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        int karekok = 5;
        int count = 0;
        do {
            if (karekok * karekok == sayi) {
                System.out.println("Girilen sayi bir karekoku vardir");
                count++;
            }
            karekok++;
        } while (karekok * karekok <= sayi);
        if (count == 0) {
            System.out.println("Girilen sayinin karekoku yoktur");
        }

    }
}
