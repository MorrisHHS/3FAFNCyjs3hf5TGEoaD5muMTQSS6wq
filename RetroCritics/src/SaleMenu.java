public class SaleMenu extends Menukeuze{

    public SaleMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze() {
        System.out.println();

        // gooi hier de games met korting in


        System.out.println(" ");
        System.out.println(naam + ":");
        menu.toonMenu();
    }
}
