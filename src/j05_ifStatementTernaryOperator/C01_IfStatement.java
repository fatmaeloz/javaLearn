package j05_ifStatementTernaryOperator;

public class C01_IfStatement {
    public static void main(String[] args) {
        int semrayaş = 16;
        int merveyaş = 28;
        if (semrayaş == merveyaş) {
            System.out.println("yaşdaş arkadaşlar");
            System.out.println("yoksa siz ikiz misiniz");

        }
        if (merveyaş >= 40) System.out.println("merve hanım yaşı 40'tan büyük");
        //If blok'tan sonta tek satirlik islem varsa {} gerek yok
        if (merveyaş + semrayaş >= 45) System.out.println("Tek satirlik aksiyonlarda {} kullanilmaz");
        System.out.println("javacanlara selam olsun");
        System.out.println("Bu ciktiyi okuyorsan kod calisiyordur");


    }
}
