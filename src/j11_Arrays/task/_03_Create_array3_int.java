package j11_Arrays.task;

public class _03_Create_array3_int {
    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..

        int[] arr = {25, 30, 30, 35, 100};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.print("Array'in elemanlarının toplamı:" + toplam);


    }
}



