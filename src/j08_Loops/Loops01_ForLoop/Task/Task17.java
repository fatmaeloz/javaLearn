package j08_Loops.Loops01_ForLoop.Task;

public class Task17 {

    public static void main(String[] args) {

        /*
        task->  0 ile 100 arasındaki hem 5'e, hem de 4'e tam bölünebilen  sayıları print eden code create edinz.

         */

                for (int i = 1; i <= 100; i++) {
                    if (i % 4 == 0 && i % 5 == 0) { // hem 4'e hem de 5'e tam bölünebiliyorsa
                        System.out.println(i); // sayıyı yazd
            }
        }


        }
    }

