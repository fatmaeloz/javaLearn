package j12_ArraList;

import java.util.ArrayList;
import java.util.List;

public class C08_set {
    //set()-> listin istenen index'e istenen elemanını  update set eder-> şu indexin şu elelmanını şununla değiştir...
    public static void main(String[] args) {
        //set()-> listin istenen index'te istenen elemanını update set eder-> şu indexin şu elelmanını şununla değiştir.Eski elemani return eder
        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        System.out.println("ulkeList set yapilmadan once = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]
        System.out.println("ulkeList.set(2,\"Izlanda\") = " + ulkeList.set(2, "Izlanda"));//Danimarka
        System.out.println("ulkeList set yapildiktan sonra = " + ulkeList);
        System.out.println("ulkeList.set(7,\"Turkiye\") = " + ulkeList.set(7, "Turkiye"));//RTE->.IndexOutOfBoundsException
        //ulkeList.set(3,"Fransa",4,"Romanya");//CTE set() cok parametre aldigi icin derleme(compile) yapmadi
    }
}

