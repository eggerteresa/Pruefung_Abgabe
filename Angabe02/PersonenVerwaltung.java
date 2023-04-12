package Angabe02;

public class PersonenVerwaltung {
    private Person[] personen; //Array des Typs Person, entkommentieren Sie die Zeile, wenn die Klasse Person erstellt wurde
    private int anzahlPersonen;

// Methode die Person-Objekt pers als Übergabeparameter hat und dieses Objekt in ein bereits bestehendes Array von Personen hinzufügt
    public void fuegePersonHinzu(Person pers){
       // this.name = pers;
       // this.id = id;

     //   personen = new Person[pers];

    }

//    // Methode, die ein Person Objekt als Uebergabeparameter hat und die Person mit der angegebenen ID in dem bereits bestehendem Array zurückgibt
//    public void fuegePersonHinzu(Person pers) {
//        this.personen = personen;
//    }
//
//    public int lieferePersonMitId(int id) {
//
//    }


    // Methode mit id als ÜBergabeparameter, die Person mit der angegebenn id in dem bereits bestehendem Array von PErsonen zurückgibt
    public void lieferePersonMitId(int id) {
       for (int i =0; i< personen.length; i++) {
           if (personen[i].getId() ==id) {
               personen[i].setId(id);

           }
       }

    }

// Eine Methode die eine ganze Zahl id hat und Person mit id aus Array löscht
    public void entfernePersonMitId(int id) {
        for (int i =0; i<personen.length; i++) {
            if (personen[i].getId() == id) {
                personen[i] = null;
                System.out.println("Die Person mit ID " +id +" wurde aus dem System entfernt");
                return;
            }
        }
        // Kein Treffer:
        System.out.println("Person mit ID " + id + " konnte nicht gefunden werden.");
    }





}

