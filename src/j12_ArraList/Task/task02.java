package j12_ArraList.Task;

import java.util.ArrayList;
import java.util.List;

public class task02 {
      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {


            List<Integer> intList = new ArrayList<>(List.of(1,2,3,4,5));
            System.out.println(getSum(intList));
        }
        private static int getSum(List<Integer> intList) {
            int sum =0 ;
            for (int i = 0; i < intList.size(); i++) {
                sum+=intList.get(i);
            }
            return sum;

    }
}

