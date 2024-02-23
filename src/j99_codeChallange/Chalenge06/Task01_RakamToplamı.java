package j99_codeChallange.Chalenge06;

import java.util.Scanner;

public class Task01_RakamToplamı {

    // Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("agam bi sayı giresen : ");
        int sayi=input.nextInt();//1453
        int rakamToplami=0;//loop dan gelen rakamların toplanacagı boş conteiner tanımlandı
        while (sayi>0) {


            rakamToplami+=sayi%10;//birler basm rakam rakamToplamına atandı
            sayi=sayi/10;//sayi=1453/10=145

        }
        System.out.println("Agam girilen sayının rakam topamı : "+rakamToplami);

    }// main sonu
}// Class sonu








