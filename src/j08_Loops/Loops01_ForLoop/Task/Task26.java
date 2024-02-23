package j08_Loops.Loops01_ForLoop.Task;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz
        Scanner scan = new Scanner((System.in));
        System.out.println("bir sayi gir");
        int n = scan.nextInt();
        int toplam = 0;
        for (int i = n; i > 0; i/=10) {
            toplam += i%10;
        }
        System.out.println(toplam);



    }
}
