package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sorted {
    public static void main(String[] args) {
        /*
sorted() -> akışdaki elemanları naturel order (doğal sıra) halinde akış return eder
sorted() tekrarlı kullanılırsa son return aktif olur...
 */
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));

        System.out.println("****Task01****");
        // Task01-> list çift elemanlarının karelerini k->b sıra ile print eden code create ediniz
        printCiftKareKbSira(sayiList);//36 256 324 2116 2916 3364
        System.out.println("\n****Task02****");
        // Task02-> list tek elemanlarının karelerini b->k sıra ile print eden code create ediniz
        printTekKareBkSira(sayiList);//4225 3721 1225 1089 625 289 169 49 9
        System.out.println("\n****Task03****");
    }

    private static void printTekKareBkSira(List<Integer> sayiList) {
        sayiList
                .stream()
                .filter(SeedMethods::tekMi)
                .map(SeedMethods::kareAl)
                .sorted(Comparator.reverseOrder())//akis elemanlari b->k ters sirali hale getirildi
                .forEach(SeedMethods::intYazdir);
    }

    private static void printCiftKareKbSira(List<Integer> sayiList) {
        sayiList//akisa alinacak coll elemanlar call edildi
                .stream()//coll. elemanlari akisa alindi
                .filter(SeedMethods::ciftMi)//akistaki coll. cift elemanlari filtrelendi
                .map(SeedMethods::kareAl)//akisdaki cift elemanlarin karelerine update edildi
                .sorted()//akisdaki karesi alinan cift elemanlar dogal sirali hale getirildi
                .forEach(SeedMethods::intYazdir);
    }
}