package projet_avion;
import java.util.*;
public class Employeur extends Personne {

    private String num_matricule;
    protected double salaire;
    protected double begin_travail;
    protected double end_travail;

    public void saisir_employeur() {
        Scanner LireClavier = new Scanner(System.in);
        try {
            super.saisir_personne();
            System.out.println("donner le num de matricule: ");
            num_matricule = LireClavier.next();
            System.out.println("donner le salaire de ce personne: ");
            salaire = LireClavier.nextDouble();
            System.out.println("donner l'heure de debut de travail: ");
            begin_travail = LireClavier.nextDouble();
            System.out.println("donner l'heure de fin de travail: ");
            end_travail = LireClavier.nextDouble();
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
            this.employeur_aleatoire();
        }
    }

    public void employeur_aleatoire() {
        super.definir_aleatoirement();
        Random r = new Random();
        String t1[] = new String[3];
        t1[0] = "212454556";
        t1[1] = "1255035";
        t1[2] = "15472036";
        double sal[] = new double[3];
        sal[0] = 1500.0;
        sal[1] = 1000.0;
        sal[2] = 1350;
        double beg[] = new double[3];
        beg[0] = 8.00;
        beg[1] = 9;
        beg[2] = 10;
        double end[] = new double[3];
        end[0] = 13.00;
        end[1] = 19.30;
        end[2] = 18;
        int i = Math.abs(r.nextInt() % 3);
        num_matricule = t1[i];
        salaire = sal[i];
        begin_travail = beg[i];
        end_travail = end[i];
    }

    public void infos_employeur() {
        super.infos_personne();
        System.out.println("le numero du matricule est: " + num_matricule);
        System.out.println("heure de depart de travail est: " + begin_travail);
        System.out.println("heure de fin de travail est: " + end_travail);
    }

    public double delai_travail() {
        return end_travail - begin_travail;
    }

    public boolean disponible_employeur(double a, double b) {
        if (end_travail <= a) {
            return true;
        } else {
            if (begin_travail >= b) {
                return true;
            } else {
                return false;
            }
        }
    }

    public double get_salaire() {
        return salaire;
    }

    public String get_matricule() {
        return num_matricule;
    }
}
