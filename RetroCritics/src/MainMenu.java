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
                "  ▄▄███▄▄  ",
                "▄█▀█████▀█▄",
                "██▄▀███▀▄██",
                "▀▀██▀▀▀██▀▀"
        };

        for (int i = 0; i < spaceInvader.length; i++) {
            System.out.println(spaceInvader[i]);
        }
    }
}