public class MenuTest {
    public static void Run(){
        Menukeuze mainMenu = new MainMenu("Main Menu");
        Menukeuze gameListMenu = new GameListMenu("Game List Menu");
        Menukeuze gameMenu = new GameMenu("Game Menu");


        gameListMenu.menu.voegKeuzeToe(gameMenu);
        mainMenu.menu.voegKeuzeToe(gameListMenu);

        gameListMenu.menu.voegKeuzeToe(mainMenu);
        gameMenu.menu.voegKeuzeToe(mainMenu);
        gameMenu.menu.voegKeuzeToe(gameListMenu);

        mainMenu.toonMenukeuze();
    }
}
