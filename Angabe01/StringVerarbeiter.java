package Angabe01;

public class StringVerarbeiter {
    public static void main(String[] args) {

        System.out.println(lieferLaenge("hallo"));
        System.out.println(liefereZeichen("Hallo", 1));
        System.out.println(ersetzeAlle("Hallo", 'l', 'x'));
        System.out.println(stringVergleicher("Max", "Max"));
        System.out.println(stringVergleicher("Max", "Nix"));


    }

    //Methode liefert Laenge eines Wortes
    public static int lieferLaenge(String wort) {
        int laengeWort = wort.length();
        System.out.println("Das Wort hat " + laengeWort + " Buchstaben");
        return laengeWort;
    }

    //Methode liefert Zeichenanzahl eines Strings
    public static char liefereZeichen(String wort, int zahl) {
        char zeichenWort = wort.charAt(zahl);
        System.out.println("Das Zeichen an der Stelle " + zahl +" ist " + zeichenWort);
        return zeichenWort;
    }

//Methode ersetzt Zeichen im String
    public static String ersetzeAlle(String wort, char alt, char neu) {
        String neuesWort = wort.replace(alt,neu );
        System.out.println("Das Wort " + wort + " ist nach der Veraenderung " + neuesWort);
        return neuesWort;
    }

    // Methode vergleicht zwei Strings, könnte man zusätzlich noch wort.toLowercase - wenn man groß und klein-Schreibung außen vorlassen möchte
    public static boolean stringVergleicher (String wort1, String wort2) {
        boolean gleich =false;
        if (wort1.equals(wort2)){
            gleich = true;
            System.out.println("Die Strings " + wort1 +" und " + wort2 +" sind gleich. ");}
        if (!wort1.equals(wort2)) {
            gleich = false;
            System.out.println("Die Strings " + wort1 +" und " + wort2 +" sind NICHT gleich. ");}


        return gleich;
    }


}
