package j99_codeChallange.Chalenge04;

import java.util.Scanner;

public class Task01 {

    //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isim ve soyisim giriniz");
        String ad = scan.nextLine();

        //System.out.println("ad");

        if (ad.indexOf(" ") == ad.lastIndexOf(" ")) {
            System.out.println(ad.substring(0).toUpperCase());
        } else System.out.println("girilen isim 2 kelime değil.");

        Scanner input = new Scanner(System.in);
        System.out.println("Agıdeşşş adını girive bakennn : ");
        String name = input.next();
        System.out.println("Agıdeşşş soyadını girive bakennn : ");
        String surname = input.next();

        System.out.println(name.toUpperCase() + " " + surname.toUpperCase());//

    }
}
        //System.out.print("isim ve soyisim giriniz: ");
        //String text = scan.nextLine();
//        System.out.println(text);

        //if (text.indexOf(" ") == text.lastIndexOf(" ")) {
          //  System.out.println(text.substring(0).toUpperCase());
        //} else System.out.println("girilen isim 2 kelime değil.");





