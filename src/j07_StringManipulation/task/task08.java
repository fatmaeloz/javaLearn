package j07_StringManipulation.task;

import java.util.Scanner;

public class task08 {

    /* TASK :
     * Girilen  isim sadece 3 harfli olmalidir ternary
     * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = scan.nextLine();
        System.out.println(isim.length() > 3? isim.substring(0, 3) : isim);

        Scanner input = new Scanner(System.in);
        System.out.print("String giriniz: ");
        String str = input.next();

        if (str.length() == 3) {
/*
            String ilkHarf = str.substring(0, 1);
            String ikinciHarf = str.substring(1, 2);
            String ucuncuHarf = str.substring(2, 3);

            // 1. YOL
            if (!(ilkHarf.equals(ikinciHarf)) && !(ilkHarf.equals(ucuncuHarf)) && !(ikinciHarf.equals(ucuncuHarf))) {
                System.out.println("Girdiginiz String unique karakterlere sahip");
            }else {
                System.out.println("Girdiginiz String unique karakterlere sahip DEGIL");
            }

            // 2.YOL  -> aal
            if ((ilkHarf.equals(ikinciHarf)) || (ilkHarf.equals(ucuncuHarf)) || (ikinciHarf.equals(ucuncuHarf))) {
                System.out.println("Girdiginiz String unique karakterlere sahip DEGIL");
            } else {
                System.out.println("Girdiginiz String unique karakterlere sahip");
            }

        } else {
            System.out.println("Lutfen 3 harfli bir string giriniz.");
  */      }

    }
}
