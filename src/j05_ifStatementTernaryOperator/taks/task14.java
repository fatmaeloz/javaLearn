package j05_ifStatementTernaryOperator.taks;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        String cnsyt = scn.next();
        if (cnsyt.equalsIgnoreCase("Kadın")) ;
        {
            System.out.println("yaşınızı girınız");
            int yaş = scn.nextInt();
            if (yaş > 60) {
                System.out.println("prim gununuzu giriniz");
                int prim = scn.nextInt();

            } else if (cnsyt.equalsIgnoreCase("erkek")) {
            } else System.out.println("hatalı giriş yaptın");
        }
        if (cnsyt.equalsIgnoreCase("Kadin")){
            System.out.println("yasinizi giriniz");
            int yas= scn.nextInt();
            if (yas>=60){
                System.out.println("Prim gununuzu giriniz");
                int primGunu=scn.nextInt();
                if (primGunu>=6000){
                    System.out.println("Tebrikler emekli olabilirsiniz");
                }
            }else {

            }
        } else if (cnsyt.equalsIgnoreCase("erkek")) {

        }else System.out.println("Hatali giris yaptin");




    }}