package j07_StringManipulation.task;

public class task14 {

        /*  String s1 = "      Clarusway           ";
            s1 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

    //Kodu aşağıya yazınız.
    public static void main(String[] args) {
        String s1 = "      Clarusway           ";
        s1 = s1.replaceAll("\\s", "");
        System.out.println(s1);
    }
}
