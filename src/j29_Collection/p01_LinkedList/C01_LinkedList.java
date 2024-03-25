package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
LinkedList .....
1- LinkedList'de elemanlar "data" ve "adress"(next) olmak uzere iki kısımdan oluşur ve eleman yerine "node" olarak tanımlanır.
2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran "head" node tanımlanmıştır.
3- LinkedList'te son node adres kısmı null olan sadece data bulunduran "tail" node tanımlanmıştır.
4- ArrayList searching LinkedList node ekleme(add) ve silmede(remove) daha avantıjlıdır.
5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
    Ancak obj DataType olarak parent interface tanımlanabilir.
7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
 */
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));
// LinkedList print
        System.out.println("ll1=" + ll1);//
        //LinkedList add
        System.out.println("ll1 = " + ll1);//[balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]
        //LinkedList add
        ll1.add("Keskin Tava");
        System.out.println("ll1 add sonrasi = " + ll1);//[balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, Keskin Tava]
        ll1.addFirst("Buryan Kebap");
        System.out.println("ll1 addFirst() sonrasi = " + ll1);//[Buryan Kebap, balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, Keskin Tava]
        ll1.addLast("beytii");
        System.out.println("ll1 addLast() sonrasi = " + ll1);//[Buryan Kebap, balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, Keskin Tava, beytii]
        ll1.add(3,"Etli ekmek");
        System.out.println("ll1 add(index,str) sonrasi = " + ll1);//[Buryan Kebap, balcanKebap, Cüger, Etli ekmek, haşhaşKebap, guzuGerdan, incik, küşşşleme, Keskin Tava, beytii]
        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("trileçe", "künefix", "sübye", "suMuhallebi", "kerebis", "ayva"));
        ll1.addAll(ll2);
        System.out.println("ll1 addAll sonrasi = " + ll1);//[Buryan Kebap, balcanKebap, Cüger, Etli ekmek, haşhaşKebap, guzuGerdan, incik, küşşşleme, Keskin Tava, beytii, trileçe, künefix, sübye, suMuhallebi, kerebis, ayva]
        ll2.addAll(1,ll2);
        System.out.println("ll2 addAll(index,col) sonrasi = " + ll2);//[trileçe, trileçe, künefix, sübye, suMuhallebi, kerebis, ayva, künefix, sübye, suMuhallebi, kerebis, ayva]
        //ll2.addAll("Cennet Camuru");->CTE->meth parametre coll olmali
    }
}


