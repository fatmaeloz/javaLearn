package j26_Abstract.abstract01;

public class Crv extends Honda{
    @Override
    public void motor() {
        System.out.println("2.4 motor çok yakmaz mı");

    }

    @Override
    void koltuk() {
        System.out.println("deri koltuk yaz aylarında  terletir");

    }

    @Override
    void sunroof() {
        super.sunroof();
    }

    @Override
    void kapı() {
        System.out.println();

    }
}

