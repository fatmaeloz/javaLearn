package j99_codeChallange.Chalenge05;

public class Task09 {
    /*
Task-> 11'den 120'ye kadar 4 ve 6 ya tam bölünebilen sayı adedini ve toplamlarını print eden code create ediniz.
 */
    public static void main(String[] args) {
        int onIkiyeTamBolunenSayiAdedi = 0;
        int toplam = 0;
        for (int i = 11; i <= 120; i++) {
            if (i % 12 == 0) {//12,24,36,48,60,72,84,96,108,120
                toplam += i;
                onIkiyeTamBolunenSayiAdedi++;
            }
        }
        System.out.println("onIkiyeTamBolunenSayiAdedi = " + onIkiyeTamBolunenSayiAdedi + "\ntoplam = " + toplam);// 10

    }
}