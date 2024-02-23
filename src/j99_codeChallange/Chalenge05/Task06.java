package j99_codeChallange.Chalenge05;

import java.util.Scanner;

public class Task06 {
      /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString
     Girilen String ters print eden cde create ediniz
     input : javaCAN
     output : NACavaj
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Agam hele biseyler giresen : ");
        String str = input.nextLine();//Ali->ilA
        for (int i = str.length() - 1; i >= 0; i--) {//girilen str'nin son karakterinden ilkine kadar loop tanımlandı
            System.out.print(str.charAt(i));
        }


    }
}
