package j99_codeChallange.Chalenge01;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        /*  task->
         girilen sıcaklık değerini Fahrenhayt'tan Santigrat derecesine çeviren code create ediniz.
         formül
         c = (f-32)*5/9
     */
        Scanner input =new Scanner(System.in);
        System.out.println("sıcaklığı giresen");
        double sıcaklık=input.nextDouble();
        System.out.println("sıcaklık derecesi:" +(sıcaklık -32)*5/9);
    }
}
