import java.util.Scanner;
public class ConditioneleVraag extends OpenVraag{
    Scanner scanner = new Scanner(System.in);
    public byte conditioneleVraagNummer;

    ConditioneleVraag(byte conditioneleVraagNummer, String beschrijving){
        this.conditioneleVraagNummer = conditioneleVraagNummer;
        this.beschrijving = beschrijving;
    }
    @Override
    public void beantwoord(){
        antwoord = scanner.nextLine();
    }
    @Override
    public void display() {
        System.out.println(nummer + ". " + beschrijving);
    }
}
