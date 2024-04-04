import java.util.Scanner;
public class OpenVraag extends Vraag{
    Scanner scanner = new Scanner(System.in);
    public String antwoord;
    OpenVraag (){

    }
    OpenVraag(int nummer, String beschrijving){
        this.nummer = nummer;
        this.beschrijving = beschrijving;
    }
    @Override
    public void beantwoord() {
        antwoord = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println(nummer + ". " + beschrijving);
    }
}
