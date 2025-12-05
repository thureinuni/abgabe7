package h1;

public class Zahl {

    public boolean even;
    public boolean small;
    public boolean positive;
    public int num;

    public void setEven() {
        int betrag;


        if (num < 0) {
            betrag = -num;
        } else {
            betrag = num;
        }

        // gerade falls Betrag durch 2 teilbar
        if (betrag % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
    }

    public void setPositive() {
        if (num > 0) {
            positive = true;
        } else {
            positive = false;
        }
    }

    public void setSmall() {
        if (num < 100) {
            small = true;
        } else {
            small = false;
        }
    }
}