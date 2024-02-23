package j99_codeChallange.Chalenge04;

import java.util.Scanner;

public class Task04 {
    /* Task->
     * Girilen  bir kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana  degil ise girilen kelimeyi print eden code create ediniz.
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.println("Agıdeşşş 1. kelimeyi girive bakennn : ");
            String kelime = input.next();
            String sonIki = kelime.substring(kelime.length() - 2);
            if (kelime.length() >= 3) {//girilen kelimenin 3 veya fazla harf kontrolu
                //System.out.println(kelime.substring(kelime.length() - 2) + kelime.substring(kelime.length() - 2) + kelime.substring(kelime.length() - 2));
                System.out.println(sonIki + sonIki + sonIki);
            } else System.out.println(kelime);

        }
    }
