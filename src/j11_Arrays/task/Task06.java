package j11_Arrays.task;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.

        */
      // Scanner sacn = new Scanner(System.in);
      // System.out.println("kaç elemanlı bir array istersin: ");

      // int[] arr1 = {7, 25, 13, 98, 51, 42};
      // int[] arr2 = new int[arr1.length];

      // for (int i = 0; i < arr1.length; i++) {
      //     if (arr1[i] % 2 == 1) {
      //         arr2[i] = arr1[i];
      //     }
      // }
      // System.out.println("arr2 = " + Arrays.toString(arr2));
      // // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz
      // int[] arr1 = {25, 33, 45, 78, 99, 86, 47};
      // Arrays.sort(arr1);
      // sırala(arr1);


    }

    private static void sırala(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        int count = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            arr2[count] = arr1[i];
            count++;
        }
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

    }//main sonu


}

