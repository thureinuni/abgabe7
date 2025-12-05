package h2;

import java.util.Arrays;

public class H2_main {

    public static void main(String[] args) {


        int[] a = {5, 2, 9, 1};
        int[] b = {5, 2, 9, 1};

        int[] result = change(a, b, 1, 3);

        System.out.println("Ergebnis: " + Arrays.toString(result));
    }


    public static int[] change(int[] a, int[] b, int start, int end) {

        // Fall 1: end <= start → leeres Array zurückgeben
        if (end <= start) {
            return new int[0];
        }

        // Fall 2: Inhalte NICHT identisch
        // Arrays.compare(a, b) == 0 bedeutet identisch
        if (Arrays.compare(a, b) != 0) {
            // neues Array mit gleichem Inhalt wie a
            return Arrays.copyOfRange(a, 0, a.length);
        }

        // Fall 3: Inhalte identisch → sortieren + Teilbereich zurückgeben

        // Zuerst Kopie von a machen
        int[] sorted = Arrays.copyOfRange(a, 0, a.length);

        // dann sortieren
        Arrays.sort(sorted);

        // Bereich [start, end) zurückgeben (exklusive end)
        return Arrays.copyOfRange(sorted, start, end);
    }
}
