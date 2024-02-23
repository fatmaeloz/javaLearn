package j99_codeChallange.Chalenge07;

import java.sql.SQLOutput;
import java.util.Scanner;




public class Task06 {

    /* task->
     Girilen  isim ve soyismin ilk harflerini büyük
     diğer harflerini küçük harf olarak print eden method create ediniz.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("adını gir");
        String ad = scan.next().toUpperCase();
        System.out.println("soyadını gir");
        String soyad = scan.next().toUpperCase();
        System.out.println("method öncesi :"+ad+" "+ soyad);
        System.out.println("method sonrası:"+name(ad,soyad));

        }

    private static String  name(String ad, String soyad) {

        return ad.charAt(0)+ad.substring(1).toLowerCase()+" "+soyad.charAt(0)+soyad.substring(1).toLowerCase();
    }


}// main sonu



