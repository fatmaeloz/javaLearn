package j08_Loops.Loops01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        // Task-> girlen sayıdan 100'e kadar 4'un katı olan tamsayıları yan yana print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = scan.nextInt();
        if (sayı < 100 && sayı > 0) {
            for (int i = sayı; i < 100; i++) {
                if (i % 4 == 0) {
                    System.out.println(i + " ");
                }
            }
        } else System.out.print("bu sayı kabul edilmedi");
    }
}