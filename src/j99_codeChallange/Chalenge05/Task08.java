package j99_codeChallange.Chalenge05;

import java.util.Scanner;

public class Task08 {

    /*
    Task-> Girilen iki tamsayı arasındaki sayıların toplamını print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Agam  sayı1 giresen : ");
        int sayi1 = input.nextInt();

        System.out.print("Agam sayı2 giresen : ");
        int sayi2 = input.nextInt();
        int toplam = 0;//loop daki sayıların topalancagı bos container
        if (sayi1 < sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }
            System.out.println(sayi1 + " ile " + sayi2 + " arasındaki sayıların toplamı :" + toplam);
        } else if (sayi2 < sayi1) {
            for (int i = sayi1; i >= sayi2; i--) {
                toplam += i;
            }
            System.out.println(sayi1 + " ile " + sayi2 + " arasındaki sayıların toplamı :" + toplam);

        } else System.out.println("girilen sayılar eşit");
    }


}
