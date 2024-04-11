import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class OpenVraagTest {
    @Test
    public void testBeantwoord() {
        String input = "Test antwoord";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OpenVraag openVraag = new OpenVraag();
        openVraag.beantwoord();

        Assertions.assertEquals(input, openVraag.antwoord);
    }

    @Test
    public void testDisplay() {
        int nummer = 1;
        String beschrijving = "Test beschrijving";
        OpenVraag openVraag = new OpenVraag(nummer, beschrijving);

        // Capture System.out for testing
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        openVraag.display();
        String expectedOutput = nummer + ". " + beschrijving + System.lineSeparator();
        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }


}
