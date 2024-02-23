package j11_Arrays.task;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..
//
      //  int[] arr = {15, 25, 22, 18, 30};
      //  int max = arr[0];
      //  for (int i = 0; i < arr.length; i++) {
      //      if (arr[i] > max) {
      //          max = arr[i];
      //      }
      //  }
      //  int secMax = arr[0];
      //  for (int i = 0; i < arr.length; i--) {
      //      if (arr[i] > secMax) {
      //          secMax = arr[i];
      //      }
//

      //  System.out.println("En büyük 2. elemanı: " + max);
        int[] intArray = {15, 25, 22, 18, 30};

        // İkinci en büyük elemanı bulmak için bir değişken oluştur
        int enBuyuk = Integer.MIN_VALUE;
        int ikinciEnBuyuk = Integer.MIN_VALUE;

        // Array'i tarayarak en büyük ve ikinci en büyük elemanları bul
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > enBuyuk) {
                ikinciEnBuyuk = enBuyuk;
                enBuyuk = intArray[i];
            } else if (intArray[i] > ikinciEnBuyuk && intArray[i] != enBuyuk) {
                ikinciEnBuyuk = intArray[i];
            }
        }

        // İkinci en büyük elemanı yazdır
        System.out.println("Arraydaki en büyük ikinci eleman: " + ikinciEnBuyuk);
        System.out.println("2.yol");
        int arr[]  = {15, 25, 22, 18, 30};
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int index = arr.length-2;
        System.out.println("En büyük ikinci eleman ="+arr[index]);
    }
}






