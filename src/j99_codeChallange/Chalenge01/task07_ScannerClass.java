package j99_codeChallange.Chalenge01;

import java.util.Scanner;

public class task07_ScannerClass {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("İki doğal sayı giriniz");
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println("Toplam ve farkı: " + (a + b) + "Toplamı" + (a - b) + "Farkı");
    }
}