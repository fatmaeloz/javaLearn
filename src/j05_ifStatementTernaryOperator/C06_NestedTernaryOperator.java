package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
TASK :
Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.
 */
        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayı giriniz");;
        int sayı=Math.abs(scan.nextInt());
        System.out.println(sayı>999 && sayı<10000?sayı+" sayisi 4 basamakli":
                (sayı%2==0 ? sayı+ " sayisi 4 basamakli olmayan Cift sayi":sayı+" sayisi 4 basamakli olmayan tek sayi"));
    }
    }

