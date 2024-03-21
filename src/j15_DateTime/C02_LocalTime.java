package j15_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    // LocalTime  -> sadece saat-dakika-saniye datatlarını tutar(stored)
    public static void main(String[] args) {
        LocalTime suAn=LocalTime.now();

        System.out.println("suAn="+ suAn);
        System.out.println("suAn.getHour()="+ suAn.getHour());
        System.out.println("suAn.getMinute()="+ suAn.getMinute());
        System.out.println("suAn.getSecond()="+ suAn.getSecond());
        System.out.println("suAn.getNano()="+ suAn.getNano());
        LocalTime saat1=LocalTime.of(9,43,21,1987);
        LocalTime saat2=LocalTime.of(9,43);
        LocalTime saat3=LocalTime.of(19,10,21);

        //tanimlanan herhangi bir time oncesi ->plus(), sonrasi ->minus() meth ile gidilir
        System.out.println("suAn.plusMinutes(36).minusHours(12) = " + suAn.plusMinutes(36).minusHours(12));
        LocalTime loopStart=LocalTime.now();
        System.out.println("loopStart.getNano() = " + loopStart.getNano());
        int toplam=0;
        for (int i = 0; i <10000 ; i++) {
            toplam+=i;
        }
        LocalTime finishLoop=LocalTime.now();
        System.out.println("finishLoop.getNano() = " + finishLoop.getNano());
        System.out.println("Loop run hizi : "+(finishLoop.getNano()-loopStart.getNano()));
    }
}


