package j99_codeChallange.Chalenge04;

import java.util.Scanner;

public class Task02 {//Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci kelime giriniz");
        String kelime=scan.nextLine();
        System.out.println("ikinci kelime giriniz");
        String kelime2=scan.nextLine();
        System.out.println(kelime+kelime2);//1.yol
        System.out.println(kelime.concat(kelime2)); //2.yol

        }



    }
