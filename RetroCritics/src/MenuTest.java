public class MenuTest {
    public static void Run(){
        Menukeuze mainMenu = new MainMenu("Main Menu");
        Menukeuze gameListMenu = new GameListMenu("Game List Menu");
        Menukeuze gameMenu = new GameMenu("Game Menu");
        Menukeuze saleMenu = new SaleMenu("Sale Menu");

        mainMenu.menu.voegKeuzeToe(gameListMenu);
        mainMenu.menu.voegKeuzeToe(saleMenu);
        gameListMenu.menu.voegKeuzeToe(gameMenu);
        gameListMenu.menu.voegKeuzeToe(mainMenu);
        gameListMenu.menu.voegKeuzeToe(saleMenu);
        gameMenu.menu.voegKeuzeToe(mainMenu);
        gameMenu.menu.voegKeuzeToe(gameListMenu);

        mainMenu.toonMenukeuze();
    }
}
