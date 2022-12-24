import java.io.Console;
public class Printer {
public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    void print(String value) {
        System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }


}

