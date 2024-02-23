package j99_codeChallange.Chalenge04;

import java.util.Scanner;

public class Task11 {
    // Task-> Girilen  isim ve soyismini  hangisinin daha uzun oldugunu print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agıdeşşş  bi  isim girive bakennn : ");
        String isim = input.next();
        System.out.println("Agıdeşşş  bi  soyisim girive bakennn : ");
        String soyisim = input.next();
        System.out.println("   ***  if cozum   ***   ");
        if (isim.length() > soyisim.length()) {
            System.out.println("isim daha uzun");
        } else if (isim.length() < soyisim.length()) System.out.println("soyisim daha uzun");
        else System.out.println("isim ve soyisim eşit uzunlıkta");

        System.out.println("   ***  ternary cozum   ***   ");

        //   System.out.println(kelim.contains("xyz") ? "isim daha uzun" : "soyisim daha uzun");


    }
    }
