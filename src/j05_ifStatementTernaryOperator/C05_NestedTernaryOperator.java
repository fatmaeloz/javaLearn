package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C05_NestedTernaryOperator {
    /*
TASK :
Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
 */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı= scan.nextInt();
        System.out.println(sayı>0?(sayı<10?"Rakam":"Pozitif Sayı"):"Negatif");
    }

}
