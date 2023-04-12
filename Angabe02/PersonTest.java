package Angabe02;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonenVerwaltung pv = new PersonenVerwaltung(); //Instanz der Klasse PersonenVerwaltung zum alles zu testen
int eingabe;

        do {
            System.out.println(" --- Willkommen zu Aufgabe01 ---");
            System.out.println("1: neue Person hinzufuegen");
            System.out.println("2: Personendaten einer gewissen Person ausgeben");
            System.out.println("3: Eine gewisse Person entfernen");
            System.out.println("4: Exit -> Programm beenden");
            System.out.println(            );
            System.out.println();
            System.out.println("Bitte jetzt Zahl eingeben: ");
             eingabe=scanner.nextInt();


             switch (eingabe) {
                 case 1:
                     System.out.println("Name der Person eingeben: ");
                     String name = scanner.next();
                    // pv.fuegePersonhinzu();
                    // System.out.println("Neue Person " + name + " mit ID:" + id "wurde hinzugefuegt");
                     break;

                 case 2:
                     System.out.println("Welche Person soll ausgegeben werden, geben Sie bitte die ID an: ");
                     int id = scanner.nextInt();
                     pv.lieferePersonMitId(id);
                     break;
                 case 3:
                     System.out.println("Welche Person soll entfernt werden, geben Sie bitte die ID an: ");
                     int id2 = scanner.nextInt();
                     pv.entfernePersonMitId(id2);
                     System.out.println("Person wird nun entfernt.");
                     break;
                 case 4:
                     System.out.println("Programm wird beendet - Ciao! ");
                 default:
                     System.out.println("Geben Sie bitte eine gueltige Nummer ein.");
             }

        }while (eingabe!=4);

    }
}
