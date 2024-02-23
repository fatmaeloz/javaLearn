package j04_JavaOperators.j01_AritmetıcOperators;

import java.util.Scanner;

public class C01_AritmeticOperators {
    public static void main(String[] args) {


    /*
Islem Onceligi:
 1)üs ve Parantez ici islemler
 2)Carpma ve bolmeler
 3)Toplama ve cikarmalar
*/
        int a = 13;
        int b = 17;
        int c = 47;
        System.out.println(a + b * c);
        System.out.println(b + a * c);
        System.out.println("c/a= " + (c / a));

        System.out.println("b+(c-2*a)/2 = " + (b + (c - 2 * a) / 2));//27
        System.out.println("(c-a/(b-c)+a*b) = " + ((c - a / (b - c) + a * b)));//268
        int d = 12;
        double e = 4;
        float f = 4f;

        System.out.println("d/e = " + (d / e));
        System.out.println("d+e = " + (d + e));
        System.out.println("(e/d) = " + (e / d));
        System.out.println("(f/d) = " + (f / d));
//farkli data type ariymetic islemlerde sonuc ciktisi buyuk olanin data type olarak verilir
        //modolus işlemi iki sayının bolumunden KALANI int olarak verir
// cift sayı(even): 2'ye bolumunden kalan 0 olan-> sayı%2==0
// tek sayı(odd): 2'ye bolumunden kalan 1 olan-> sayı%2==1

        System.out.println(1453 % 2 + (1453 % 2));

        int g = 2;
        int h = 3;
        String s = "javaCAN";
//Task -> g h s variable  kullanarak 61javaCAN-1 print eden code create ediniz.
        System.out.println("" + (g * h) + (h - g) + s + (g - h));


        /* Task->
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" üç basamaklı bir sayı giriniz");
        int sayı1 = input.nextInt();
        int birlerBas = sayı1 % 10;
        int yuzlerBas = sayı1 % 100;
        System.out.println("birlerBas = " + yuzlerBas);
        System.out.println("toplam = " + (sayı1 % 10 + sayı1 % 100));
        System.out.println("Toplam = " + (birlerBas + yuzlerBas));





        /*Task->6
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" üç basamaklı bir sayı giriniz");
        int sayı = scan.nextInt();
        int birlBas = sayı % 10;
        int onl = (sayı / 10) % 10;
        int yuzBas = sayı / 100;
        System.out.println("Girdiginiz sayinin birler basamagi : " + birlerBas + "\n"
                + "Girdiginiz sayinin onlar basamagi : " + onl + "\n"
                + "Girdiginiz sayinin yuzler basamagi : " + yuzlerBas);


    }
}