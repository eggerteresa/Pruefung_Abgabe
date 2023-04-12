package Angabe04;

public class BatttleShipGame {
    int[][] map = {
            {1, 0, 0, 2, 0, 0, 1, 1, 0, 0},
            {3, 0, -1, 0, 0, 0, 2, 0, -1, 0},
            {0, 3, 0, 0, -1, 0, 0, 2, 0, 0},
            {0, 0, 0, 4, 4, 0, 1, 0, 0, 2},
            {0, -3, 2, 0, 0, 0, -1, 0, 0, 0},
            {0, 0, -2, 0, 0, -4, 0, 0, -1, 0},
            {0, 0, 0, 0, -3, 0, 0, 0, 0, 0},
            {0, 0, -2, 0, -2, 0, 0, -2, 0, 0}
    };

    //Feld zeichnen
    public void displayField() {
        for (int[] a : map) {
            for (int b : a) {
                if (b >= 0) {
                    System.out.print(b + "   ");
                } else {
                    System.out.print(b + "  ");
                }
            }
            System.out.println();
        }
    }

    public int battleShipStrength(char player) {
        int gesamtstaerke = 0;
        switch (player) {
            case 'A':
                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        if (map[i][j] > 0) {
                            gesamtstaerke = gesamtstaerke + map[i][j];

                        }
                    }

                } System.out.println("Gesamtstaerke " + player + "ist " + gesamtstaerke);
                break;
            case 'B':
                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        if (map[i][j] < 0) {
                            gesamtstaerke = gesamtstaerke + (map[i][j] * -1);
                        }
                    }

                }System.out.println("Gesamtstaerke " + player + "ist " + gesamtstaerke);
        }
        return gesamtstaerke; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }



    public int countBattleShips() {
        int anzahlSchiffe=0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0) {
                    anzahlSchiffe++;
                }
            }
        }System.out.println(" Es sind " + anzahlSchiffe + " Schiffe auf der Landkarte");

        return anzahlSchiffe; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }
// HIer noch pro Zeile ERGÄNZEN!!!!!!
 public int[] countOfShipsPerLine() {
       int[] count = new int[8];
       int anzahlSchiffeReihe = 0;

       for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0) {
                    anzahlSchiffeReihe = anzahlSchiffeReihe++;
                }
            }
            count[i]= anzahlSchiffeReihe;
           System.out.println("Schiffe Pro Reihe :" + anzahlSchiffeReihe);

            //Nur pro forma damit kein Fehler angezeigt wird

        }return count;
  }



    public int totalShipsA() {
        int schiffanzahl=0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] > 0) {
                    schiffanzahl = schiffanzahl + map[i][j];
                }
            }
        }
        return schiffanzahl; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }

    public double averageShipStrengthPlayerA() {
            double averageShipStrengthPlayerA= totalShipsA()/ map.length;
        System.out.println("Player A hat eine durchschnittliche Schiffstaerke von "+ averageShipStrengthPlayerA);
        return averageShipStrengthPlayerA; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }


}
