package j04_JavaOperatorsj02_Assaigment_Atama_Operators;

public class C01_AtamaOperatoru {

        //    =	        x = 8	    x = 8
        //    +=	    x += 3	    x = x + 3
        //    -=	    x -= 3	    x = x - 3
        //    *=	    x *= 3	    x = x * 3
        //    /=	    x /= 3	    x = x / 3
        //    %=	    x %= 3	    x = x % 3

        public static void main(String[] args) {

            int saimYas=48;
            System.out.println("saimYas+5 = " + (saimYas + 5));//53 ->atama yapilmadigi icin saimYas degismedi
            System.out.println("saimYas = " + saimYas);//48
            System.out.println("saimYas+=11 = " + (saimYas += 11));//59
            System.out.println("saimYas = " + saimYas);//59 -> atama yapildigi icin saimYas degeri degisti
            System.out.println("saimYas%=5 = " + (saimYas %= 5));
            System.out.println("saimYas = " + saimYas);
        }
    }






