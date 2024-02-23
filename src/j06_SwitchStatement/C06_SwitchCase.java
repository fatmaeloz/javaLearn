package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Haftanın bir gününü giriniz");
        String gün = input.next().toLowerCase();

        switch (gün) {
            case "pazartesi":
            case "salı":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Girilen gun HAFTAICI");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Girilen gun HAFTASONU");
                break;
            default:
                System.out.println("Hatali giris");
        }

    }
}
