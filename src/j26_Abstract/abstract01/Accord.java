package j26_Abstract.abstract01;

public class Accord extends Honda{
    @Override
    public void motor() {
        System.out.println("2.0 motor çok kaçar");

    }

    @Override
    void koltuk() {
        System.out.println("deri koltuk pek lüsk olmuş");

    }

    @Override
    void kapı() {
        System.out.println("4 kapılı araabalar güzel olur");

    }
    @Override
    void sunroof() {
        super.sunroof();
    }
}
