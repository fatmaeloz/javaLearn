package j11_Arrays.task;

public class _02_Create_array2 {

    /*          int Array oluşturun.
                elemanları : 13, 15,14,16,16
                Arrayin elemanlarını yazdırın.
     */
    // Kodu aşağıya yazınız..

    public static void main(String[] args) {
        int[] sayılar={13,15,14,16,16};
        for (int sayı : sayılar){
            System.out.print(sayı + " ");

        }
        for (int i = 0; i < sayılar.length; i++) {
            System.out.println(sayılar[i]);
        }
    }
}


