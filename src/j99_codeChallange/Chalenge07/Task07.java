package j99_codeChallange.Chalenge07;

import java.util.Scanner;

public class Task07 {

    /* task ->
    İki integer sayının eşitliğini kontrol eden method create ediniz.

    num1 = num2 => true
    */


    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
         int num1 = scan.nextInt();
        System.out.println("iki sayı giriniz");
        int num2 = scan.nextInt();
        if (num1 == num2) {
            System.out.println("Eşit");
        } else {
            System.out.println("Eşit değil");
        }
        System.out.println(num1 == num2);
        System.out.println(num1 == num2? "Eşit" : "Eşit değil");





    }// main sonu



}// Class sonu
