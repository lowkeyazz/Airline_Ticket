package projet_avion;
public class TableMachines {

    private Machine[] t_machine;
    private int max_machine;
    private int nb_machines;

    public TableMachines(int a) {
        max_machine = a;
        t_machine = new Machine[a];
    }

    public void ajouter_machine(Machine m) {
        try {
            if (nb_machines < max_machine) {
                t_machine[nb_machines] = m;
                nb_machines++;
            } else {
                throw new AjouterException();
            }
        } catch (AjouterException ae) {
            System.out.println(ae);
        }
    }

    public void supprimer_machine(int rang) {
        if ((rang < nb_machines) && (rang > 0)) {
            for (int i = rang - 1; i < nb_machines; i++) {
                t_machine[i] = t_machine[i + 1];
            }
        }
        nb_machines--;
    }

    public void supprimer_machine(String a) {
        boolean trouve = false;
        int i = 0;
        while ((!trouve) && (i < nb_machines)) {
            if (t_machine[i].get_modele().equals(a)) {
                trouve = true;
                if (i < nb_machines - 1) {
                    for (int j = i; j < nb_machines; j++) {
                        t_machine[j] = t_machine[j + 1];
                    }
                    nb_machines--;
                } else {
                    nb_machines--;
                }
            } else {
                i++;
            }
        }
    }

    public void lesmachines() {
        for (int i = 0; i < nb_machines; i++) {
            if (t_machine[i] instanceof Avion) {
                ((Avion) t_machine[i]).infos_avion();
            } else {
                t_machine[i].infos_machine();
            }
        }
    }

    public void autres_machines() {
        for (int i = 0; i < nb_machines; i++) {
            if (!(t_machine[i] instanceof Avion)) {
                t_machine[i].infos_machine();
            }
        }
    }

    public void afficher_avions() {
        for (int i = 0; i < nb_machines; i++) {
            if (t_machine[i] instanceof Avion) {
                ((Avion) t_machine[i]).infos_avion();
            }
        }
    }

    public int compter_avion() {
        int compteur = 0;
        for (int i = 0; i < nb_machines; i++) {
            if ((t_machine[i] instanceof Avion)) {
                compteur++;
            }
        }
        return compteur;
    }

    public int compter_machines() {
        return nb_machines - compter_avion();
    }

    public int max_machine() {
        return max_machine;
    }

    public void redefinir_machine(int rang) {
        if (t_machine[rang - 1] instanceof Avion) {
            Machine p = new Avion();
            ((Avion) p).saisir_avion();
            t_machine[rang - 1] = p;
        } else {
            Machine p = new Machine();
            p.saisir_machine();
            t_machine[rang - 1] = p;
        }
    }

    public void afficher_machine(int rang) {
        if (t_machine[rang - 1] instanceof Avion) {
            ((Avion) t_machine[rang - 1]).infos_avion();
        } else {
            t_machine[rang - 1].infos_machine();
        }
    }

    public double get_consommations() {
        double s = 0;
        for (int i = 0; i < nb_machines; i++) {
            s += t_machine[i].consommation_machine();
        }
        return s;
    }
}  
