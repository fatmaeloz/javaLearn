package j11_Arrays.task;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _10_reverse_String {
    private static Object reversed_string;

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
        Trick-> String split ile arraya atanmalı

         */
        String str="Hello World";
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        //String reverseString=sb.reverse().toString();
        //System.out.println("1.yol reverseString : "+reverseString);
        System.out.println("1.yol reverseString : "+sb.reverse());
        System.out.println("2.yol");
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }
}

























