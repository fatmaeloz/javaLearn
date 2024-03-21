package j12_ArraList.Task;

import java.util.ArrayList;
import java.util.List;


public class task01 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

            ArrayList<String> newList = new ArrayList<>(List.of("Orange", "Kiwi", "Peach", "Banana", "Orange"));
            String str = "Orange";
            System.out.println(getCount(newList, str));
        }
        private static int getCount(ArrayList<String> newList, String str) {
            int count = 0;
            String[] str2 = newList.toArray(new String[0]);
            for (int i = 0; i < newList.size(); i++) {
                if (str2[i].equals(str)) {
                    count++;
                }
            }
            return count;



    }
}


