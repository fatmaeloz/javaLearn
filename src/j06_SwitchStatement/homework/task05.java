package j06_SwitchStatement.homework;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
		/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("note giriniz");
        int not= scan.nextInt();



            if (not >= 0 && not < 50) not= 1;
            if (not >= 50 && not < 60) not = 2;
            if (not >= 60 && not < 80) not = 3;
            if (not >= 80) not = 4;

            switch (not) {
                case 4:
                    System.out.println("A");
                    break;
                case 3:
                    System.out.println("B");
                    break;
                case 2:
                    System.out.println("C");
                    break;
                case 1:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("hatalı not girişi");
                    break;
            }
//2.yol

        Scanner input = new Scanner(System.in);


        String sonuc = "";

        if (not >= 0 && not < 50) {
            sonuc = "basarisiz";
        } else if (not < 60) {
            sonuc = "iyi";
        } else if (not < 80) {
            sonuc = "cokIyi";
        } else {
            sonuc = "super";
        }

        switch (sonuc) {
            case "basarisiz":
                System.out.println("Notunuz: D");
                break;
            case "iyi":
                System.out.println("Notunuz: C");
                break;
            case "cokIyi":
                System.out.println("Notunuz: B");
                break;
            case "super":
                System.out.println("Notunuz: A");
                break;
        }

    }

        }


