public class GameMenu extends Menukeuze{

    public Game game;

    public GameMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze() {

        // gooi hier de game info in



        System.out.println(" ");
        System.out.println(game.naam + ":");
        System.out.println("Prijs: " + ((double)game.prijs / 100));

        menu.toonMenu();
    }
}
