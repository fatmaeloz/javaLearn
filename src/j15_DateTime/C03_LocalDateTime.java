package j15_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    // LocalDateTime -> yıl-ay-gun-saat-dakika-saniye datalarını tutar
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();//Sistemde mevcut yıl-ay-gun-saat-dakika-saniye datalarini return eder
        System.out.println("ldt = " + ldt);//2024-02-26T22:17:37.511589900
        System.out.println("ldt.getSecond() = " + ldt.getSecond());
        System.out.println("ldt.getDayOfYear() = " + ldt.getDayOfYear());
        System.out.println("ldt.getMonthValue() = " + ldt.getMonthValue());

        LocalDate tarih=LocalDate.of(1903,2,23);
        LocalTime saat=LocalTime.of(17,55,23);
        LocalDateTime ldt1=LocalDateTime.of(tarih,saat);
        System.out.println("ldt1 = " + ldt1);//1903-02-23T17:55:23

        LocalDateTime ldt2=ldt1.minusMonths(15).minusMinutes(100).plusDays(33).plusHours(1).minusSeconds(95);
        System.out.println("ldt2 = " + ldt2);//1901-12-26T17:13:48
        //Local Date Time variable atama yapilmazsa herhangi bir degisklik olmaz immutable old icin.

    }
}


