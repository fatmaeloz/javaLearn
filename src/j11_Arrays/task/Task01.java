package j11_Arrays.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<Integer>();

        System.out.println("*** Çıkmak için 0 (Sıfır) Girin ***");
        int sayi;
        do {
            System.out.print("Bir sayı girin: ");
            sayi = sc.nextInt();
            sayilar.add(sayi);
        } while (sayi != 0);

        // Diziyi büyükten küçüğe sırala
        Collections.sort(sayilar, Collections.reverseOrder());

        // Sıralanmış diziyi yazdır
        System.out.println("Sayıların büyükten küçüğe sıralanmış hali:");
        for (int s : sayilar) {
            System.out.print(s + " ");
        }
    }
}




