package projet_avion;
import java.util.*;
public class Table_Vols {

    private Vol[] t_vol;
    private int max_vol;
    private int nb_vols;

    public Table_Vols(int a) {
        t_vol = new Vol[a];
        max_vol = a;
    }

    public void les_passagers(int rang) {
        t_vol[rang - 1].lespassagers();
    }

    public void afficher_unpassager(int rang1, int rang2) {
        t_vol[rang1 - 1].unpassager(rang2);
    }

    public void ajouter_passager(Passager p, int rang) {
        t_vol[rang - 1].ajouter_passager(p);
    }

    public void supprimer_passager(int rang1, int rang2) {
        if ((rang1 < nb_vols) && (rang1 > 0)) {
            t_vol[rang1 - 1].supprimer_passager(rang2);
        }
    }

    public void supprimer_passager(int rang1, String a) {
        t_vol[rang1 - 1].supprimer_passager(a);
    }

    public void redefinir_passager(int rang1, int rang2) {
        t_vol[rang1 - 1].redefinir_passager(rang2);
    }

    public int compter_passager(int rang) {
        return t_vol[rang - 1].compter_passagers();
    }

    public float billet_passager(int rang1, int rang2) {
        return t_vol[rang1 - 1].retour_tarif_passager(rang2);
    }

    public void permuter_passagers(int rang, int rang1, int rang2) {
        t_vol[rang - 1].permuter_passager(rang1, rang2);
    }

    public int PlacesDisponibles(int rang) {
        return t_vol[rang - 1].nbPlacesDisponibles();
    }

    public void ajouter_vol(Vol v) {
        try {
            if (nb_vols < max_vol) {
                t_vol[nb_vols] = v;
                nb_vols++;
            } else {
                throw new AjouterException();
            }
        } catch (AjouterException ae) {
            System.out.println(ae);
        }
    }

    public void supprimer_vol(int rang) {
        if (rang < max_vol) {
            for (int i = 0; i < nb_vols; i++) {
                t_vol[i] = t_vol[i + 1];
            }
        }
        nb_vols--;
    }

    public void lesVols() {
        for (int i = 0; i < nb_vols; i++) {
            t_vol[i].infos_vol();
        }
    }

    public void afficher_vol(int rang) {
        t_vol[rang - 1].infos_vol();
    }

    public void permuter_voyages(int rang1, int rang2) {
        Vol v;
        v = t_vol[rang1 - 1];
        t_vol[rang1 - 1] = t_vol[rang2 - 1];
        t_vol[rang2 - 1] = v;
    }

    public void redefinir_voyage(int rang) {
        Vol v = new Vol();
        v.saisi_vol();
        t_vol[rang - 1] = v;
    }

    public int max_vol() {
        return max_vol;
    }

    public boolean disponibilite_places(int rang) {
        if (t_vol[rang - 1].infos_places() > t_vol[rang - 1].compter_passagers()) {
            return true;
        } else {
            return false;
        }
    }

    public float CA_lesVols() {
        int nb = 0;
        for (int i = 0; i < nb_vols; i++) {
            nb += t_vol[i].CA_vol();
        }
        return nb;
    }

    public float CA_vol(int rang) {
        return t_vol[rang - 1].CA_vol();
    }

    public int compter_voyages() {
        return nb_vols;
    }
}
