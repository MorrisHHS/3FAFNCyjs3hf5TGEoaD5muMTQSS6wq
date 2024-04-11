public class MainMenu extends Menukeuze
{
    public MainMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze()
    {

        String[] spaceInvader =
        {
                "  ▄▄███▄▄     ",
                "▄█▀█████▀█▄   ",
                "██▄▀███▀▄██   ",
                "▀▀██▀▀▀██▀▀   "
        };


        for (int i = 0; i < spaceInvader.length; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(spaceInvader[i]);
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("Je zit in menu: " + naam);
        menu.toonMenu();
    }
}