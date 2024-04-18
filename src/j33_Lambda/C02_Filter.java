package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    /*
    Filter:
    Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
    filtreleme işlemi yapmamıza yarayan bir yapıdır.
    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır

     */
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));
        System.out.println("****Task01****");
        //Task01->"Structured Programming"--> AMELE Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        printCiftStructured(sayiList);//58 54 18 46 16 6
        System.out.println("\n****Task02****");
        //task02-> "Functional Programming"--> CINCIX Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        printCiftFunctional(sayiList);//58 54 18 46 16 6
        System.out.println("\n****Task03****");
        //task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        System.out.println("\n****Task03****");
    }

    private static void printCiftFunctional(List<Integer> sayiList) {
        sayiList//action'a girecek akis kaynagi call edildi
                .stream()//call edilen collection elemanlari akisa alindi
                //.filter((t)->t%2==0)//akisa alinan coll elemanlari cift sartina gore filtrelendi
                .filter(SeedMethods::ciftMi)//akisa alinan coll elemanlari cift sartina gore filtrelendi
                .forEach(SeedMethods::intYazdir);//akista cifte gore filtrelenen elemanlar print edildi
    }

    private static void printCiftStructured(List<Integer> sayiList) {
        for (Integer each:sayiList){
            if (each%2==0){
                System.out.print(each+" ");
            }
        }
    }
}


