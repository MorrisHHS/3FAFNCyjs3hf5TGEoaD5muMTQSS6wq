import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game valurFamctorio = new Game("Famctorio", 1000);
        Review review1 = new Review(scanner);
        MainMenu mainMenu = new MainMenu("argument");
        mainMenu.toonMenukeuze();
    }
}