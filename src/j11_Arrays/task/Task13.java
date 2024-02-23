package j11_Arrays.task;

import java.util.Scanner;



public class Task13 {

        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */
        public static void main(String[] args) {

         //   int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
            // 3, 5+1, 2+7+9, 2+3+5+7
  /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */

            int[] arr = new int[8];
            Scanner scan = new Scanner(System.in);
            int[] arr1 = new int[8];
            int count =0;

            for (int i = 0; i < 8; i++) {
                System.out.println(i +1+ ". elemanı giriniz");
                arr[i] = scan.nextInt();
                if (arr[i] % 3 == 0) {
                    count++;
                }
            }
            System.out.println("count = " + count);

        } // main sonu


    }


