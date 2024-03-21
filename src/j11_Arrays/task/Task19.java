package j11_Arrays.task;

import java.util.Arrays;



public class Task19 {
        public static void main(String[] args) {


                //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
                // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
                // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
                int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
                int[][] arr2 = {{3, 4, 5}, {12}, {1, 1}};
               /* for (int i = 0; i < (Math.min(arr1.length, arr2.length)); i++) {
                        for (int j = 0; j < Math.min(arr1[i].length, arr2[i].length); j++) {
                                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
                       */
              //  public static void main(String[] args) {
                      //  int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};
/*
                int maxLength = Math.max(arr1.length, arr2.length);

                for (int i = 0; i < maxLength; i++) {
                        int sum = 0;
                        int[] innerArr1 = (i < arr1.length) ? arr1[i] : new int[0];
                        int[] innerArr2 = (i < arr2.length) ? arr2[i] : new int[0];

                        int minLength = Math.min(innerArr1.length, innerArr2.length);

                        for (int j = 0; j < minLength; j++) {
                                sum += innerArr1[j] + innerArr2[j];
                        }

                        System.out.println("Toplam " + (i + 1) + ". index: " + sum);
*///2.yol

                        int ilkDize = Math.max(arr1.length, arr2.length);
                        int[] newArr3 = new int[ilkDize];
                        for (int i = 0; i < ilkDize; i++) {
                                for (int j = 0; j < (Math.min(arr1[i].length, arr2[i].length)); j++) {
                                        newArr3[i] += arr1[i][j];
                                        newArr3[i] += arr2[i][j];
                                }
                        }
                        System.out.println(Arrays.toString(newArr3));}
        }





       

