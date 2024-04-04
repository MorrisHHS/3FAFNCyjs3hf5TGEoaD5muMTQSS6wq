import java.util.ArrayList;
public class MultipleChoiceVraag extends Vraag{
    public byte antwoord;
    ArrayList<ConditioneleVraag> conditioneleVragen = new ArrayList<ConditioneleVraag>();

    MultipleChoiceVraag(int nummer, String beschrijving) {
        this.nummer = nummer;
        this.beschrijving = beschrijving;
    }
    @Override
    public void beantwoord(){

    }

    @Override
    public void display() {
        super.display();
    }
}
