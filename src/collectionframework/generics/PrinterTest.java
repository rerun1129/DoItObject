package collectionframework.generics;

public class PrinterTest {

    public static void main(String[] args) {

        Printer<Powder> printerPow = new Printer<>();
        printerPow.setMaterial(new Powder());
        Powder powder = printerPow.getMaterial();
        System.out.println(powder.toString());

        Printer<Plastic> printerPla = new Printer<>();
        printerPla.setMaterial(new Plastic());
        Plastic plastic = printerPla.getMaterial();
        System.out.println(plastic.toString());


    }

}
