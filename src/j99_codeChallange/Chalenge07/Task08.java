package j99_codeChallange.Chalenge07;

import java.util.Scanner;

public class Task08 {
        /* task->  girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz..
   artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
    */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir yil giriniz");
        int yil= scan.nextInt();
        if (yil % 4 == 0 && yil % 100!= 0 || yil % 400 == 0) {

            System.out.println("artık yıldır");



        }else{
            System.out.println("4 ile bölünemeyen yıllar artık yıl değildir.");
        }




    }// main sonu



}
