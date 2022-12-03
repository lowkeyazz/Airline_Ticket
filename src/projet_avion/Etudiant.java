package projet_avion;
import java.util.*;
public class Etudiant extends Passager {

    private static float remise;

    public static float remise_etudiant() {
        return remise;
    }

    public void etudiant_aleaoire() {
        super.passager_aleatoire();
        remise = 30;
    }

    public void saisir_etudiant() {
        Scanner LireClavier = new Scanner(System.in);
        try {
            super.saisir_passager();
            System.out.println("donner le remise: ");
            remise = LireClavier.nextFloat();
        } catch (InputMismatchException LE) {
            System.out.println(LE);
            this.etudiant_aleaoire();
        }
    }
}