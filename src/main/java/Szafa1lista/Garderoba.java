package Szafa1lista;

import java.util.ArrayList;
import java.util.List;

public class Garderoba {
    final private List<Ubranie> tshirts;
    final private List<Ubranie> koszule;
    final private List<Ubranie> spodnie;

    public Garderoba() {
        this.tshirts = new ArrayList<>();
        tshirts.add(new Ubranie("Czarny", "L", "Wolczanka", "brak", "czyste"));
        tshirts.add(new Ubranie("Czarny", "M", "Wolczanka", "brak", "jeszcze ujdzie"));
        tshirts.add(new Ubranie("Biały", "L", "Wolczanka", "brak", "czyste"));
        tshirts.add(new Ubranie("Szary", "L", "Adidas", "sprany", "jeszcze ujdzie"));
        tshirts.add(new Ubranie("Niebieski", "XL", "Nike", "sprany", "lepiej nie"));
        tshirts.add(new Ubranie("Biały", "XL", "McDonald's", "piękny z nadrukiem BigMac", "czyste"));

        this.koszule = new ArrayList<>();
        koszule.add(new Ubranie("Jasny", "L", "?", "w kratke", "czyste"));
        koszule.add(new Ubranie("Musztardowy", "XL", "Reserved", "goated", "jeszcze ujdzie"));
        koszule.add(new Ubranie("Biały", "L", "Kappahl", "guzik lekko uwalony przy kołnierzyku", "czyste"));

        this.spodnie = new ArrayList<>();
        spodnie.add(new Ubranie("Niebieski", "30/38", "Wrangler", "Jeans", "jeszcze ujdzie"));
        spodnie.add(new Ubranie("Czarny", "32/36", "?", "W miare eleganckie", "czyste"));
    }

    public void pokazTshirts() {
        pokazUbranie(tshirts);
    }

    public void pokazKoszule() {
        pokazUbranie(koszule);
    }

    public void pokazSpodnie() {
        pokazUbranie(spodnie);
    }

    private void pokazUbranie(List<Ubranie> ubrania) {
        if (ubrania.isEmpty()) {
            System.out.println("Brak ubrań do wyświetlenia.");
        } else {
            for (int i = 0; i < ubrania.size(); i++) {
                System.out.println((i + 1) + ". " + ubrania.get(i));
            }
        }
    }

    public void zmienPoziomCzystosci(String type, int index, String czystosc) {
        List<Ubranie> selectedList;

        switch (type.toLowerCase()) {
            case "tshirt":
                selectedList = tshirts;
                break;
            case "koszula":
                selectedList = koszule;
                break;
            case "spodnie":
                selectedList = spodnie;
                break;
            default:
                System.out.println("Nieznany typ ubrania.");
                return;
        }

        if (index < 0 || index >= selectedList.size()) {
            System.out.println("Nieprawidłowy indeks ubrania.");
            return;
        }

        selectedList.get(index).ustawPoziomCzystosci(czystosc);
        System.out.println("Poziom czystości został zaktualizowany.");
    }
}