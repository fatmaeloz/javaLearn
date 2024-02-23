package j08_Loops.Loops01_ForLoop.Task;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayı=scan.nextInt();
        for(int i=2;i<sayı;i++) {
            if (sayı % i == 0){
                System.out.println("girilen sayı asal ");
            } else {
                System.out.println("girilen sayı asal değil");
            }
            System.out.println(sayı + "'nin asal olmasını kontrol edildi.");

        }



        }



    }

