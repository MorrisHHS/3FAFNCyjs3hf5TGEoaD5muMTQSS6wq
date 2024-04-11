public class MainMenu extends Menukeuze
{
    public MainMenu(String argument) {
        super(argument);
    }
    public static void main(String[] args)
    {
        String[] spaceInvader =
        {
                "  ▄▄███▄▄  ",
                "▄█▀█████▀█▄",
                "██▄▀███▀▄██",
                "▀▀██▀▀▀██▀▀"
        };

        for (int i = 0; i < spaceInvader.length; i++)
        {
            System.out.println(spaceInvader[i]);
        }
    }
}