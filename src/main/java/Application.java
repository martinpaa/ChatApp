public class Application {



    private static final String EXIT = "exit";
    private final Console console;
    private final CommandProcessor commandProcessor;

    public Application(Console console, CommandProcessor commandProcessor) {
        this.console = console;
        this.commandProcessor = commandProcessor;
    }

    public void start() {
        String userCommand = console.readline();
        while(!EXIT.equals(userCommand)) {
            commandProcessor.execute(userCommand);
            userCommand = console.readline();
        }
        console.write("bye!");
    }

    public static void main(String[] args) {

        app().start();
    }

    private static Application app() {

        Console console = new Console();
        CommandProcessor commandProcessor = new CommandProcessor();

        Application application = new Application(console,commandProcessor);

        return application;
    }
}
