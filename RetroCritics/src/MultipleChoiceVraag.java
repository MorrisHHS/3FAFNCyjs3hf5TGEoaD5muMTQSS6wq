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
    public void beantwoord(){
        antwoord = scanner.nextByte();
        isConditioneleVraag();
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
