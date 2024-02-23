package j99_codeChallange.Chalenge08;

import java.util.Arrays;

public class Task01 {
    	/* task->
        verilen bir int array icin elemanlarin karelerini print eden code create ediniz.
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

    public static void main(String[] args) {
        int[] array = {2, 6, 4, 5, 8, 9};

      // for (int i = 0; i < array.length; i++) {
      //     int kare = array[i] * array[i];
      //     System.out.print(kare+ " ");
      //     // if (i != array.length - 1) {
              //  System.out.print(",");
         //   }
            int arr[] = {2, 6, 4, 5, 8, 9};
            System.out.println("array elements: " + Arrays.toString(arr));//[2, 6, 4, 5, 8, 9]
            int arr1[]=new int[arr.length];// boş bir array tanımlandı
            for (int i = 0; i < arr.length; i++) {//arr elemanlarını tekrara alan bir loop tanımlandı
                arr1[i] = arr[i]*arr[i];

            }
            System.out.println("array elements: " + Arrays.toString(arr));//[2, 6, 4, 5, 8, 9]
            System.out.println("array1 elements: " + Arrays.toString(arr1));//[4, 36, 16, 25, 64, 81]


        }// main sonu







}// main sonu


