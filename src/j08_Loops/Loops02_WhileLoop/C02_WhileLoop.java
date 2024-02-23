package j08_Loops.Loops02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    // task-> girilen tamsayının rakamları toplamını print eden code create ediniz.
// 2316->6+1+3+2       571622->2+2+6+1+7+5
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir tamsayı giriniz");
        int sayı = scan.nextInt();
        int rakamlarToplamı=0;

        while (sayı>0) {
            rakamlarToplamı+=sayı%10;
            sayı/=10;

        }
        System.out.println("rakamlarToplamı ="+rakamlarToplamı);
        //forile çözüm
        System.out.println("****for ile***");
    for(int i=sayı;i>0;i/=10){
        System.out.println( rakamlarToplamı+=i%10);
    }
    }
}
