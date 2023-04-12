package Angabe04;
import java.util.Arrays;

public class TestGame {
    public static void main(String[] args) {
        BatttleShipGame bsg = new BatttleShipGame(); //Instanz erzeugen
        bsg.displayField(); //Feld Zeichnen

        //Staerke pro Player
        System.out.println("\nMethode 0:");
        bsg.battleShipStrength('A');
        bsg.battleShipStrength('B');

        //Gesamtanzahl an Schiffen auf der Karte zuruckgeben
        System.out.println("\nMethode 1:");
        bsg.countBattleShips();


        //Schiffe pro Zeile zaehlen
        System.out.println("\nMethode 2:");
        //Methode ergänzen
        bsg.countOfShipsPerLine();


        //Durchschnittliche staerke der Schiffe von A
        // Richtiges Ergebnis??
        System.out.println("\nMethode 3:");
        bsg.averageShipStrengthPlayerA();

    }
}
