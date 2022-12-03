package projet_avion;
import java.util.*;
public class Table_Personnel {

    private Employeur[] t_employeur;
    private int max_employeur;
    private int nb_employeurs;

    public Table_Personnel(int a) {
        max_employeur = a;
        t_employeur = new Employeur[a];
    }

    public void ajouter_personnel(Employeur p) {
        try {
            if (nb_employeurs < max_employeur) {
                t_employeur[nb_employeurs] = p;
                nb_employeurs++;
            } else {
                throw new AjouterException();
            }
        } catch (AjouterException ae) {
            System.out.println(ae);
        }
    }

    public void supprimer_personnel(int rang) {
        if ((rang < nb_employeurs) && (rang > 0)) {
            for (int i = rang - 1; i < nb_employeurs; i++) {
                t_employeur[i] = t_employeur[i + 1];
            }
        }
        nb_employeurs--;
    }

    public void supprimer_personnel(String a) {
        boolean trouve = false;
        int i = 0;
        while ((!trouve) && (i < nb_employeurs)) {
            if (t_employeur[i].get_matricule().equals(a)) {
                trouve = true;
                if (i < nb_employeurs - 1) {
                    for (int j = i; j < nb_employeurs; j++) {
                        t_employeur[j] = t_employeur[j + 1];
                    }
                    nb_employeurs--;
                } else {
                    nb_employeurs--;
                }
            } else {
                i++;
            }
        }
    }

    public void lespersonnels() {
        for (int i = 0; i < nb_employeurs; i++) {
            if (t_employeur[i] instanceof Pilote) {
                ((Pilote) t_employeur[i]).infos_pilote();
            } else {
                t_employeur[i].infos_employeur();
            }
        }
    }

    public void afficher_pilotes() {
        for (int i = 0; i < nb_employeurs; i++) {
            if (t_employeur[i] instanceof Pilote) {
                ((Pilote) t_employeur[i]).infos_pilote();
            }
        }
    }

    public void afficher_employeurs() {
        for (int i = 0; i < nb_employeurs; i++) {
            if (!(t_employeur[i] instanceof Pilote)) {
                ((Employeur) t_employeur[i]).infos_employeur();
            }
        }
    }

    public int compter_pilotes() {
        int compteur = 0;
        for (int i = 0; i < nb_employeurs; i++) {
            if ((t_employeur[i] instanceof Pilote)) {
                compteur++;
            }
        }
        return compteur;
    }

    public int compter_employeurs() {
        return this.nb_employeurs - this.compter_pilotes();
    }

    public int compter_lesemplyeurs() {
        return nb_employeurs;
    }

    public void redefinir_employeur(int rang) {
        if (t_employeur[rang - 1] instanceof Pilote) {
            Employeur p = new Pilote();
            ((Pilote) p).saisir_pilote();
            t_employeur[rang - 1] = p;
        } else {
            Employeur p = new Employeur();
            p.saisir_employeur();
            t_employeur[rang - 1] = p;
        }
    }

    public void afficher_employeur(int rang) {
        if (t_employeur[rang - 1] instanceof Pilote) {
            ((Pilote) t_employeur[rang - 1]).infos_pilote();
        } else {
            t_employeur[rang - 1].infos_employeur();
        }
    }

    public int max_employeurs() {
        return max_employeur;
    }

    public boolean disponibilite_employeur(int rang, double a, double b) {
        return t_employeur[rang - 1].disponible_employeur(a, b);
    }

    public double delai_travail(int rang) {
        return t_employeur[rang - 1].delai_travail();
    }

    public double get_salaires() {
        double s = 0;
        for (int i = 0; i < nb_employeurs; i++) {
            s += t_employeur[i].get_salaire();
        }
        return s;
    }
}