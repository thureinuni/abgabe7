package h3;

public class H3_Main {

    public static void main(String[] args) {

        // Objekt erstellen
        Mensch m = new Mensch();

        // Anfangswerte setzen
        m.setName("Thurein");
        m.setGebJahr(1996);
        m.setAlter();       // berechnet: 2025 - 2015 = 10

        // Ausgabe
        System.out.println("Name: " + m.getName());
        System.out.println("Geburtsjahr: " + m.getGebJahr());
        System.out.println("Alter: " + m.getAlter());
    }
}
