public class BiletKino {
    private String film;
    private int numerMiejsca;
    private double cena;
    private boolean czyZarezerwowany;

    public BiletKino(String film, int numerMiejsca, double cena) {
        this.film = film;
        this.numerMiejsca = numerMiejsca;
        this.cena = cena;
        this.czyZarezerwowany = false;
    }

    public void zarezerwujBilet() {
        if (!czyZarezerwowany) {
            czyZarezerwowany = true;
            System.out.println("Bilet został zarezerwowany.");
        } else {
            System.out.println("Bilet już jest zarezerwowany!");
        }
    }

    public void anulujRezerwacje() {
        if (czyZarezerwowany) {
            czyZarezerwowany = false;
            System.out.println("Rezerwacja biletu została anulowana.");
        } else {
            System.out.println("Bilet nie był zarezerwowany.");
        }
    }

    public void wyswietlInformacje() {
        System.out.println("Film: " + film);
        System.out.println("Numer miejsca: " + numerMiejsca);
        System.out.println("Cena: " + cena + " zł");
        System.out.println("Zarezerwowany: " + (czyZarezerwowany ? "Tak" : "Nie"));
    }

    public static void main(String[] args) {
        BiletKino bilet1 = new BiletKino("Incepcja", 12, 29.99);
        BiletKino bilet2 = new BiletKino("Interstellar", 45, 34.99);

        bilet1.wyswietlInformacje();
        bilet1.zarezerwujBilet();
        bilet1.wyswietlInformacje();

        System.out.println();

        bilet2.wyswietlInformacje();
        bilet2.anulujRezerwacje();
        bilet2.zarezerwujBilet();
        bilet2.anulujRezerwacje();
        bilet2.wyswietlInformacje();
    }
}
