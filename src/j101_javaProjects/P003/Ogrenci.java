package j101_javaProjects.P003;

public class Ogrenci extends Kisi{//Kisi parnet Class'a extend child pojo Class

    //fields
    private String ogrcNumara;// instance:obj variable
    private String sınıf;

    //constructor...
    public Ogrenci() {//p'siz sefil cons.

    }
    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrcNumara, String  sınıf) {//full p'li zengin const.
        super(adSoyad, kimlikNo, yas);
        this.ogrcNumara = ogrcNumara;
        this.sınıf = sınıf;
    }

    //getter-setter meth..

    public String getogrcNumara() {
        return ogrcNumara;
    }

    public String getsınıf() {
        return sınıf;
    }

    public void setSınıf(String bolum) {
        this.sınıf = bolum;
    }
    //toString method..

    @Override
    public String toString() {
        return super.toString() +
                ", ogrcNumara='" + ogrcNumara+ '\'' +
                ", bolum='" + sınıf ;
    }
}



