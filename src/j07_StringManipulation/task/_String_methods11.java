package j07_StringManipulation.task;

public class _String_methods11 {
    /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

    //Kodu aşağıya yazınız.
    public static void main(String[] args) {
        String str="apple";
        System.out.println(str.equalsIgnoreCase("Apple"));
    }
}
