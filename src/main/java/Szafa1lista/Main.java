package Szafa1lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garderoba garderoba = new Garderoba();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== Garderoba ===");
            System.out.println("1. Pokaż wszystkie T-shirty");
            System.out.println("2. Pokaż wszystkie Koszule");
            System.out.println("3. Pokaż wszystkie Spodnie");
            System.out.println("4. Zmień poziom czystości");
            System.out.println("5. Wyjdź");
            System.out.print("Wybierz opcję: ");

            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1:
                    garderoba.pokazTshirts();
                    break;
                case 2:
                    garderoba.pokazKoszule();
                    break;
                case 3:
                    garderoba.pokazSpodnie();
                    break;
                case 4:
                    zmienPoziomCzystosci(scanner, garderoba);
                    break;
                case 5:
                    running = false;
                    System.out.println("Naurra");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        }
        scanner.close();
    }

    private static void zmienPoziomCzystosci(Scanner scanner, Garderoba garderoba) {
        System.out.println("Wybierz typ ubrania: 1 - T-shirt, 2 - Koszula, 3 - Spodnie");
        int typUbioru = scanner.nextInt();
        scanner.nextLine();

        String type;
        switch (typUbioru) {
            case 1:
                type = "tshirt";
                garderoba.pokazTshirts();
                break;
            case 2:
                type = "koszula";
                garderoba.pokazKoszule();
                break;
            case 3:
                type = "spodnie";
                garderoba.pokazSpodnie();
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
                return;
        }

        System.out.print("Wybierz numer ubrania do zmiany poziomu czystości: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        System.out.print("Podaj nowy poziom czystości (czyste/jeszcze ujdzie/lepiej nie): ");
        String nowyPoziomCzystosci = scanner.nextLine();
        garderoba.zmienPoziomCzystosci(type, index, nowyPoziomCzystosci);
    }
}
