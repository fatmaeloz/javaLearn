package j12_ArraList.Task;

import java.util.ArrayList;
import java.util.List;

public class task18 {
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
        System.out.println("sayılar");
        System.out.println("sayilar = " + sayilar);
        System.out.println("sayilar = " + sayilar);





    }

    private static void IndexChange(List<Integer>sayılar) {
        int temp=sayılar.get(1);
      //  sayılar.set(1.sayılar.get(5));

/*
    private static void indexChange(List<Integer> sayilar) {
        int temp=sayilar.get(1);
        sayilar.set(1,sayilar.get(5));
        sayilar.set(5,temp);
        System.out.println("sayilar = " + sayilar);
*/










}


}
