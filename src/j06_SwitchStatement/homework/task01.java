package j06_SwitchStatement.homework;

import java.util.Scanner;

public class task01 {

        public static void main(String[] args) {
            //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.
            Scanner scan = new Scanner(System.in);
            System.out.println("tamsayı giriniz");
            int sayi = scan.nextInt();
            if (sayi >= 10) {



                int OnBas=((sayi / 10) %10);


                switch (OnBas) {
                    case 0:
                        System.out.println("sıfır");

                    case 1:
                        System.out.println("bir");
                    case 2:
                        System.out.println("iki");
                        break;
                    case 3:
                        System.out.println("üç");
                        break;
                    case 4:
                        System.out.println("dört");
                        break;
                    case 5:
                        System.out.println("beş");
                        break;
                    case 6:
                        System.out.println("alti");
                        break;
                    case 7:
                        System.out.println("yedi");
                        break;
                    case 8:
                        System.out.println("sekiz");
                        break;
                    case 9:
                        System.out.println("dokuz");
                        break;
                    default:
                        System.out.println("Yanliş giriş");
                }
            } else System.out.println("Lutfen en az iki basamaklı tamsayi girin");
        }
}












