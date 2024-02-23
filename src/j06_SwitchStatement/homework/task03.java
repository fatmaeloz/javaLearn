package j06_SwitchStatement.homework;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun
        // 2.gün Sali olsun
        // 3.gün Cuma olsun
        // 4.gün Cumartesi olsun
        // 5.gün Pazar olsun
        Scanner scan = new Scanner(System.in);
        System.out.println("gün giriniz");
        int gun = scan.nextInt();
        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Cuma");
                break;
            case 4:
                System.out.println("Cumartesi");
                break;
            case 5:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lütfen bir hafta günü girin");
        }


    }
}