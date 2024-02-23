package j99_codeChallange.Chalenge02;

import java.util.Scanner;

public class Task07_ifstantment {
    /*

task->
Kullanicinın  yas ve kilo bilgileri için
18 yasindan kucuk ise kan bagisi yapamaz.
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
print eden code create ediniz.

*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yaşını gir");
        int yas = input.nextInt();
        System.out.println("kilo gir");


        if (yas >= 18) {//genel sart-> yas kontrolu
            System.out.println("Agıdeşşş kilonu girive bakennn : ");
            int kilo = input.nextInt();
            if (kilo >= 50) {//özel sart-> kilo kontrolu

                System.out.println("kan bağısı yapabilir siniz");
            } else System.out.println("kan bagısı için yasınız uygun ama kilonuz eksik");

        } else System.out.println("kan bagısı için yasınız uygun değil");

    }// main sonu


}

