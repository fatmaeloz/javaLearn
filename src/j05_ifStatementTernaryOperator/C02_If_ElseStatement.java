package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C02_If_ElseStatement {
    public static void main(String[] args) {
        // task-> girilen yasın 18 den buyulugunu kontrol eden code create ediniz..

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
    int yaş= sc.nextInt();
    if(yaş>18){
        System.out.println("Hayırlı olsun git bana bir sigara al");

    }else System.out.println("Buyude gel");

  /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayıyı giriniz");

        int sayı=scan.nextInt();
        if(sayı<0) System.out.println(sayı+"sayısı negatiftir");
else if(sayı>0){
            System.out.println(sayı +"sayısı pozitiftir");
        }else System.out.println(sayı +"sayısı notr'dür");
    }
}
