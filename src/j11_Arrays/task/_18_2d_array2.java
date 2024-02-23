package j11_Arrays.task;

import java.util.Arrays;

public class _18_2d_array2 {
    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        //Kodu aşağıya yazınız.
        int[][] nums = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};

        System.out.println("Your Array: " + Arrays.deepToString(nums));
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum+=nums[i][j];
            }
        }
        System.out.println("Array sum: " + sum);

    }
}

