package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    /*
    Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
    Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir.
    Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur.
            */


// Task01-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = scan.nextInt();
        if (sayı % 2 == 0) {
            System.out.println();
            // condition(şart)  ? (if-ise) sart True için ACTION-> if body : (else-değilse) sart False için ACTION -> else body;


            // Task02-> girilen bir tamsayının  pozitif olmasını kontrol eden code create ediniz.
            System.out.println("bir sayı giriniz");
            int sayı2 = scan.nextInt();

// Task03-> girilen iki tamsayının buyugunu print eden code create ediniz
            // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.


 Object sonuç=(sayı*sayı2<0?sayı+sayı2:"Agam Devamkee");
            System.out.println("sonuç="+sonuç);
            //hap bilgi -> Ternary ciktisi farkli data type'lardan(int,String,boolean vb) tanimlanmissa
//tum data type atasi olan Hz.Adem classina(Object) atanir

        }
        }


    }

