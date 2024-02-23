package j04_JavaOperators;

public class Task_SwapInterviewQuestions {
    public static void main(String[] args) {
/*
     TASK :
     Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
     code create edip print ediniz.
     a) 3. bir variable kulanarak
     b) 3. bir variable kullanmadan

   input    : sayi1=20 ve sayi2=34;
output  :  sayi1=34 ve sayi2=20

      */
        int sayı1 = 20;
        int sayı2 = 34;
        // System.out.println("***a çözümü***");
        // int temp=sayı1;
        // sayı1=sayı2;
        // sayı2=temp;
        // System.out.println("\"Swap isleminden sonra sayi1 = "+sayı1 +" sayi2 = "+sayı2););
        System.out.println("***b cozumu*****");
        System.out.println("Swap isleminden once sayi1 = " + sayı1 + " sayi2 = " + sayı2);

        sayı1 += sayı2;//sayı1=sayı1+sayı2=54
        sayı2 = sayı1 - sayı2;//20
        sayı1 -= sayı2;//34
        System.out.println("Swap isleminden once sayi1 = " + sayı1 + " sayi2 = " + sayı2);


    }
}
