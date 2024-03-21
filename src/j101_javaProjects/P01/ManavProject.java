package j101_javaProjects.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManavProject {
    static ArrayList<String>urunListesi=new ArrayList<>(Arrays.asList("domat->1","balcan->2","fujiElma->3","çilek->4","muz->5"));
    static ArrayList<Double>  urunFiyatListesi=new ArrayList<>(Arrays.asList(28.5,35.3,40.2,50.0,85.7));
    static double toplamOdenecekMiktar=0;
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        System.out.println("marketime hoşgeldiniz");
        System.out.println(urunListesi);
        System.out.println(urunFiyatListesi);
    muşteriSeçim();
    
    }//main sonu

    private static void muşteriSeçim() {
        System.out.println("hangi urun istersin");
        int urunSecim = input.nextInt();
        if(urunSecim<6&&urunSecim>0){
            System.out.println("sectiginiz urunden kaç kılo ıstersın");
            double kilo=input.nextDouble();
            toplamOdenecekMiktar+=kilo*urunFiyatListesi.get(urunSecim-1);
            System.out.println("seçtiğin ürün :"+urunListesi.get(urunSecim-1)+"\n"+
                    "\n istediginiz kilo"+kilo+
                    "seçtiginiz urunun fiyatı:"+urunFiyatListesi.get(urunSecim-1)+"\n"+
                    "toplam odememiz:"+toplamOdenecekMiktar);




        }else System.out.println("adam gibi bişey giresin");
        muşteriSeçim();
    }

}
