import org.junit.jupiter.api.*;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Gametest {

    @Test
    public void testConstructor() {
        Game game = new Game("Example Game", 50, "nigger");
        assertEquals("Example Game", game.getNaam());
        assertEquals(50, game.getPrijs());
        assertEquals(0, game.reviews.size());
    }

    @Test
    public void testSetNaamAndGetNaam() {
        Game game = new Game("Initial Name", 100, "RPG");
        game.setNaam("New Name");
        assertEquals("New Name", game.getNaam());
    }

    @Test
    public void testPrijsBewerkenAndGetPrijs() {
        Game game = new Game("Example Game", 50, "FPS");
        game.prijsBewerken(60);
        assertEquals(60, game.getPrijs());
    }


}