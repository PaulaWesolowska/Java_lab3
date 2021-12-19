import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
         * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */


        // zadanie 1a
        enum LiczbyEnum {
            JEDEN, DWA, TRZY, CZTERY, PIĘĆ, SZEŚĆ;
        }
        // zadanie 1b
        enum StatusEnum {
            KONTYNUUJEMY, KONIEC
        }
        // zadanie 1c
        boolean wielkosc = true;
        while (wielkosc) {
            System.out.println("Pętla działa");
        }
        // zadanie 1d
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        while (wielkosc){
            int number = scan.nextInt();
            System.out.println(number);
        }
        // zadanie 1e
        System.out.println("Podaj liczbę");
        while (true) {
            int s1 = scan.nextInt();
            if (s1 == 0) {
                break;
            } else {
                System.out.println(s1);
            }
        }

        // zadanie 1e
        System.out.println("Podaj liczbę");
        while (true) {
            int s1 = scan.nextInt();
            if (s1 == 0) {
                break;
            } else {
                System.out.println(s1);
            }
        }
        // zadanie 1f
        System.out.println("Podaj liczbę");
        int nr;
        do {
            nr = scan.nextInt();
            switch (nr) {
                case 0:
                    System.out.println("Koniec działania programu");
                    break;
                case 1:
                    System.out.println("Jeden");
                    break;
                case 2:
                    System.out.println("Dwa");
                    break;
                case 3:
                    System.out.println("Trzy");
                    break;
                case 4:
                    System.out.println("Cztery");
                    break;
                case 5:
                    System.out.println("Pięć");
                    break;
                case 6:
                    System.out.println("Sześć");
                    break;
                case 7:
                    System.out.println("Siedem");
                    break;
                case 8:
                    System.out.println("Osiem");
                    break;
                case 9:
                    System.out.println("Dziewięć");
                    break;
                case 10:
                    System.out.println("Dziesięć");
                    break;
                default:
                    System.out.println("Nie ma takiej liczby");
                    break;
            }
        }while(nr != 0);
    // zadanie 1g
        System.out.println("Podaj liczbę");
        while(true) {
            int nr1 = scan.nextInt();
            if (nr1 == 0) {
                System.out.println(StatusEnum.KONIEC.toString());
                break;
            } else {
                System.out.println(StatusEnum.KONTYNUUJEMY.toString());
            }
        }

    }}
