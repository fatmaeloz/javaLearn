package j08_Loops.Loops01_ForLoop.Task;

public class Task20 {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.


        // Satır sayısı kadar döngü
        for (int i = 1; i <= 5; i++) {
            // Her satır için boşlukları ekle
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("   "); // Boşlukları ekle
            }

            int num = i;
            // Her satır için numaraları ve boşlukları ekle
            for (int k = 1; k <= i; k++) {
                System.out.printf("%-3d", num); // Numarayı yazdır
                num += 5 - k; // Bir sonraki numarayı hesapla
            }
            System.out.println(); // Bir sonraki satıra geç
        }
        int satir = 5;
        int sayi = 1;

        for (int i = 1; i <= satir; i++) {
            sayi = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(sayi + " ");
                sayi += (satir - j);
            }
            System.out.println();


        }
    }

}




