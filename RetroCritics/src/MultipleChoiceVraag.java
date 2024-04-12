import java.util.ArrayList;
import java.util.Scanner;
public class MultipleChoiceVraag extends Vraag{
    Scanner scanner = new Scanner(System.in);
    public byte antwoord;
    public byte isConditioneleVraag;
    ConditioneleVraag conditioneleVraag;

    MultipleChoiceVraag(int nummer, String beschrijving, byte isConditioneleVraag) {
        this.nummer = nummer;
        this.beschrijving = beschrijving;
        this.isConditioneleVraag = isConditioneleVraag;
    }
    @Override
    public String getAntwoord() {
        String antwoord = String.valueOf(this.antwoord);
        return antwoord;
    }
    @Override
    public void beantwoord(){
        boolean isByte = false;
        while (!isByte) {
            if (scanner.hasNextByte()) {
                antwoord = scanner.nextByte();
                antwoord--;
            } else {
                System.out.println("Voer een geldige keuze in");
            }
            if (antwoord >= 0 && antwoord < 4) {
                isByte = true;
            } else {
                System.out.println("Voer een geldige keuze in");
            }
        }
        if(isConditioneleVraag()) {
            conditioneleVraag.display();
            conditioneleVraag.beantwoord();
        }
    }

    @Override
    public void display() {
        System.out.println(nummer + ". " + beschrijving);
    }
    public boolean isConditioneleVraag() {
        return antwoord == isConditioneleVraag;
    }
    public void voegConditioneleVraagToe(String beschrijving){
        conditioneleVraag = new ConditioneleVraag(beschrijving);
    }
}