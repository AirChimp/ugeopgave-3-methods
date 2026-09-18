public class Opgave5 {

    void main() {

        int a = 7, b = 42;

        int smaller = minimum(a, b); // FIX: Gemmer værdien som minimum() returnerer i variablen smaller

        if (smaller == a) { // FIX: Fjernet {} efter if og bruger den lokale variabel smaller

            System.out.println("7 is the smallest!"); // FIX: Ændret teksten til det ønskede output

        }

    }

    int minimum(int a, int b) { // FIX: Ændret void til int, fordi metoden skal returnere et tal

        if (a < b) {

            return a; // FIX: Returnerer a direkte i stedet for at lave en lokal variabel

        } else { // FIX: Ændret else (a >= b) til korrekt Java-syntaks

            return b; // FIX: Returnerer b direkte

        }

    }
}
