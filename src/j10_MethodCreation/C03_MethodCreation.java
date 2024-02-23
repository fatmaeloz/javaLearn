package j10_MethodCreation;

import static j10_MethodCreation.C03_MethodDepo.gecmeNotu;



        public class C03_MethodCreation {//class level

            public static void main(String[] args) {//main level->benim koyum
                String hlt = "en hakiki javaci";
                String sema = "javaNAZZZ";
                selamVer();//tanimlandigi class scopta method name ile direct call edilebilir
                System.out.println("hlt = " + hlt);
                System.out.println("sema = " + sema);
        /*
        Farkli class'lardan meth call etmek icin clasName.methodName ile ya da class import edilerek call islemi yapilir
        static method olarak call edilir->gokteki gunes gibi
        Ayni classta method dogrudan name ile call edilir
         */
                gecmeNotu(88);//Class name ile meth call edildi->komsu koyun amelesi koyun ismi ile cagrildi
                gecmeNotu(43);//import edildi-> komsu koyun amelesi gokteki gunes gibi parladi
            }//main sonu

            private static void selamVer() {//koyumun amelesi
                System.out.println("beni koyumun yagmurlarinda yikasinlar");
                gecmeNotu(55);//main disina farkli meth icine call edildi
            }

            //gecmeNotu(66);Method disina ama meth call islemi olmaz->CTE
        }//class sonu



