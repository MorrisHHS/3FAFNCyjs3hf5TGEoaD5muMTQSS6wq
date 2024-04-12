public class SaleMenu extends Menukeuze {

    public SaleMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze() {
        System.out.println();

        // Kortingspercentage instellen
        int kortingBedrag = 20; // 20% korting (in centen)

        System.out.println("Games met korting:");
        for (Game game : Game.list) {
            // Korting berekenen en toepassen
            int korting = (game.getPrijs() * kortingBedrag) / 100;
            int nieuwePrijs = game.getPrijs() - korting;

            // Afdrukken van game met korting
            System.out.println("Game naam: " + game.getNaam());
            System.out.println("Oude prijs: " + game.getPrijs());
            System.out.println("Korting: " + korting);
            System.out.println("Nieuwe prijs na korting: " + nieuwePrijs);
            System.out.println();
        }

        System.out.println(" ");
        System.out.println(naam + ":");
        menu.toonMenu();
    }
}
