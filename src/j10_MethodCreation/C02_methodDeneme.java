package j10_MethodCreation;

import java.util.Scanner;

import static j10_MethodCreation.C02_MethodCreation.ortalamaAl;

public class C02_methodDeneme {
    public static void main(String[] args) {


        //girilen 3 sayının ortalamasını print eden coda create et
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println(i+".sayıyı giriniz");
            int sayı=scan.nextInt();
            toplam+=sayı;


        }
 ortalamaAl(toplam);

    }
    private static void ortalamaAl(int toplam) {
        System.out.println("girilen sayıların ortalaması : " + (toplam / 3));
    }
}