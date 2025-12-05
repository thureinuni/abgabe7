package h3;

public class Mensch {

    public String name;
    public int gebJahr;
    public int alter;

    // -------------------------
    //        SETTER
    // -------------------------

    public void setName(String n) {
        name = n;
    }

    public void setGebJahr(int jahr) {
        gebJahr = jahr;
    }

    // berechnet das Alter (Jahr 2025 - Geburtsjahr)
    public void setAlter() {
        alter = 2025 - gebJahr;
    }


    public String getName() {
        return name;
    }

    public int getGebJahr() {
        return gebJahr;
    }

    public int getAlter() {
        return alter;
    }
}
