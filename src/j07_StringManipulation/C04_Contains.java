package j07_StringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        /*
    String içersinde istenen stringinin varlığını kontrol eder boolean değer return eder..
    char parametre -> CTE
     */
        // Task-> girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz...
        String str1="Basari gayret asiktir :)";
        System.out.println("str1 = " + str1);
        System.out.println("str1.contains(\"Basari\") = " + str1.contains("Basari"));//true
        //str1.contains('a');//CTE->char
        System.out.println("str1.contains(\"a\") = " + str1.contains("a"));
        System.out.println("str1.contains(\"Dogukan\") = " + str1.contains("Dogukan"));//false

        // Task-> girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz...
        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin= input.nextLine();
        System.out.println("Metinde sorgulatmak istediginiz kelimeyi giriniz");
        String kelime=input.next();
        System.out.println("metin.contains(kelime) = " + metin.contains(kelime));
        System.out.println("kelime.contains(metin) = " + kelime.contains(metin));
        System.out.println(metin.contains(kelime) ? "girilen " + metin + " de aranan " + kelime + " mevcuttur" : "girilen " + metin + " de aranan " + kelime + " mevcut DEGILDIR");

    }
}
