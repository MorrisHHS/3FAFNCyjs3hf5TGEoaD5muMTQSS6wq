public class GameListMenu extends Menukeuze{

    public GameListMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze() {
        System.out.println();

        // gooi hier de games in
        //Savemanager.load

        System.out.println(" ");
        System.out.println(naam + ":");
        menu.toonMenu();
    }
}