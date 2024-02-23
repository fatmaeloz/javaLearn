package j06_SwitchStatement.homework;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().toLowerCase().charAt(0);

             switch (ch){
              case 'v':System.out.println("Very"); break;
              case 'i':System.out.println("Important"); break;
              case 'p':System.out.println("Person"); break;
            default:System.out.println("Lutfen gecerli harf giriniz");
        }
    }
}




