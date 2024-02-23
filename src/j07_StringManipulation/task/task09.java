package j07_StringManipulation.task;

import java.util.Scanner;

public class task09 {
     /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Lutfen bir ad giriniz");
         String ad = scan.nextLine();
         System.out.println("Lutfen bir soyad giriniz");
         String soyad = scan.nextLine();
         System.out.println(ad + " " + soyad);
     }


}
