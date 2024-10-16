package Szafa1lista;

public class Ubranie {
    final private String kolor;
    final private String rozmiar;
    final private String marka;
    final private String dodatkoweInformacje;
    private String poziomCzystosci;

    public Ubranie(String kolor, String rozmiar, String marka, String dodatkoweInformacje, String poziomCzystosci) {
        this.kolor = kolor;
        this.rozmiar = rozmiar;
        this.marka = marka;
        this.dodatkoweInformacje = dodatkoweInformacje;
        ustawPoziomCzystosci(poziomCzystosci);
    }

    public void ustawPoziomCzystosci(String poziomCzystosci) {
        switch (poziomCzystosci.toLowerCase()) {
            case "czyste":
            case "jeszcze ujdzie":
            case "lepiej nie":
                this.poziomCzystosci = poziomCzystosci;
                break;
            default:
                System.out.println("Nieprawidłowy poziom czystości. Ustawiono na 'czyste'.");
                this.poziomCzystosci = "czyste";
        }
    }

    @Override
    public String toString() {
        return "Kolor: " + kolor + ", Rozmiar: " + rozmiar + ", Marka: " + marka +
                ", Dodatkowe informacje: " + dodatkoweInformacje + ", Poziom czystości: " + poziomCzystosci;
    }
}