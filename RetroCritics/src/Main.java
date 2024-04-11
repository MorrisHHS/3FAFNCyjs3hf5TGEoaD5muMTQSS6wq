import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game valueFamctorio = new Game("Famctorio", 1000);
        Review review1 = new Review(scanner);
        valueFamctorio.reviews.add(review1);


    }
}