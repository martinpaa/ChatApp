import java.util.Scanner;

public class Console {

    public static final String PROMPT = "> ";
    private final Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    public String readline() {
        System.out.print(PROMPT);
        return scanner.nextLine();
    }

    public void write(String output) {
        System.out.println(output);
    }

}