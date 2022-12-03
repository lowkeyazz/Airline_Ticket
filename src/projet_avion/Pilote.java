package projet_avion;
import java.util.*;

public class Pilote extends Employeur {

    private double heures_vol;
    private String modele_pilote;

    public void saisir_pilote() {
        Scanner LireClavier = new Scanner(System.in);
        try {
            super.saisir_personne();
            System.out.println("donner le modele d'avion pilote: ");
            modele_pilote = LireClavier.next();
            System.out.println("donner le nb d'heure de vol");
            heures_vol = LireClavier.nextDouble();
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
            this.pilote_aleatoire();
        }
    }

    public void pilote_aleatoire() {
        super.employeur_aleatoire();
        double t2[] = new double[3];
        t2[0] = 6.35;
        t2[1] = 2.25;
        t2[2] = 1.3;
        String mp[] = new String[3];
        mp[0] = "boing";
        mp[1] = "air bus";
        mp[2] = "lufthansa";
        Random r = new Random();
        int ind = Math.abs(r.nextInt() % 3);
        heures_vol = t2[ind];
        modele_pilote = mp[ind];
    }

    public void infos_pilote() {
        super.infos_employeur();
    }
}