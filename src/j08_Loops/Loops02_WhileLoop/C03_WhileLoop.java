package j08_Loops.Loops02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {


        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
// 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
// 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayı = scan.nextInt();
        int sayaç = 0;
        int bolenSayı = 1;
        while (bolenSayı <= sayı) {
            if(sayı%bolenSayı==0){
                sayaç++;
            System.out.println(bolenSayı + " ");

        }
        bolenSayı++;
    }
        System.out.println();
        System.out.println("girilen sayi : +sayi+'nin  +sayac+ tane tam boleni var");
}
}
