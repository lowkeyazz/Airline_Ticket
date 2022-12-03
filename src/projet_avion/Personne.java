package projet_avion;
import java.util.*;

public class Personne {

    protected String nom;
    protected String prenom;
    protected Date date_naissance;
    protected String proffession;

    public Personne() {
        date_naissance = new Date();
    }

    public void saisir_personne() {
        Scanner LireClavier = new Scanner(System.in);
        System.out.println("veuillez saisir les information a propos ce personne");
        System.out.println("donner le nom: ");
        nom = LireClavier.next();
        System.out.println("donner le prenom: ");
        prenom = LireClavier.next();
        System.out.println("veuiller saisir la date de naissance:");
        date_naissance = new Date();
        date_naissance.saisir_date();
        System.out.println("donner la proffession: ");
        proffession = LireClavier.next();
    }

    public void definir_aleatoirement() {
        String n[] = new String[4];
        n[0] = "mohamed ";
        n[1] = "sami ";
        n[2] = "youssef ";
        n[3] = "ahmed ";
        String p[] = new String[4];
        p[0] = "chihaoui";
        p[1] = "mejri";
        p[2] = "hammami";
        p[3] = "dridi";
        String pro[] = new String[4];
        pro[0] = "etudiant";
        pro[1] = "proffesseur";
        pro[2] = "ingenieur";
        pro[3] = "directeur";
        date_naissance = new Date();
        date_naissance.date_aleatoire();
        Random r = new Random();
        int i = Math.abs(r.nextInt() % 4);
        nom = n[i];
        prenom = p[i];
        proffession = pro[i];
    }

    public void infos_personne() {
        System.out.println("\nle nom est: " + nom + prenom);
        System.out.println("la date de naissance est:");
        date_naissance.infos_date();
        System.out.println("la proffession est: " + proffession);
    }
}