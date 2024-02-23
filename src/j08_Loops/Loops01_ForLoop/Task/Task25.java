package j08_Loops.Loops01_ForLoop.Task;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String s=scan.nextLine();
        boolean[] visited = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            char currentChar =s.charAt(i);

            if (!visited[currentChar]) {
                System.out.print(currentChar);
                visited[currentChar] = true;
            }
         }}}
      /*  String input = "merhaba dünya"; // Örnek girdi stringi

        // Her karakterin yalnızca bir kez yazılmasını sağlamak için bir boolean dizisi oluşturuyoruz
        boolean[] visited = new boolean[256]; // 256 ASCII karakter için bir dizi oluşturuluyor

        // String içindeki her karakteri kontrol ediyoruz
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Karakter daha önce yazdırılmadıysa
            if (!visited[currentChar]) {
                // Karakteri yazdır
                System.out.print(currentChar);

                // Karakterin zaten yazdırıldığını işaretle
                visited[currentChar] = true;
            }
            }
        }
*/

