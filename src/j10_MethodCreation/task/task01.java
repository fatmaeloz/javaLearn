package j10_MethodCreation.task;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sayi2 = input.nextInt();
        if (sayi1 == sayi2) {
            System.out.println("eşit");

        } else {
            System.out.println("eşit değil");

        }


    }//main sonu


}
