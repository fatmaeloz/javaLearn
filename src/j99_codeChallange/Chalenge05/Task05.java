package j99_codeChallange.Chalenge05;

import java.util.Scanner;

public class Task05 {
      /* task-> girilen satır ve sutun değerleri için aşağıdaki şekli print eden code create ediniz.
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Agam satır sayısı giresen : ");
        int satır = input.nextInt();

        System.out.print("Agam sutun sayısı giresen : ");
        int sutun = input.nextInt();

        for (int kat = 1; kat <=satır ; kat++) {//i=1,2,3.. satır kontrolı
            for (int daire = 1; daire <=sutun; daire++) {
                System.out.print("* ");

            }
            System.out.println();//dumy ->hayalet komut satır duzeni sağlar
        }
    }

}
