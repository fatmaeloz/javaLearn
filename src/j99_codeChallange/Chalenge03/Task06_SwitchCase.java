package j99_codeChallange.Chalenge03;

import java.util.Scanner;

public class Task06_SwitchCase {
    /*  Task->
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
          */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam hele harf  giresen : ");
        char harf = input.next().toUpperCase().charAt(0);
        System.out.println("   ***  ternary cozum   ***   ");
        // System.out.println(harf == 'A' ? "Java is easy" : harf == 'B' ? "Java is fun" : harf == 'C' ? "I need to study :)" : "ebık gabık :)");

        System.out.println("   ***  switch cozum   ***   ");
        //    switch (harf) {
        switch (input.next().toUpperCase().charAt(0)) {
            case 'A':
                System.out.println("Java is easy");
                break;
            case 'B':
                System.out.println("Java is fun");
                break;
            case 'C':
                System.out.println("I need to study :)");
                break;
            default:
                System.out.println("hatalı giris yaptınız");

        }
        System.out.println("Agam bu satır print edildiyse code cincix dewamke :)");

    }
}




