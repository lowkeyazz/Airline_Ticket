package projet_avion;
import java.util.*;
public class Compagnie {

    private Table_Vols t_vols;
    private Table_Personnel t_personnel;
    private Table_Machines t_machines;
    public float CA;

    public Compagnie() {
        Scanner LireClavier = new Scanner(System.in);
        try {
            System.out.println("donner le nombre de voyages que dispose l'entreprise: ");
            t_vols = new Table_Vols(LireClavier.nextInt());
            System.out.println("donner le nombre d'employeur que dispose l'entreprise: ");
            t_personnel = new Table_Personnel(LireClavier.nextInt());
            System.out.println("donner le nombre de machines que dispose l'entreprise: ");
            t_machines = new Table_Machines(LireClavier.nextInt());
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
            t_vols = new Table_Vols(10);
            t_personnel = new Table_Personnel(10);
            t_machines = new Table_Machines(10);
        } catch (NegativeArraySizeException LE) {
            System.out.println("entree detectee est invalide");
            t_vols = new Table_Vols(10);
            t_personnel = new Table_Personnel(10);
            t_machines = new Table_Machines(10);
        }
    }

    public void les_passagers(int rang) {
        t_vols.les_passagers(rang);
    }

    public void afficher_unpassager(int rang1, int rang2) {
        t_vols.afficher_unpassager(rang1, rang2);
    }

    public void ajouter_passager(Passager p, int rang) {
        t_vols.ajouter_passager(p, rang);
    }

    public void supprimer_passager(int rang1, int rang2) {
        t_vols.supprimer_passager(rang1, rang2);
    }

    public void supprimer_passager(int rang1, String a) {
        t_vols.supprimer_passager(rang1, a);
    }

    public void redefinir_passager(int rang1, int rang2) {
        t_vols.redefinir_passager(rang1, rang2);
    }

    public int compter_passager(int rang) {
        return t_vols.compter_passager(rang);
    }

    public float billet_passager(int rang1, int rang2) {
        return t_vols.billet_passager(rang1, rang2);
    }

    public void permuter_passagers(int rang, int rang1, int rang2) {
        t_vols.permuter_passagers(rang, rang1, rang2);
    }

    public int PlacesDisponibles(int rang) {
        return t_vols.PlacesDisponibles(rang);
    }

    public void ajouter_vol(Vol v) {
        t_vols.ajouter_vol(v);
    }

    public void supprimer_vol(int rang) {
        t_vols.supprimer_vol(rang);
    }

    public void lesVols() {
        t_vols.lesVols();
    }

    public void afficher_vol(int rang) {
        t_vols.afficher_vol(rang);
    }

    public void permuter_voyages(int rang1, int rang2) {
        t_vols.permuter_voyages(rang1, rang2);
    }

    public void redefinir_voyage(int rang) {
        t_vols.redefinir_voyage(rang);
    }

    public int max_voyages() {
        return t_vols.max_vol();
    }

    public boolean disponibilite_places(int rang) {
        return t_vols.disponibilite_places(rang);
    }

    public float CA_lesVols() {
        return t_vols.CA_lesVols();
    }

    public double impots() {
        return t_vols.CA_lesVols() * 0.3;
    }

    public float CA_vol(int rang) {
        return t_vols.CA_vol(rang);
    }

    public int compter_voyages() {
        return t_vols.compter_voyages();
    }

    public double get_charge() {
        return this.get_salaires() + this.get_consommations();
    }

    public double get_profit() {
        return this.CA_lesVols() - this.impots();
    }

    public void ajouter_personnel(Employeur p) {
        t_personnel.ajouter_personnel(p);
    }

    public void supprimer_personnel(int rang) {
        t_personnel.supprimer_personnel(rang);
    }

    public void supprimer_personnel(String a) {
        t_personnel.supprimer_personnel(a);
    }

    public void lespersonnels() {
        t_personnel.lespersonnels();
    }

    public void afficher_pilotes() {
        t_personnel.afficher_pilotes();
    }

    public void afficher_employeurs() {
        t_personnel.afficher_employeurs();
    }

    public int compter_pilote() {
        int compteur = 0;
        return t_personnel.compter_pilotes();
    }

    public int compter_employeur() {
        return t_personnel.compter_employeurs();
    }

    public int compter_lesemplyeurs() {
        return t_personnel.compter_lesemplyeurs();
    }

    public void redefinir_employeur(int rang) {
        t_personnel.redefinir_employeur(rang);
    }

    public int max_employeur() {
        return t_personnel.max_employeurs();
    }

    public void afficher_employeur(int rang) {
        t_personnel.afficher_employeur(rang);
    }

    public boolean disponibilite_employeur(int rang, double a, double b) {
        return t_personnel.disponibilite_employeur(rang, a, b);
    }

    public double delai_travail(int rang) {
        return t_personnel.delai_travail(rang);
    }

    public double get_salaires() {
        return t_personnel.get_salaires();
    }

    public void ajouter_machine(Machine m) {
        t_machines.ajouter_machine(m);
    }

    public void supprimer_machine(int rang) {
        t_machines.supprimer_machine(rang);
    }

    public void supprimer_machine(String a) {
        t_machines.supprimer_machine(a);
    }

    public void lesmachines() {
        t_machines.lesmachines();
    }

    public void autres_machines() {
        t_machines.autres_machines();
    }

    public void afficher_avions() {
        t_machines.afficher_avions();
    }

    public int compter_avion() {
        return t_machines.compter_avion();
    }

    public int compter_machines() {
        return t_machines.compter_machines();
    }

    public void redefinir_machine(int rang) {
        t_machines.redefinir_machine(rang);
    }

    public void afficher_machine(int rang) {
        t_machines.afficher_machine(rang);
    }

    public int max_machine() {
        return t_machines.max_machine();
    }

    public double get_consommations() {
        return t_machines.get_consommations();
    }
}