package j06_SwitchStatement.homework;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
		/*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("ay giriniz");
        String ay=scan.next().toLowerCase();
        switch (ay) {

            case  "Ocak":
            case "Mart":
            case "Mayıs":
            case "Temmuz":
            case "Ağüstos":
            case "Ekim":
            case "Aralık":
                System.out.println("31");
                break;
            case  "Nisan":
            case "Haziran":
            case "Eylül":
            case "Kasım":
                System.out.println("30");
                break;
            case"Şubat":
                System.out.println("Lutfen yil giriniz : ");
                int year = scan.nextInt();
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("29");
                } else if (year % 4 != 0) {
                    System.out.println("28");
                } else {
                    System.out.println("hatali giris");
                }
                break;
            default:
                System.out.println("hatali giris");
                System.out.println();


        }


    }
}