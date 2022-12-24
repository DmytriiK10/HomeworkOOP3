public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        printer1.print("Доброго вечора");
        GreenPrinter printer2 = new GreenPrinter();
        printer2.print("Ми з України");
        Printer printer3 = new GreenPrinter();
        printer3.print("Hello");
        GreenPrinter printer4 = (GreenPrinter) printer3;
        printer2.print("Nice to meet you");


    }
}