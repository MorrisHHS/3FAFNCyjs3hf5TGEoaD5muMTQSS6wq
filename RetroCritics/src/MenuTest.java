public class MenuTest {
    public static void Run(){
        Menukeuze mainMenu = new Menukeuze("mainMenu");
        Menukeuze gameSaleMenu = new Menukeuze("gameSaleMenu");
        Menukeuze reviewMenu = new Menukeuze("reviewMenu");


        gameSaleMenu.menu.voegKeuzeToe(reviewMenu);
        mainMenu.menu.voegKeuzeToe(gameSaleMenu);

        gameSaleMenu.menu.voegKeuzeToe(mainMenu);
        reviewMenu.menu.voegKeuzeToe(mainMenu);

        mainMenu.toonMenukeuze();
    }
}
