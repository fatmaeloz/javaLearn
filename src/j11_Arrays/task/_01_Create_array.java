package j11_Arrays.task;

public class _01_Create_array {
     /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

    //Kodu aşağıya yazınız.
    public static void main(String[] args) {

            String[] meyveler = {"Apple", "Orange", "Banana", "Kiwi"};

            // Array'deki tüm elemanları yazdırma
            for (String meyve : meyveler) {
                System.out.println(meyve);
            }
                for (int i = 0; i < meyveler.length; i++) {
                    System.out.println(meyveler[i]);
            }
        }
    }




