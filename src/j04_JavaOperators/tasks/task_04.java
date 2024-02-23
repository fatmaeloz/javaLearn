package j04_JavaOperators.tasks;

import java.util.Scanner;

public class task_04 {

    public static void main(String[] args) {

        /* 17  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();
        int num2 = dp.nextInt();

        // Kodu aşağıya yazınız.

        System.out.println("(num1 == num2) = " + (num1 == num2));
        System.out.println("num2 = " + num2);
          System.out.println("num1 = " + num1);
    }
    }
