package Angabe02;

public class Person {
    private int id;
    private String name;

    int alter;
    double groesse;
    String nachname;
    String geburtsland;
    String zweitName;
    String haarfarbe;
    boolean hatGlatze;
    float schuhgroesse;
    boolean hatBeziehung;

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtsland() {
        return geburtsland;
    }

    public void setGeburtsland(String geburtsland) {
        this.geburtsland = geburtsland;
    }

    public String getZweitName() {
        return zweitName;
    }

    public void setZweitName(String zweitName) {
        this.zweitName = zweitName;
    }

    public String getHaarfarbe() {
        return haarfarbe;
    }

    public void setHaarfarbe(String haarfarbe) {
        this.haarfarbe = haarfarbe;
    }

    public boolean isHatGlatze() {
        return hatGlatze;
    }

    public void setHatGlatze(boolean hatGlatze) {
        this.hatGlatze = hatGlatze;
    }

    public float getSchuhgroesse() {
        return schuhgroesse;
    }

    public void setSchuhgroesse(float schuhgroesse) {
        this.schuhgroesse = schuhgroesse;
    }

    public boolean isHatBeziehung() {
        return hatBeziehung;
    }

    public void setHatBeziehung(boolean hatBeziehung) {
        this.hatBeziehung = hatBeziehung;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
