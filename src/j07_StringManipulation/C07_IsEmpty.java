package j07_StringManipulation;

public class C07_IsEmpty {
    /*
 String IsEmpty
  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
 isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
 Yani o String'in length() 0 demektir.
 length()==0 demek isEmpty() true verir demektir.
*/
    public static void main(String[] args) {


        String str = "madem geldin dunyaya calis Java'ya";
        System.out.println("str.length() = " + str.length());//34
        System.out.println("str.isEmpty() = " + str.isEmpty());//false

        String str1 = "";//hiclik->bos arsa
        System.out.println("str1.length() = " + str1.length());//0
        System.out.println("str1.isEmpty() = " + str1.isEmpty());//true

        String str2 = " ";//space bir agac dikili bos degil
        System.out.println("str2.length() = " + str2.length());//1
        System.out.println("str2.isEmpty() = " + str2.isEmpty());//false

        String str3 = null;//dutluk->arsa bile degil
//        System.out.println(str3.length());//RTE
//        System.out.println(str3.isEmpty());//RTE
        //isBlank()->hem bos yani hiclik tanimlanan String icin hem de space iceren String icin True doner degilse false
        System.out.println("str2.isBlank() = " + str2.isBlank());//true
        System.out.println("str1.isBlank() = " + str1.isBlank());//true

        String str4 = "    x    ";
        System.out.println("str4.isBlank() = " + str4.isBlank());//false

        String str5;
//        System.out.println("str5 = " + str5);
//        System.out.println("str5.isEmpty() = " + str5.isEmpty());undefined degisken hicbir aksiyona tabi tutulamaz
    }
}












