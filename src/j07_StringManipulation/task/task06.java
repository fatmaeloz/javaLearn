package j07_StringManipulation.task;

import java.util.Scanner;

public class task06 {
     /*
        Girilen String'in son karakterini silen code create ediniz...
         */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Lutfen bir string giriniz");
         String str = scan.nextLine();
         System.out.println(str.length() - 1);
     }
}
