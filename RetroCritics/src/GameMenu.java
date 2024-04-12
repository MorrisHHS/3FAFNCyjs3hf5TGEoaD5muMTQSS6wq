public class GameMenu extends Menukeuze{

    public GameMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze() {
        System.out.println();
        System.out.println("Test");

        // gooi hier de game info in


        System.out.println(" ");
        System.out.println(naam + ":");
        menu.toonMenu();
    }
}
