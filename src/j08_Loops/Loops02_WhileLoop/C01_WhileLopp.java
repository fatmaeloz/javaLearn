package j08_Loops.Loops02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLopp {
    public static void main(String[] args) {


/*
    Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
    net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
            */
        //Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.
        for (int i = 3; i <= 20; i++) {


            System.out.print(i + " ");
        }
        System.out.println("**while ile***");
        int i = 3;//while loopun başlangıç değeri tanımlandı
        while (i <= 20) {//i 20 den küçük olduğu müddetçe loop devam edecek

            System.out.print(i + " ");
            i++;
        }
            // task02-> 7 kere javaCAN print eden code create ediniz
            int a = 7;
            while (a <= 1) {
                System.out.println("javaCAN ");
                a--;
            }
            for (int j = 0; j < 7; j++) {
                System.out.println("javacan");
            }
            // task03->2 basamaklı tek sayıları print eden code create ediniz
            int b = 11;
            while (b < 100) {
                System.out.println(i + " ");
                b+= 2;
            }


            // task04->girilen ifadeyi tersten  print eden code create ediniz
            Scanner scan = new Scanner(System.in);
            System.out.print("bir metin giriniz");
            String str = scan.nextLine();
            int harfSayısı = str.length();
            while (harfSayısı > 0) {
                System.out.print(str.charAt(harfSayısı - 1));
                harfSayısı--;
            }
// task06->girilen pozitif  tamsayıya kadar sayıların toplamını  print eden code create ediniz
                System.out.println("pozitif bir tam sayı giriniz");
                int sayı=scan.nextInt();
                int toplam=0;
                int start=1;
                if(sayı>=0) {
                    while (start <= sayı) {
                        toplam += start;
                        start++;
                    }
                }else System.out.println("pozitif bir sayı demedim mi");

                    System.out.println("toplam="+toplam);
// task06->girilen tamsayının faktöriyelini  print eden code create ediniz

int factorıyel=1;
while(sayı>1){
    factorıyel*=sayı;
    sayı--;

}
        System.out.println("factorıyel = " + factorıyel);


    }
            }
