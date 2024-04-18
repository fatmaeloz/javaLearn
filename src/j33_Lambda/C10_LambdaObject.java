package j33_Lambda;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class C10_LambdaObject {
    /*
 TASK :
 fields --> Universite (String)
            bolum (String)
            ogrcSayisi (int)
            notOrt (double)
            olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
  */
    public static void main(String[] args) {
        C10_University u01 = new C10_University("Bogazici", "Matematik", 571, 73);
        C10_University u02 = new C10_University("Istanbul", "Matematik", 622, 77);
        C10_University u03 = new C10_University("Marmara", "Hukuk", 1453, 52);
        C10_University u04 = new C10_University("Itu", "uçak muh.", 333, 63);
        C10_University u05 = new C10_University("Yıldız Teknik", "Gemi ", 216, 55);

        List<C10_University> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));
        System.out.println("unv = " + unv);
        System.out.println("****Task 01*****");
        // Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz...
        System.out.println("kontrolNotOrt74Byk(unv) = " + kontrolNotOrt74Byk(unv));
        System.out.println("****Task 02*****");
        //task02->ogrc sayilarinin 110 den az olmadigini  kontrol eden code create ediniz.
        System.out.println("kontrolOgrncSayisi100Byk(unv) = " + kontrolOgrncSayisi100Byk(unv));
        System.out.println("****Task 03*****");
        //task03->universite'lerde herhangi birinde "matematik" bolumu olup olmadigini  kontrol eden code create ediniz.
        System.out.println("kontrolMatBolum(unv) = " + kontrolMatBolum(unv));
        System.out.println("****Task 04*****");
        //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
        System.out.println("printOgrncSayisiTersSirali(unv) = " + printOgrncSayisiTersSirali(unv));
        System.out.println("****Task 05*****");
        //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...
        System.out.println("printNotOrtTersSiraliIlk3(unv) = " + printNotOrtTersSiraliIlk3(unv));
        System.out.println("****Task 06*****");
        //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...
        System.out.println("printOgrncSayisiSiraliEnAz2(unv) = " + printOgrncSayisiSiraliEnAz2(unv));
        System.out.println("****Task 07*****");
        //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...
        System.out.println("printNotOrt63BykOgrncSayisiTop(unv) = " + printNotOrt63BykOgrncSayisiTop(unv));
        System.out.println("****Task 08*****");
        //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...
        System.out.println("printOgrncsayisi333BykNotOrtOrtalama(unv) = " + printOgrncsayisi333BykNotOrtOrtalama(unv));
        System.out.println("****Task 09*****");
        //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...
        System.out.println("printMatBolsayisi(unv) = " + printMatBolsayisi(unv));
        System.out.println("****Task 10*****");
        //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...
        System.out.println(printOgrncsayisi571BykMaxNotOrt(unv));
        System.out.println("****Task 11*****");
        //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...
        printOgrncsayisi1071KckMinNotOrt(unv);
    }

    private static void printOgrncsayisi1071KckMinNotOrt(List<C10_University> unv) {
        System.out.println(unv
                .stream()
                .filter(t -> t.getOgrcSayisi() <= 1071)
                .mapToDouble(C10_University::getNotOrt)
                .min());
    }

    private static OptionalDouble printOgrncsayisi571BykMaxNotOrt(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t->t.getOgrcSayisi()>=571)
                .mapToDouble(C10_University::getNotOrt)
                .max();
    }

    private static long printMatBolsayisi(List<C10_University> unv) {
        return unv
                .stream()
                //.filter(t -> t.getBolum().equalsIgnoreCase("Matematik"))
                .filter(t -> t.getBolum().contains("Mat"))
                .count();
    }

    private static OptionalDouble printOgrncsayisi333BykNotOrtOrtalama(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t -> t.getOgrcSayisi() >= 333)
                .mapToDouble(C10_University::getNotOrt)
                .average();

    }

    private static int printNotOrt63BykOgrncSayisiTop(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t -> t.getNotOrt() > 63)
                .mapToInt(C10_University::getOgrcSayisi)//unv obj akisini parametre girilen unv obj ogrnc sayisi olarak update edip akisa aldi
                .sum();//akis elemanlari toplandi
    }

    private static List<C10_University> printOgrncSayisiSiraliEnAz2(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi))
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
    }

    private static List<C10_University> printNotOrtTersSiraliIlk3(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getNotOrt).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    private static List<C10_University> printOgrncSayisiTersSirali(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi).reversed())
                .collect(Collectors.toList());
    }

    private static String kontrolMatBolum(List<C10_University> unv) {
        //return unv.stream().anyMatch(t->t.getBolum().contains("Mat"))?
        return unv.stream().anyMatch(t -> t.getBolum().equalsIgnoreCase("Matematik")) ?
                "En az bir uni'de Matematik bolumu var" :
                "Hicbir uni'de Matematik bolumu yok";
    }

    private static String kontrolOgrncSayisi100Byk(List<C10_University> unv) {
        return unv.stream().allMatch(t -> t.getOgrcSayisi() >= 110) ?
                "Universitelerin hepsinin ogrenci sayisi 110'dan buyuk" :
                "Universitelerden en az bir tanesinin ogrenci sayisi 110'dan kucuk";
    }

    private static String kontrolNotOrt74Byk(List<C10_University> unv) {
        return unv.stream().allMatch(t -> t.getNotOrt() > 74) ?
                "Universitelerin hepsinin not orlamasi 74'den buyuk" :
                "Universitelerden en az bir tanesinin not orlamasi 74'den kucuk";
    }
}