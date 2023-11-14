import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Zahl ein: ");
        int zahl = eingabe.nextInt();

        System.out.println("Die Quersumme der Zahl " + zahl + " lautet:");

        int quersumme = 0;
        while ( zahl > 0 ) {
            int ziffer = zahl % 10;
            quersumme = quersumme + ziffer;
            zahl = zahl / 10;

            System.out.print(ziffer);
            if (zahl > 0)
                System.out.print(" + ");
        }
        System.out.println(" = " + quersumme);
    }
}
