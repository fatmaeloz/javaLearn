package j11_Arrays.task;

import java.util.Arrays;

public class _15_Word_Count {
    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String str="Removes white space from both ends of a string";

        System.out.println("Original string: \"" + str + "\"");

        // Remove white space from both ends of the string
        String trimmedstr = str.trim();

        // Count the number of words
       int wordCount = trimmedstr.isEmpty() ? 0 : trimmedstr.split("\\s+").length;

        System.out.println("Number of words in the string: " + wordCount);


        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);
    }
}






