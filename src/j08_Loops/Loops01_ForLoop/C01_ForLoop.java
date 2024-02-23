package j08_Loops.Loops01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //Tekrarlayan sabit aksiyonlar için tanımlanan code blogudur
        // task-> 41 kere "maaşallah" prin eden code create ediniz.

        System.out.println("Maşaallah");
        //baş. start value   bitiş end value   value değişim
        for (int i = 0; i < 41; i++) {
            System.out.println(i + 1 + ".Maşaallah");

        }

// task02-> 2 basamalı tek sayıları aynı satıra aralarında boşluk ile print eden code create ediniz.

        for (int i = 11; i < 100; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println("***");
        for (int i = 0; i < 100; i++) {
            if (i >= 10 && i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        /*
  Code standarts
1) Tekrar (Repetition) olmamalidir
2) Dynamic olmalidir
3) Tamir (Fix) ve update kolay yapilabilmelidir
 */
    }
}