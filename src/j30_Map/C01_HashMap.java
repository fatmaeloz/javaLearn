package j30_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class C01_HashMap {
    public static void main(String[] args) {

    /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
            dublicate kabul etmez.
            Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap  print edildiğinde hem key degerleri hem de value degerleri aralarina = sembolu konularak print eder
            HashMap'ler tanımlanırken rastgele(hurra style) siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */
        HashSet<String> hs1 = new HashSet<>();//bos hashSet tanımlandı->decleration
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("javaCAN", "javaSU", "javaHAN", "javaNAZ", "javaZADE", "javvaNUR", "javiDAN", "javFER"));
        //set print
        System.out.println("hs2 = " + hs2);//[javvaNUR, javaNAZ, javaHAN, javaCAN, javaSU, javFER, javiDAN, javaZADE]
        //set add() eleman ekleme
        hs2.add("javiYe");
        System.out.println("hs2 add() sonrasi = " + hs2);//[javvaNUR, javaNAZ, javaHAN, javaCAN, javiYe, javaSU, javFER, javiDAN, javaZADE]
        //set tekrarli eleman ekleme
        hs2.add("javaNAZ");
        System.out.println("hs2 tekrarli eleman eklme sonrasi = " + hs2);
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        System.out.println("hs2 null eleman eklme sonrasi = " + hs2);//
        HashSet<String> hs3 = new HashSet(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));// [null, javvaNUR, javaNAZ, javaHAN, javaCAN, javiYe, javaSU, javFER, javiDAN, javaZADE]
        hs2.addAll(hs3);
        System.out.println("hs2 addAll() sonrasi = " + hs2);//[null, javvaNUR, balcanKebap, javaNAZ, javaCAN, javaSU, javiDAN, guzuGerdan, javaHAN, küşşşleme, javiYe, javFER, haşhaşKebap, incik, javaZADE, Cüger]
        //set remove()->eleman silme
        hs2.remove(null);
        System.out.println("hs2 remove() sonrasi ="+hs2);//[javvaNUR, balcanKebap, javaNAZ, javaCAN, javaSU, javiDAN, guzuGerdan, javaHAN, küşşşleme, javiYe, javFER, haşhaşKebap, incik, javaZADE, Cüger]
        hs2.removeAll(hs3);
        System.out.println("hs2 removeAll() sonrasi = " + hs2);//[javvaNUR, javaNAZ, javaCAN, javaSU, javiDAN, javaHAN, javiYe, javFER, javaZADE]
        System.out.println("hs2.size() = " + hs2.size());//9
        System.out.println("hs2.isEmpty() = " + hs2.isEmpty());//false
        System.out.println("hs1.isEmpty() = " + hs1.isEmpty());//true
        hs2.clear();
        System.out.println("hs2.size() = " + hs2.size());//0
        System.out.println("hs2.isEmpty() = " + hs2.isEmpty());//true
        //set contains()->eleman varligi kontrolu
        System.out.println("hs3.contains(\"Cüger\") = " + hs3.contains("Cüger"));//true
        System.out.println("hs3.contains(\"ciger\") = " + hs3.contains("ciger"));//false
        System.out.println("hs3.hashCode() = " + hs3.hashCode());//1961978443
        System.out.println("hs2.hashCode() = " + hs2.hashCode());//0
        //set retainAll()->kesisen ortak eleman
        HashSet<Integer> hs5=new HashSet<Integer>(Arrays.asList(16,54,67,63,47,20));
        HashSet<Integer> hs6=new HashSet<Integer>(Arrays.asList(6,54,61,63,17,20));

        System.out.println("hs5.retainAll(hs6) = " + hs5.retainAll(hs6));//true->ortak elemanlar hs5 setine atandi
        HashSet<Integer> ortakEleman=new HashSet<>(hs5);//hs5 elemanlari yani ortak elemanlar ortakElemanlar hashSet'ine atandi
        System.out.println("ortakEleman = " + ortakEleman);//[20, 54, 63]
        System.out.println("ortakEleman.retainAll(hs6) = " + ortakEleman.retainAll(hs6));//true

        System.out.println("hs5.equals(hs6) = " + hs5.equals(hs6));//false
        System.out.println("ortakEleman.equals(hs5) = " + ortakEleman.equals(hs5));//true

    }
}
