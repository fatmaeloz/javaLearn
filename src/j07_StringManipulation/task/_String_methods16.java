package j07_StringManipulation.task;

public class _String_methods16 {
      /*  String s1 = "    javaCAN     ";
            s1 String'inin başındaki ve sonundaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

    //Kodu buraya yazınız.
    public static void main(String[] args) {
        String s1 = "    javaCAN     ";
        s1 = s1.replaceAll("\\s", "");
        System.out.println(s1);
    }
}
