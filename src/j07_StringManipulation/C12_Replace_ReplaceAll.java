package j07_StringManipulation;

public class C12_Replace_ReplaceAll {
    /** replace()
     * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
     * (update -set) saglar. Sonuc String'dir..
     *
     */
    public static void main(String[] args) {
        String str="madem geldin dünyaya çalış javaya";
        System.out.println("str = " + str);
        System.out.println("str.replace(\"a\", \"*\") = " + str.replace("a", "*"));
   // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
//(Regular Expressions)
//   \\s bosluk
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler

    }
}
