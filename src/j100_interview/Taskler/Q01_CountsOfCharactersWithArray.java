package j100_interview.Taskler;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir string giriniz : ");
        String str = sc.nextLine();

        String[] arr = str.split(""); //her bir karakteri ayirir
        System.out.println(Arrays.toString(arr));

        //count :sayac olustur
        String output = "";
        int counter = 0;

        //karakterleri karsilastirmak icin
        for (int i = 0; i < arr.length; i++) {
            counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    counter++;
                }
            }
            if (!output.contains(arr[i])) {
                output += arr[i] + " = " + counter + ", ";
            }
        }
        System.out.println("1.yol: " + output);

        //2.yol dogukan bey style
        int count = 0;
        output = "";
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j)))) {
                    count++;
                }
            }
            if (!output.contains(String.valueOf(str.charAt(i)))) {
                output += "" + String.valueOf(str.charAt(i)) + count + " ";
            }
        }
    }
}






















