package j99_codeChallange.Chalenge08;

import java.util.Scanner;

public class Task05 {
    // task-> Girilen 8 tamsayının kaçının 3 e tam boludugunu print eden  code create ediniz.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[8];
        int count = 0;
        System.out.println("8 tamsayı gir");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + "index elemanı gir");
            arr[i] = scan.nextInt();
            if (arr[i] % 3 == 0) {
                count++;
            }


        }}

}// Class sonu


