package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
//asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

    public static void main(String[] args) {
    //    Scanner scan = new Scanner(System.in);
    //    System.out.println("Tamsayı giriniz");
    //    int sayi = scan.nextInt();
    //    boolean asalMı=true;
    //    for (int i = 2; i <= sayi; i++) {
    //        if (sayi % i == 0) {
    //            asalMı = false;
    //            break;
    //        }
    //    }
    //    System.out.println(asalMı?sayi+"sayisı asal sayısıdır":sayi+ " sayısı asal değildir");
//
        Scanner sacn=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= sacn.nextInt();
        boolean asalMi=true;//bayrak yukari
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){//tekrardan gelen herhangi bir sayiya bolunme sarti kontrol edildi
                asalMi=false;//bayrak asagi
                break;//dongu kirildi
            }
        }
        System.out.println(asalMi?sayi+" sayisi asal sayidir":sayi+" sayisi asal degildir");
    }
    }







