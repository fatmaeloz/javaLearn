package j25_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C07_DateTimeException {
    //DateTimeException -> tarih zaman value'lerde oluşan RTE
    public static void main(String[] args) {
try{
    LocalDate date=LocalDate.of(2023,2,29);
    System.out.println("bu mesajı okuyorsan try sorunsuz çalıştı catch çalışmadı");

}catch(DateTimeException e){
    System.out.println(e.getMessage()+" try exc firlatti catch yakaladi");
}
        System.out.println("Bu mesaji okuyorsan app sorunsuz calisti");
    }
}


