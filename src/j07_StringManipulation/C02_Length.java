package j07_StringManipulation;

public class C02_Length {
    /*
length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
butun karakterleri(boşluk vs) sayıp adedini verir.
 */
    public static void main(String[] args) {
    /*
        length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
        butun karakterleri(boşluk vs) sayıp adedini verir.
         */
        String str1="Hayattan bir saat calmak :)";
        System.out.println("str1.length() = " + str1.length());//27
        String str2=" ";//tek binali arsa
        String str3="";//Bos arsa->Hiclik
        String str4=null;//Dutluk
        System.out.println("str2.length() = " + str2.length());//1
        System.out.println("str3.length() = " + str3.length());//0
        //System.out.println("str4.length() = " + str4.length());//RTE->para var ama ekmek yok
        //CTE->para yok
        System.out.println("Geldin mi sozume");
        /*
        Hap Bilgi->nul atanan String variable herhangi bir meth call etmez
        null->case sensitive NULL !=null !=Null
        null->dutluk: arsa degeri olmayan arazi sadece hicligi gosteren pointer(isaretci)
         */
        String str5;//Tanimlanmis ama deger atanmamis bos variable kutu
        //System.out.println("str5 = " + str5);CTE->deger atanmamis variable hic bir aksiyona tabi tutulamaz
    }
}




