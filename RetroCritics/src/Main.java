import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SaveManager.initialize(); // DO NOT REMOVE DIS LINE BITCH
        Scanner scanner = new Scanner(System.in);
        MenuTest.Run();

        Game valueFamctorio = new Game("Famctorio", 1000, "Puzzel");
        Review review1 = new Review(scanner);
        valueFamctorio.reviews.add(review1);



    }
}