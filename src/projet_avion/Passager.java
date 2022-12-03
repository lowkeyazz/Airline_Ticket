package projet_avion;
import java.util.*;

public class Passager extends Personne {

    private String num_passeport;
    private double billet;

    public void saisir_passager() {
        Scanner LireClavier = new Scanner(System.in);
        try {
            super.saisir_personne();
            System.out.println("donner le numero de passeport: ");
            num_passeport = LireClavier.next();
        } catch (InputMismatchException LE) {
            System.out.println("entree invalide detecte");
            this.passager_aleatoire();
        }
    }

    public void passager_aleatoire() {
        super.definir_aleatoirement();
        String pass[] = new String[3];
        pass[0] = "abs123";
        pass[1] = "745gdho";
        pass[2] = "24s5gf";
        double bi[] = new double[3];
        bi[0] = 350;
        bi[1] = 460;
        bi[2] = 1500;
        Random r = new Random();
        int ind = Math.abs(r.nextInt() % 3);
        billet = bi[ind];
        num_passeport = pass[ind];
    }

    public void infos_passager() {
        super.infos_personne();
        System.out.println("le numero de passeport est: " + num_passeport);
    }

    public double montant_tarif() {
        return billet;
    }

    public String get_passeport() {
        return num_passeport;
    }
}