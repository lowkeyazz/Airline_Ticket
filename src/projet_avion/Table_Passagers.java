package projet_avion;

public class Table_Passagers {

    private Passager[] table;
    public int nb_passagers;
    private int places;

    public TablePassagers(int a) {
        places = a;
        table = new Passager[a];
    }

    public int get_places() {
        return places;
    }

    public void lespassagers() {
        for (int i = 0; i < nb_passagers; i++) {
            table[i].infos_passager();
        }
    }

    public void unpassager(int rang) {
        table[rang - 1].infos_passager();
    }

    public void ajouter_passager(Passager p) {
        try {
            if (nb_passagers < places) {
                table[nb_passagers] = p;
                nb_passagers++;
            } else {
                throw new AjouterException();
            }
        } catch (AjouterException ae) {
            System.out.println(ae);
        }
    }

    public void supprimer_passager(int rang) {
        if ((rang < nb_passagers) && (rang > 0)) {
            for (int i = rang - 1; i < nb_passagers; i++) {
                table[i] = table[i + 1];
            }
        }
        nb_passagers--;
    }

    public void supprimer_passager(String a) {
        boolean trouve = false;
        int i = 0;
        while ((!trouve) && (i < nb_passagers)) {
            if (table[i].get_passeport().equals(a)) {
                trouve = true;
                if (i < places - 1) {
                    for (int j = i; j < nb_passagers; j++) {
                        table[j] = table[j + 1];
                    }
                    nb_passagers--;
                } else {
                    nb_passagers--;
                }
            } else {
                i++;
            }
        }
    }

    public void redefinir_passager(int rang) {
        Passager p = new Passager();
        p.saisir_passager();
        table[rang - 1] = p;
    }

    public int compter_passagers() {
        return nb_passagers;
    }

    public void permuter_passager(int rang1, int rang2) {
        Passager p;
        p = table[rang1 - 1];
        table[rang1 - 1] = table[rang2 - 1];
        table[rang2 - 1] = p;
    }

    public int nbPlacesDisponible() {
        return places - nb_passagers;
    }

    public float get_remise(int a) {
        if (table[a] instanceof Etudiant) {
            return Etudiant.remise_etudiant();
        }
        if (table[a] instanceof Bebe) {
            return Bebe.remise_bebe();
        } else {
            return 1;
        }
    }
}