package j08_Loops.Loops01_ForLoop.Task;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */

        Scanner scan = new Scanner((System.in));
        System.out.println("bir kelime gir");
        String s = scan.next();

        for (int i = s.length() - 1; i >= 0; i--) {

            System.out.print(s.charAt(i));
        }


    }

}
