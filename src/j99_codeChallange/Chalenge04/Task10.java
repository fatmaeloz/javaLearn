package j99_codeChallange.Chalenge04;

public class Task10 {
    // Task-> "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde print eden code create ediniz.

    public static void main(String[] args) {
        String str = "   Java ogrenmek123 Cok guzel@      ";
        System.out.println("str = " + str);//    Java ogrenmek123 Cok guzel@
        str= str.replaceAll("\\d", "")
                .replace("C", "c")
                .replace("@", "")
                .trim();
        System.out.println("str = " + str);//Java ogrenmek cok guzel


    }
}