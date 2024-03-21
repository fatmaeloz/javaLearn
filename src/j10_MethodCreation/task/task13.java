package j10_MethodCreation.task;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {

    /*
    Task-> girilen iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false return eden METHOD create ediniz

    Örnekler:
   ("abc", "bc") ➞ true
   ("abc", "d") ➞ false
   ("samurai", "zi") ➞ false
   ("feminine", "nine") ➞ true
   ("convention", "tio") ➞ false
    */

        String x = "feminine";
        String y = "nine";
        String z = "tio";

        kontrolEt(x, y, z);


    }//main sonu

    public static void kontrolEt(String x, String y, String z) {

        System.out.println(x.endsWith(y));
        System.out.println(x.endsWith(z));

/*
        private static boolean controlEnd() {
            Scanner scan = new Scanner(System.in);
            System.out.println("metin girin : ");
            String birinci = scan.nextLine();
            System.out.println("metin girin : ");
            String ikinci = scan.nextLine();
            boolean esitMi = false;

            if (birinci.endsWith(ikinci)) {
                esitMi = true;

            }
            return esitMi;


        private static boolean controlEnd() {
            Scanner scan = new Scanner(System.in);
            System.out.println("metin girin : ");
            String birinci = scan.nextLine();
            System.out.println("metin girin : ");
            String ikinci = scan.nextLine();
            boolean esitMi = false;

            if (birinci.endsWith(ikinci)) {
                esitMi = true;

            }
            return esitMi;

        }
        private static boolean controlToString() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter first string: ");
            String first = sc.next();
            System.out.println("Please enter second string: ");
            String second = sc.next();
            boolean isContains = false;
            int count = 0;
            int index = 0;
            for (int i = second.length()-1; i >= 0; i--) {
                if (second.charAt(i) == first.charAt(first.length() - 1 - index)) {
                    count++;
                }
                index++;
            }
            if (count == second.length()) {
                isContains = true;
            }
            return isContains;

        }
    }//Class sonu

*/
    }//Class sonu



}//Class sonu

