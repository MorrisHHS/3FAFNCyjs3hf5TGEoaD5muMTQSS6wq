import java.util.Scanner;
public class ConditioneleVraag extends OpenVraag{
    Scanner scanner = new Scanner(System.in);
    public byte conditioneleVraagNummer;

    ConditioneleVraag(String beschrijving){
        this.beschrijving = beschrijving;
    }
    @Override
    public void beantwoord(){
        antwoord = scanner.nextLine();
    }
    @Override
    public void display() {
        System.out.println(beschrijving);
    }
}
