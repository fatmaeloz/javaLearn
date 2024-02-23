package j08_Loops.Loops01_ForLoop.Task;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int sayı1 = scanner.nextInt();
        System.out.println("1. sayıyı giriniz");
        System.out.println("2. sayıyı giriniz");
        int sayı2 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz");

        for (int i = (sayı1 < sayı2 ? sayı1 : sayı2); i <= (sayı1 > sayı2 ? sayı1 : sayı2); i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}