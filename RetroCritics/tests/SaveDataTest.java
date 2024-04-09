import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.util.*;

public class SaveDataTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testAddAttribute() {
        SaveData saveData = new SaveData();
        saveData.addAttribute("key1", "value1");
        Assertions.assertEquals("value1", saveData.readAttribute("key1"));
    }

    @Test
    public void testReadAttribute() {
        SaveData saveData = new SaveData();
        saveData.addAttribute("key2", "value2");
        Assertions.assertEquals("value2", saveData.readAttribute("key2"));
    }

    @Test
    public void testGetData() {
        SaveData saveData = new SaveData();
        saveData.addAttribute("key3", "value3");
        Assertions.assertEquals("key3=value3:", saveData.getData());
    }

    @Test
    public void testSetData() {
        SaveData saveData = new SaveData();
        saveData.setData("key4=value4:");
        Assertions.assertEquals("value4", saveData.readAttribute("key4"));
    }
}
