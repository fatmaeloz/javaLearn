package j03_ScannerClasss_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

        //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
//Scanner Class'i Java nin util kutuphanesindedir.

// kullanıcıdan veri almak içinn şu 3 adım takip edilir
//1. adım-> Scanner class'dan obj create edilir.

//  Scanner input = new Scanner(System.in);// Scanner classından input isminde değerini System içinden alan bir obj.

//  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
//  System.out.print("adınızı giriniz :");

//  // 3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.
public static void main(String[] args) {


// task-> kullanıcının girdigi değere göre karenin alanını print eden code create ediniz
    //1.adım Scanner obj create
        Scanner scan=new Scanner(System.in);
        //2.adım bilgilendirme
        System.out.println("Alanını istediginiz karenin bir kenarını giriniz");
//3.adım Kullanıcının girdiği değeri uygun bir veriableye atama
    int kenar= scan.nextInt();
  //  int kareAlanı=kenar*kenar;
   // System.out.println("kareAlanı = " + kareAlanı);
    System.out.println("kareAlanı = " + (kenar*kenar));
/*
 Task->
 Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
 Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
 1 seker = 1.7 gr
 Ornek : Input : cay sayisi : 10 seker sayisi :
         Output : Yilda 12.41 kg seker kullaniyorsunuz
 */
    //2.adım
    System.out.println("günde kac bardak cay içiyorsunuz");
    //3.adım
    int günlükÇayMiktarı=scan.nextInt();
    //şeker miktarı için
    System.out.println("çaya kaç şeker atıyorsunuz?");
    int şekerSayısı= scan.nextInt();
    System.out.println("yılda "+((günlükÇayMiktarı*şekerSayısı*1.7*365)/1000)+" kg şeker kullanıyorum");
}
    }

