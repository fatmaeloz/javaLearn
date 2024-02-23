package j08_Loops.Loops02_WhileLoop.task;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz


            Scanner sc = new Scanner(System.in);
            int toplam = 0;
            int adet = 0;

            while (toplam <= 333) {
                System.out.print("Bir sayı girin: ");
                int sayi = sc.nextInt();
                toplam += sayi;
                adet++;
            }

            System.out.println("Toplam " + adet + " sayı girdiniz.");
            System.out.println("Girilen sayıların toplamı: " + toplam);
        }
        }


