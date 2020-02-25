
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationShould {

    private static final String POST_COMMAND = "Alice -> Hello";
    private static final String READ_COMMAND = "Alice";
    private static final String EXIT = "exit";

    @Mock private Console console;
    @Mock private CommandProcessor commandProcessor;

    private Application application;

    @Before
    public void initialise() {
        application = new Application(console, commandProcessor);
    }

    @Test
    public void
    terminate_when_an_exit_command_is_received() {
        given(console.readline()).willReturn(POST_COMMAND, EXIT);

        application.start();

        verify(console).write("bye!");
    }

    @Test public void
    execute_user_commands_until_user_exits_the_application() {
        given(console.readline()).willReturn(POST_COMMAND, READ_COMMAND, EXIT);

        application.start();

        InOrder inOrder = Mockito.inOrder(commandProcessor, console);
        inOrder.verify(commandProcessor).execute(POST_COMMAND);
        inOrder.verify(commandProcessor).execute(READ_COMMAND);
        verify(console).write("bye!");
    }



}
