import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CommandLineTest {

    private CommandLine commandLine;

    @BeforeEach
    public void setUp(){
        commandLine = new CommandLine();
    }

    @Test
    public void canAddFlight(){
        Flight testFlight = new Flight("Paris");
        assertThat()
    }




}
