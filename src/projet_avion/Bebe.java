package projet_avion;
import java.util.*;
public class Bebe extends Passager {

    private static float remise;

    public static float remise_bebe() {
        return remise;
    }

    public void bebe_aleatoire() {
        super.passager_aleatoire();
        remise = 60;
    }

    public void saisir_bebe() {
        Scanner LireClavier = new Scanner(System.in);
        try {
            super.saisir_passager();
            System.out.println("donner la remise:");
            remise = LireClavier.nextFloat();
        } catch (InputMismatchException LE) {
            System.out.println("entree invalide detecte");
            this.bebe_aleatoire();
        }
    }
}
