package j08_Loops.Loops01_ForLoop.Task;

public class sınav3 {
    public static final boolean NEW_CAR = true;

    public static void main(String[] args) {
/*
int maaş=30000;
switch (maaş) {
    case 15000:
        System.out.println("junier");
        break;
    case 20000:
        System.out.println("1 yıl");
        break;
    case 30000:
        System.out.println("senior");
        break;
        default:
            System.out.println("yok b maaaş");


int y=10;
int x=(y%2==1)?(3*y):(y/4);
        System.out.println(x);


int y=18;
if(y%2==0) {
    System.out.println(4 * y);
}else{
    System.out.println(2+y);
    */
//int gun=6;
//Switch(gun){
//    case 1:
//        case2:
//        case3:
//        case4:
//        case5:
//        System.out.println("hafta içi");
//            case 6:
//                case7:
//                case8:
//                System.out.println("hafta sonu");
//                break;
//                default
//                    System.out.println("hata");
//break;

        //  int y=30;
        //  System.out.println((y>=30)?(y-10):(y*10));
        //  boolean new_car=true;
        //  if (new_car) {
        //      System.out.println("yes new car");
        //  } else if (!(new_car)) {
        //      System.out.println("not now car");
        //  } else {
        //      System.out.println("dont under stant");
        int yıl = 2022;
        boolean artık = false;
        if (yıl % 4 == 0) {
            if (yıl % 100 == 0) {
                if (yıl % 400 == 0)
                    artık = true;
                else
                    artık = false;
            } else
                artık = true;
            ;
        } else
            artık = false;
        if (artık)
            System.out.println(yıl + "artık yıldır");
        else
            System.out.println(yıl + "artık yıl degildir");
        int var = 1;
        switch (var) {
            case 1:
                System.out.println("j");
            case 2:
            case 3:
                System.out.println("a");
                break;
            case 4:
                System.out.println("v");
            default:
                System.out.println("a");
                char krk = 'B';
                switch (krk) {
                    case 'a':
                    case'A':
                        System.out.println("krk");
                        break;
                    case 'b':
                    case 'B':
                        System.out.println(krk);
                        break;
                    case 'c':
                    case 'C':
                        System.out.println(krk);
                        break;

                }

        }
    }}




