public class GreenPrinter extends Printer{
    @Override
    void print(String value) {
       System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }
}
