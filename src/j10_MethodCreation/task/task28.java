package j10_MethodCreation.task;

public class task28 { /*
    task->
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Max number giriniz :");
        int max= Integer.MAX_VALUE;
        System.out.println(randomNum(max));
    }

    private static int randomNum(int max) {
        return (int) (Math.random()*max);
    }

}


