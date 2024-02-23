package j99_codeChallange.Chalenge06;

import java.util.Scanner;

public class Task03_TekSayıAdedi {

    /* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("agam bi sayı giresen : ");
        int sayi = input.nextInt();//1453
        int tekSayiAdedi = 0;
        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");//loop dan gelen tek sayı print edildi
                tekSayiAdedi++;//loop dan gelen tek sayı adedi 1 artırıldı
            }
        }
        System.out.println();
        System.out.println("tekSayisi = " + tekSayiAdedi);


    }

}

