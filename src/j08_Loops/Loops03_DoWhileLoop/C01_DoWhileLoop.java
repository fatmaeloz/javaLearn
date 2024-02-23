package j08_Loops.Loops03_DoWhileLoop;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {


    /*
        While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
        do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise loop devam eder.
        sart false ise loop kırılır ve loopdan sonraki ilk satır çalışır.
        do-While loop->  game app. de daha çok kullanılır.
        Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
        en az bir kez çalışır..

        While-loop body'si icindeki kodun hic calistirilmama ihtimali vardir.
        zero execution mumkundur
        do-while loop'un body'si icindeki kod en az bir kere calisir.
        zero execution mumkun degildir

        While loop'un 2 tane negatif yonu vardir
        1- loop'dan once olusturdugumuz ve loop'da kullanacagimiz variable'lara
        yanlis bir deger verirsek, loop bodys'si hic calismayabilir
        2- loop condition'i loop body'sinden bir kez fazla calisir
        bu negatif yonler onu kullanilmaz yapacak buyuklukte degildir
        ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz

         */

        int yas = 28;
        while (yas > 40) {
            System.out.println("Seher hanim " + yas + " sdet team lead. Hayirli olsun while body calisti");
            yas++;
        }
//        while (yas<40){
//            System.out.println("Seher hanim "+yas+" sdet team lead. Hayirli olsun while body calisti");
//            yas++;
//        }
        do {
            System.out.println("Seher hanim " + yas + " sdet team lead. Hayirli olsun do-while body calisti");
            yas++;
        } while (yas > 40);
        // task-> girilen sayı 13 den kucuk ise "olaaa kazandınız :) " değilse saysı girişi isteyen code create ediniz...
        Scanner scan=new Scanner(System.in);
        int sayi;
        do {
            System.out.println("Bir sayi giriniz");
            sayi= scan.nextInt();
        }while (sayi>=13);

        System.out.println("olaaa kazandınız :) ");

        /*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
      //  Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin= scan.nextLine().replace(" ","");
        int harfSayisi=0;
        int rakamSayisi=0;
        int karakterSayisi=0;
        int index=0;

//        do {
//            if (metin.isEmpty()){
//                System.out.println("Bir metin giriniz");
//            } else if (Character.isDigit(metin.charAt(index))) {
//                rakamSayisi++;
//            } else if (Character.isLetter(metin.charAt(index))) {
//                harfSayisi++;
//            }else {
//                karakterSayisi++;
//            }
//            index++;
//        }while (index<=metin.length()-1);
//        System.out.println("karakterSayisi = " + karakterSayisi);
//        System.out.println("rakamSayisi = " + rakamSayisi);
//        System.out.println("harfSayisi = " + harfSayisi);

        //2.yol
        String rakam=metin.replaceAll("[^0-9]","");
        String harf=metin.replaceAll("[^a-zA-Z]","");
        String karakter=metin.replaceAll("\\w","");
        if (metin.isEmpty()){
            System.out.println("Bir metin giriniz");
        }
        System.out.println("karakter sayisi= " + karakter.length());
        System.out.println("harf sayisi = " + harf.length());
        System.out.println("rakam sayisi = " + rakam.length());

    }
}