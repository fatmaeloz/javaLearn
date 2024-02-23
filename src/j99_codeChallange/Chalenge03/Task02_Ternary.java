package j99_codeChallange.Chalenge03;

import java.util.Scanner;

public class Task02_Ternary { /* Task->
 * Girilen fiyat için
 * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
 * print eden code create ediniz
 */
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Agam hele fiyat giresen : ");
            int fiyat = input.nextInt();


            System.out.println("   ***   if cozum   ***   ");

            if (fiyat>=10){//genel sart
                if (fiyat>=10 && fiyat<20) {
                    System.out.println("normal");
                }else System.out.println("pahalı");
            }else System.out.println("ucuz");

            System.out.println("   ***   ternary cozum   ***   ");
            System.out.println(fiyat < 10 ? "ucuz" : ( fiyat < 20 ? "normal" : "pahalı"));

        }
}

