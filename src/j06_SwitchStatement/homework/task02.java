package j06_SwitchStatement.homework;

import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {


        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("gün giriniz");
        String gun = scan.next().toLowerCase();
        System.out.println("Haftanin bir gununu girin");
            

        switch (gun) {
            case "pazartesi":
                System.out.println("carsamba");

                break;
            case "sali":
                System.out.println("persembe");
                break;
            case "carsamba":
                System.out.println("cuma");
                break;
            case "persembe":
                System.out.println("cumartesi");
                break;
            case "cuma":
                System.out.println("pazar");
                break;
            case "cumartesi":
                System.out.println("pazartesi");
                break;
            case "pazar":
                System.out.println("Sali");
                break;
            default:
                System.out.println("Lütfen bir hafta günü girin");
        }
    }
}


