package j11_Arrays;

import java.util.Arrays;

public class C03_Arrays_BinarySearch {
    // Arrays.binarySearch(arr,value);-> girilen arraydeki istenen eleman kontrolu
    public static void main(String[] args) {
        int sayıArr[]={23,44,2,11,55,60,32,34,58,22,9,64,42};
        int sayı1=44;
        int sayı2=20;
        System.out.println("***amele code***");
        boolean flag=false;
        for(int i=0;i<sayıArr.length;i++){
            if (sayıArr[i]==sayı1){
                flag=true;
                break;
            }
        }
        System.out.println(flag?"aradıgınız sayı Array de mevcut":"aradıgınız sayı Array de mevcut degil");

        System.out.println("cıncık code");

        Arrays.sort(sayıArr);//sort işlemi yapıldı k->b sıralandı
        System.out.println("Arrayde 20 nın varlıgı:"+Arrays.binarySearch(sayıArr,sayı2));
        System.out.println("Arrayde 44 nın varlıgı:"+Arrays.binarySearch(sayıArr,sayı1));


    }


}
