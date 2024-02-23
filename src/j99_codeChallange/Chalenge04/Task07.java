package j99_codeChallange.Chalenge04;

import java.util.Scanner;

public class Task07 {

    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Agıdeşşş  bi  kelime girive bakennn : ");
        String kelime = input.next();
        System.out.println("   ***  if cozum   ***   ");
        if (kelime.contains("xyz")) {
            System.out.println(true);
        } else System.out.println(false);

        System.out.println("   ***  ternary cozum   ***   ");

        System.out.println(kelime.contains("xyz") ? true : false);

    }
}