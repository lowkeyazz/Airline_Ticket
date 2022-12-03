package projet_avion;
import java.util.*;
public class Avion extends Machine {

    private float vitesse_max;
    private int nbmax_passagers;

    public void saisir_avion() {
        Scanner LireClavier = new Scanner(System.in);
        try {
            super.saisir_machine();
            System.out.println("donner la vitesse maximale: ");
            vitesse_max = LireClavier.nextFloat();
            System.out.println("donner la capacite de cette avion en passagers: ");
            nbmax_passagers = LireClavier.nextInt();
            System.out.println("donner la consommation: ");
            consommation = LireClavier.nextFloat();
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
            this.avion_aleatoire();
        }
    }

    public void avion_aleatoire() {
        super.definir_aleatoirement();
        int pa[] = new int[3];
        pa[0] = 350;
        pa[1] = 450;
        pa[2] = 500;
        float vm[] = new float[3];
        vm[0] = 350;
        vm[1] = 450;
        vm[2] = 500;
        Random r = new Random();
        int ind = Math.abs(r.nextInt() % 3);
        vitesse_max = vm[ind];
        nbmax_passagers = pa[ind];
    }

    public void infos_avion() {
        super.infos_machine();
        System.out.println("la vitesse maximale est: " + vitesse_max + "KM/h");
        System.out.println("le nombre maximale des passagers est: " + nbmax_passagers + "passagers");
        System.out.println("la consommation est" + consommation + "DT");
    }
}