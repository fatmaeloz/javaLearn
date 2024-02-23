package j04_JavaOperators.j01_AritmetıcOperators;

public class C02_IncrementDecrement {


    public static void main(String[] args) {
    /*
Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
    */



            System.out.println("***Increment - Arttirma****");
            int a=3;
            System.out.println(a);//3
            System.out.println(++a);//4 once arttir sonra a'yi sout yap yazdir
            System.out.println(a++);//4 once sout yap sonra a'nin degerini arttir
            System.out.println(a);//5

            a=8;
            System.out.println(a);//8
            System.out.println(a++ + ++a);//18
            System.out.println(++a + a++ + a++);//34
            System.out.println(a);//13

            System.out.println("***Decrement - Azaltma***");
            int b=3;
            System.out.println(b);//3
            System.out.println(b--);//3
            System.out.println(--b);//1
        System.out.println("Increment ile artırma");

        System.out.println(++a+a+++a++);//34

        System.out.println(a);
        System.out.println("Decrement +azaltma");
        System.out.println(b--);//3
        System.out.println(--b);//1
        int x=20;//21
        int y=15;//14
        System.out.println(++x+y--);//36
        System.out.println(y++ + x++ + --x);//56
        int k=5;
        int sonuç=++k + k++ + --k +k-- +k;
        System.out.println(++k + k++ + --k + k-- + k);
    }
}