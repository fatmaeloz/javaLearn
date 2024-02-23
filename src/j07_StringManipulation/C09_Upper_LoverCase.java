package j07_StringManipulation;

public class C09_Upper_LoverCase {
    /*
 toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
ignoreCase()-> verilen string'i BUYUK-kucuk harf duyarlılığını kaldırır.
  */
    public static void main(String[] args) {


        String str = "Madem Geldin Dunyaya Calis JAVA'ya";
        System.out.println("str = " + str);//Madem Geldin Dunyaya Calis JAVA'ya
        System.out.println("str.toUpperCase() = " + str.toUpperCase());//MADEM GELDİN DUNYAYA CALİS JAVA'YA
        System.out.println("str.toLowerCase() = " + str.toLowerCase());//madem geldin dunyaya calis java'ya
    }
}