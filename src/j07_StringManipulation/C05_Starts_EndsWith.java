package j07_StringManipulation;

import java.util.Scanner;

public class C05_Starts_EndsWith {
    public static void main(String[] args) {
        /*
 startsWith()
 Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 String'in basladigi characteri dogrular
 endsWith()
 Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
*/
        String str1="ebikGabik";
        System.out.println("str1 = " + str1);
        //str1.startsWith('e');//parametre olarak char almaz->CTE
        System.out.println("str1.startsWith(\"e\") = " + str1.startsWith("e"));//true
        String str2="ebik";
        System.out.println("str1.startsWith(str2) = " + str1.startsWith(str2));//true
        System.out.println("str2.startsWith(str1) = " + str2.startsWith(str1));//false
        System.out.println("str2.startsWith(str2) = " + str2.startsWith(str2));//true

        System.out.println("str2.endsWith(str2) = " + str2.endsWith(str2));//true
        System.out.println("str2.endsWith(str1) = " + str2.endsWith(str1));//false
        System.out.println("str1.startsWith(\"k\",3) = " + str1.startsWith("k", 3));//true

        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
// @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Bir e-mail giriniz");
        String email=input.nextLine();
        System.out.println(email.startsWith("@gmail.com")? "Girilen e-mail hesabı @gmail.com içermiyorsa " : "Girilen e-mail hesabı @gmail.com içermiyorsa ");
        System.out.println(email.endsWith(".com")? "Girilen e-mail hesabı.com sonra " : "Girilen e-mail hesabı.com sonra ");
        System.out.println(email.endsWith(".com")? "Girilen e-mail hesabı.com sonra " : "Girilen e-mail hesabı.com sonra ");
    }
}
