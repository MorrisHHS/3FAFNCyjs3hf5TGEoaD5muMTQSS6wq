public class Menukeuze extends MainMenu {
    public String naam;
    public Menu menu = new Menu();

    public void toonMenukeuze() {
        System.out.println(" ");
        System.out.println("Je zit in menu: " + naam);
        menu.toonMenu();
    }

    public Menukeuze(String naam){
        this.naam = naam;
    }
}
