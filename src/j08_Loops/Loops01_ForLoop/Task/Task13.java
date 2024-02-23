package j08_Loops.Loops01_ForLoop.Task;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        */


        char chChar = 'A';
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(chChar + " ");

            }
            chChar++;
            System.out.println();

        }
    }

}

