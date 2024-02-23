package j10_MethodCreation;

public class C03_MethodDepo {
    /*
Farkli class'lardan meth call etmek icin clasName.methodName ile ya da class import edilerek call islemi yapilir
static method olarak call edilir->gokteki gunes gibi
Ayni classta method dogrudan name ile call edilir
 */
    //her classta main meth. tanimlama zorunlulugu yoktur.Belirli acsiyonlar icin ozel classlar tanimlanir

    public static void gecmeNotu(int not) {
        if (not >= 85) {
            System.out.println("TAKDIR belgesi kazandiniz");
        } else if (not >= 70) {
            System.out.println("TESEKKUR belgesi kazandiniz");
        } else if (not >= 50) {
            System.out.println("Tekrar dene");
        } else {
            System.out.println("MEB izin vermese sinifi da gecemezdin");
            //her classta main meth. tanimlama zorunlulugu yoktur.Belirli acsiyonlar icin ozel classlar tanimlanir

        }
    }
}