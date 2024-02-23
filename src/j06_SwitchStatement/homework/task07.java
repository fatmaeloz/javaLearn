package j06_SwitchStatement.homework;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        // Task-> Girilen 3 basamaklı bir sayıyı harf karakteri ile print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();
        int sonucY = sayi / 100;
        int sonucO = (sayi - sonucY * 100) / 10;
        int sonucB = sayi % 10;

        switch (sonucY) {
            case 1:
                System.out.print("Yüz");
                break;
            case 2:
                System.out.print("İkiYüz");
                break;
            case 3:
                System.out.print("ÜçYüz");
                break;
            case 4:
                System.out.print("DörtYüz");
                break;
            case 5:
                System.out.print("BeşYüz");
                break;
            case 6:
                System.out.print("AltıYüz");
                break;
            case 7:
                System.out.print("YediYüz");
                break;
            case 8:
                System.out.print("SekizYüz");
                break;
            case 9:
                System.out.print("DokuzYüz");
                break;
            default:
                System.out.print("");
                break;
        }

        switch (sonucO) {
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmış");
                break;
            case 7:
                System.out.print("Yetmiş");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
            default:
                System.out.print("");
                break;
        }

        switch (sonucB) {
            case 1:
                System.out.print("Bir");
                break;
            case 2:
                System.out.print("İki");
                break;
            case 3:
                System.out.print("Üç");
                break;
            case 4:
                System.out.print("Dört");
                break;
            case 5:
                System.out.print("Beş");
                break;
            case 6:
                System.out.print("Altı");
                break;
            case 7:
                System.out.print("Yedi");
                break;
            case 8:
                System.out.print("Sekiz");
                break;
            case 9:
                System.out.print("Dokuz");
                break;
            default:
                System.out.print("");
                break;
        }
    }

}

