import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        /*
        Aufgabe 1: Minimum ermitteln
        Gegeben sind drei String Variablen mit beliebigen ganzzahligen Werten (als Strings!), z.B. "23", "5","13".
        Wandeln Sie die Strings in Integer-Werte um und ermitteln Sie das Minimum und Maximum der drei Zahlen.
        Geben Sie die drei Zahlen und das Minimum/Maximum auf der Konsole aus.

        Das Minimum von 23, 5 und 13 ist 5.
        Das Maximum von 23, 5 und 13 ist 23.
        */

        String a = "5";
        String b = "543";
        String c = "54";

        int zahlA = Integer.parseInt(a);
        int zahlB = Integer.parseInt(b);
        int zahlC = Integer.parseInt(c);

        int max = Integer.max(Integer.max(zahlA,zahlB), zahlC);
        System.out.println("Das maximum von " + zahlA + ", " + zahlB + " und " + zahlC + " ist " + max);
        int min = Integer.min(Integer.min(zahlA,zahlB), zahlC);
        System.out.println("Das minimum von " + zahlA + ", " + zahlB + " und " + zahlC + " ist " + min);

        System.out.println();

        /*
        Aufgabe 2: Rechnen mit Geldbeträgen

        Für das Rechnen mit Geldbeträgen (Kontobewegungen, Online Shop, Kassenbuch, etc.) eignet sich der Datentyp
        BigDecimal, weil es bei diesem Datentyp zu keinen Rundungsfehlern kommt. Erstellen Sie zwei Variablen vom Typ
        BigDecimal aus Ganz- oder Kommazahlen und eine dritte aus der Stringdarstellung einer Kommazahl. Addieren
        Sie die ersten beiden Zahlen und subtrahieren Sie die dritte davon. Geben Sie die Rechnung und das Ergebnis auf
        der Konsole aus.
        */

        BigDecimal zahl1 = new BigDecimal("500.23");
        BigDecimal zahl2 = new BigDecimal("235.2");
        String stringZahl = "124.56";
        BigDecimal zahl3 = new BigDecimal(stringZahl);
        BigDecimal addition = zahl1.add(zahl2);
        BigDecimal subtraction = addition.subtract(zahl3);
        System.out.println(zahl1 + " + " + zahl2 + " = " + addition + " - " + zahl3 + " = " + subtraction);


        /*
        Aufgabe 3: Gleich ist nicht immer gleich

        Legen Sie zwei Variablen mit denselben Werten von einem Begleiter-Datentyp
        (Integer, Double, BigDecimal,...) an. Überzeugen Sie sich von der Aussage, dass die Werte von
        Begleiter-Objekten zwar ident sein können, die Begleiter-Objekte selbst aber unterschiedlich sind.
        Geben Sie das Ergebnis Ihrer Überprüfung auf der Konsole aus.

        Werte sind gleich: true
        Begleiter-Objekte sind gleich: false

        Zusatz: was passiert, wenn Sie ein Begleiter-Objekt mit sich selbst vergleichen?
        Zusatz: was passiert, wenn Sie zwei primitive Werte (also int, float, ...) miteinander vergleichen?
        Was liefern in diesem Fall die Operatoren == und equals?
        */

        


    }
}