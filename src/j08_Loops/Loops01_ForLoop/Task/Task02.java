package j08_Loops.Loops01_ForLoop.Task;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.
       ey edip adanada pide ye
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("metni girin");
        String metin = scan.nextLine();
        System.out.println("metin = " + metin);
        String tersMetin = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
        tersMetin += metin.charAt(i);
    }
        System.out.println("tersMetin = " + tersMetin);
//        if (metin.equalsIgnoreCase(tersMetin)){
//            System.out.println("Girilen metin PALINDROM'dur");
//        }else System.out.println("Girilen metin PALINDROM degildir");
        System.out.println(metin.equalsIgnoreCase(tersMetin)?"Girilen metin PALINDROM'dur":"Girilen metin PALINDROM degildir");
        //En son sartimizi ele aldik

    }


}


