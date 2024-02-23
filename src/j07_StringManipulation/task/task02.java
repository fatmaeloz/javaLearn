package j07_StringManipulation.task;

import java.util.Scanner;

public class task02 {
     /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Şifreyi girin: ");
          String password = scanner.nextLine();

          if (checkPassword(password)) {
               System.out.println("Şifre kabul edildi.");
          } else {
               System.out.println("Şifre kabul edilmedi.");
          }
     }

     public static boolean checkPassword(String password) {
          if (password.length() < 6) {
               return false;
          }

          char firstChar = password.charAt(0);
          char lastChar = password.charAt(password.length() - 1);

          if (!Character.isUpperCase(firstChar)) {
               return false;
          }

          if (!Character.isDigit(lastChar)) {
               return false;
          }

          return true;
     }
     }
