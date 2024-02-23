package j11_Arrays.task;

public class Task14 {
    public static void main(String[] args) {
        // Task-> Kullancıdan alınan str'nin karakter saysını print eden code create ediniz.

/*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        String [] arr1= str.split("");
        int toplam =0;
        for (int i = 0; i < arr1.length; i++) {
            if (Character.isDigit(arr1[i].charAt(0)))
                toplam += Integer.valueOf(arr1[i]);
        }
        System.out.println("toplam = " + toplam);
    }
}

