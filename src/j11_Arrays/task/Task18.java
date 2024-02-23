package j11_Arrays.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task18 {
    public static void main(String[] args) {
        /* Task->  Verilen bir listede, istenen iki index'deki elementlerin yerini
         kalici olarak degistiren bir method create ediniz

         */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}
        int arr[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};


        int [] arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i]+=arr[i][j];
            }

        }
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
    }
}
















