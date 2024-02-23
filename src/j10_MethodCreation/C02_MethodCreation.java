package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {


       //  task-> girilen 3 sayının ortalamasını print eden METHOD create ediniz





            public static void main(String[] args) {//main level
                // task-> girilen 3 sayının ortalamasını print eden METHOD create ediniz
//        Scanner scan=new Scanner(System.in);
//        int toplam=0;
//        for (int i = 1; i <=3 ; i++) {
//            System.out.println(i+".sayiyi giriniz");
//            int sayi=scan.nextInt();
//            toplam+=sayi;
//        }
                ortalamaAl(topla());
            }//main sonu

            private static int topla() {
                Scanner scan = new Scanner(System.in);
                int toplam = 0;
                for (int i = 1; i <= 3; i++) {
                    System.out.println(i + ".sayiyi giriniz");
                    int sayi = scan.nextInt();
                    toplam += sayi;
                }
                return toplam;
            }

            static void ortalamaAl(int toplam) {
                System.out.println("girilen sayilarin ortalamasi : " + (toplam / 3));

                //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz


                //  public class Task02 {

                //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Adinizi giriniz");
//        String ad= scan.next();
//        System.out.println("Soyadinizi giriniz");
//        String soyAd= scan.next();
//        adSoyadKontrol1(ad,soyAd);
                // String safvet = adSoyadKontrol2("sAfVeT", "sEMa");
                //     System.out.println("ad soyad = "+safvet);
                //     System.out.println("adSoyadKontrol3() = "+

                //adSoyadKontrol3());//


                // /private static String adSoyadKontrol3() {
                //      Scanner scan = new Scanner(System.in);
                //      System.out.println("Adinizi giriniz");
                //      String ad = scan.next();
                //      System.out.println("Soyadinizi giriniz");
                //      String soyAd = scan.next();

                //      return ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase()
                //              + " " + soyAd.substring(0, 1).toUpperCase() + soyAd.substring(1).toLowerCase();
                //  }

                //  private static String adSoyadKontrol2(String ad, String soyAd) {
//        Str//eniAd=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()
//           //+" "+soyAd.substring(0,1).toUpperCase()+soyAd.substring(1).toLowerCase();
//        ret//eniAd;
                //      return ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase()
                //              + " " + soyAd.substring(0, 1).toUpperCase() + soyAd.substring(1).toLowerCase();
                //  }

                //  private static void adSoyadKontrol1(String ad, String soyAd) {
                //      System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase()
                //              + " " + soyAd.substring(0, 1).toUpperCase() + soyAd.substring(1).toLowerCase());

                //


            }}