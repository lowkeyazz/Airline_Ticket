package projet_avion;
import java.util.*;

public class Vol {

    private String code_vol;
    private String ville_depart;
    private String ville_arrivee;
    private Date date_vol;
    private double heure_vol;
    private float dure_vol;
    private float chiffre_affaires;
    private float tarif_billet;
    private Table_Passagers tableau;

    public void saisi_vol() {
        try {
            Scanner LireClavier = new Scanner(System.in);
            System.out.println("veuillez saisir les information a propos cette voyage");
            System.out.println("donner le code de vol: ");
            code_vol = LireClavier.next();
            System.out.println("donner l'heure de depart du vol: ");
            heure_vol = LireClavier.nextDouble();
            System.out.println("veuillez saisir la date de vol");
            date_vol = new Date();
            date_vol.saisir_date();
            System.out.println("donner la ville du depart puis d'arrivee: ");
            ville_depart = LireClavier.next();
            ville_arrivee = LireClavier.next();
            System.out.println("donner le nombre de places: ");
            tableau = new Table_Passagers(LireClavier.nextInt());
            System.out.println("donner la tarif de cette vol pour le public: ");
            tarif_billet = LireClavier.nextFloat();
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
            this.vol_aleatoire();
        }
    }

    public void vol_aleatoire() {
        Vol v = new Vol();
        Random r = new Random();
        String code[] = new String[5];
        code[0] = "lkh215";
        code[1] = "ko1987";
        code[2] = "2013mo";
        code[3] = "h2g858d";
        code[4] = "ndh258";
        String ville[] = new String[5];
        ville[0] = "paris";
        ville[1] = "tunis";
        ville[2] = "new york";
        ville[3] = "tabarka";
        ville[4] = "tokyo";
        double dep[] = new double[5];
        dep[0] = 8.00;
        dep[1] = 14.30;
        dep[2] = 10.50;
        dep[3] = 13.00;
        dep[4] = 19.30;
        int t[] = new int[5];
        t[0] = 600;
        t[1] = 400;
        t[2] = 350;
        t[3] = 450;
        t[4] = 550;
        int ind = Math.abs(r.nextInt() % 5);
        code_vol = code[ind];
        heure_vol = dep[ind];
        tableau = new Table_Passagers(t[ind]);
        tarif_billet = t[ind];
        ville_depart = ville[ind];
        ind = Math.abs(r.nextInt() % 5);
        ville_arrivee = ville[ind];
        date_vol = new Date();
        date_vol.date_aleatoire();
    }

    public void infos_vol() {
        System.out.println("\nle code de cette vol est: " + code_vol);
        System.out.println("la ville de depart est: " + ville_depart);
        System.out.println("la ville d'arrivee est: " + ville_arrivee);
        System.out.println("l'heure de depart est: " + heure_vol);
        System.out.println("le nombre de places reserves est: " + tableau.get_places());
        System.out.println("le nombre de places plein est: " + tableau.compter_passagers());
        System.out.println("le nombre de places disponible est: " + tableau.nbPlacesDisponible());
        System.out.println("la date de vol est: ");
        date_vol.infos_date();
    }

    public int infos_places() {
        return tableau.get_places();
    }

    public float CA_vol() {
        float chif = 0;
        for (int i = 0; i < tableau.compter_passagers(); i++) {
            chif += tableau.get_remise(i) * tarif_billet;
        }
        return chif;
    }

    public float retour_tarif_passager(int rang) {
        return tarif_billet * tableau.get_remise(rang);
    }

    public float retour_tarif_bebe() {
        return tarif_billet * (Bebe.remise_bebe() / 100);
    }

    public float retour_tarif_etudiant() {
        return (tarif_billet * (Etudiant.remise_etudiant() / 100));
    }

    public int get_places() {
        return tableau.get_places();
    }

    public void lespassagers() {
        tableau.lespassagers();
    }

    public void unpassager(int rang) {
        tableau.unpassager(rang);
    }

    public void ajouter_passager(Passager p) {
        tableau.ajouter_passager(p);
    }

    public void supprimer_passager(int rang) {
        tableau.supprimer_passager(rang);
    }

    public void supprimer_passager(String a) {
        tableau.supprimer_passager(a);
    }

    public void redefinir_passager(int rang) {
        tableau.redefinir_passager(rang);
    }

    public int compter_passagers() {
        return tableau.compter_passagers();
    }

    public void permuter_passager(int rang1, int rang2) {
        tableau.permuter_passager(rang1, rang2);
    }

    public int nbPlacesDisponibles() {
        return tableau.nbPlacesDisponible();
    }
}
