package j02_DataTypes_WrapperClass;

import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("Lütfen saniye giriniz");
        int saniye =sc.nextInt();
        int saat = saniye/3600;
        int kalanSaniye =saniye % 3600;
        int dk  =kalanSaniye/60;
        int sonSaniye=kalanSaniye % 60;
        System.out.println(saniye + " -> " + saat  );
    }
}