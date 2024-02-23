package j99_codeChallange.Chalenge03;

import java.util.Locale;
import java.util.Scanner;

public class Task03_NestedTernary {

    /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Agam hele final notu  giresen : ");
            char finalNote = input.next().toUpperCase().charAt(0);
            System.out.println(finalNote == 'A' ? "Gayet Basarili" : finalNote == 'B' ? "Basarili" : finalNote == 'C' ? "Ha gayret" : "seney inş :(");
        /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */



        }

    }



