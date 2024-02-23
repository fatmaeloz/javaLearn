package j99_codeChallange.Chalenge02;

import java.util.Scanner;

public class Task04_ifsatantment {
    /* Task ->
     * Girilen Y/N  degerlerini
     * print eden code create ediniz..
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("   *** char cozum   ***   ");
        System.out.print("Agam hele bir Y ya da N  giresen : ");

        //  char karakter = input.next().charAt(0);
        //  if (karakter == 'Y' || karakter=='y') {
        //      System.out.println("YES");
        //  } else if (karakter=='N'||karakter=='n') {
        //      System.out.println("NO");
        //  }else System.out.println("agam adam gibin bişey giresen :(");


        System.out.println("   *** String cozum   ***   ");
        String karakter = input.nextLine();

        if (karakter.equalsIgnoreCase("y")) {
            System.out.println("YES");
        } else if (karakter.equalsIgnoreCase("n")) {
            System.out.println("NO");
        } else System.out.println("agam adam gibin bişey giresen :(");
         /* Task->
 Girilen jobTitle data için : Eger jobTitle
 qa ise print "is unvaniniz Quality Analyst."
 dev ise print "is unvaniniz Developer."
 ba ise print "is unvaniniz Business Analyst."
 pm ise print "is unvaniniz Project Manager."
 print eden code create ediniz...
*/
    }
}












    

