public class ConditioneleVraag extends OpenVraag{
    public byte conditioneleVraagNummer;

    ConditioneleVraag(int nummer, String beschrijving){
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
