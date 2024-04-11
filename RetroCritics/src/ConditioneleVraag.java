import java.util.Scanner;
public class ConditioneleVraag extends OpenVraag{
    Scanner scanner = new Scanner(System.in);

    ConditioneleVraag(String beschrijving){

        this.beschrijving = beschrijving;
    }
    @Override
    public void beantwoord(){
        System.out.print("Uw antwoord: ");
        antwoord = scanner.nextLine();
    }
    @Override
    public void display() {
        System.out.println(beschrijving);
    }
}
