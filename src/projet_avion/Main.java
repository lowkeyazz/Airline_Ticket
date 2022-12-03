package projet_avion;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int choix = 1;
        int numero = 0;
//initialisation des tableaux
        Compagnie tour = new Compagnie();
//lecture de clavier
        Scanner LireClavier = new Scanner(System.in);
//menu principale
        do {
            Menu.Principale();
            switch (choix = LireClavier.nextInt()) {
//menu du personnel(1) 
                case 1:
                    do {
                        Menu.Personnel();
                        switch (choix = LireClavier.nextInt()) {
//menu des pilotes1(1)	   
                            case 11:
                                do {
                                    Menu.Pilote();
//operation sur les pilotes
                                    switch (choix = LireClavier.nextInt()) {
                                        case 111:
                                            Employeur p = new Pilote();
                                            ((Pilote) p).saisir_pilote();
                                            tour.ajouter_personnel(p);
                                            break;
                                        case 1111:
                                            p = new Pilote();
                                            ((Pilote) p).pilote_aleatoire();
                                            tour.ajouter_personnel(p);
                                            ;
                                            break;
                                        case 112:
                                            System.out.println("donner le numero de ce pilote: ");
                                            tour.supprimer_personnel(LireClavier.nextInt());
                                            break;
                                        case 1121:
                                            System.out.println("donner le numero de matricule de ce pilote");
                                            tour.supprimer_personnel(LireClavier.next());
                                            break;
                                        case 113:
                                            System.out.println("donner le numero de ce pilote: ");
                                            tour.afficher_employeur(LireClavier.nextInt());
                                            break;
                                        case 114:
                                            System.out.println("les pilotes sont:");
                                            tour.afficher_pilotes();
                                            break;
                                        case 115:
                                            System.out.println("donner le numero de ce pilote: ");
                                            tour.redefinir_employeur(LireClavier.nextInt());
                                            break;
                                        case 116:
                                            System.out.println("veuillez saisir le numero,l'heure de debut et l'heure de fin de travail: ");
                                            numero = LireClavier.nextInt();
                                            double hdepart = LireClavier.nextDouble();
                                            double hfin = LireClavier.nextDouble();
                                            System.out.println("la disponibilite est: " + tour.disponibilite_employeur(numero, hdepart, hfin));
                                            break;
                                        case 117:
                                            System.out.println("le nombre de pilotes est:" + tour.compter_pilote());
                                            break;
                                        case 118:
                                            System.out.println("donner le numero de ce pilote");
                                            System.out.println("le delai de travail est: " + tour.delai_travail(LireClavier.nextInt()));
                                            break;
                                        case 110:
                                            System.out.println("aurevoir");
                                            break;
                                        default:
                                            System.out.println("choix incorrecte");
                                    }
                                } while (choix != 110);
                                break;
//menu des employeur(13)
                            case 12:
                                do {
                                    Menu.Employeur();
                                    switch (choix = LireClavier.nextInt()) {
                                        case 121:
                                            Employeur e = new Employeur();
                                            e.saisir_employeur();
                                            tour.ajouter_personnel(e);
                                            break;
                                        case 1211:
                                            e = new Employeur();
                                            e.employeur_aleatoire();
                                            tour.ajouter_personnel(e);
                                            ;
                                            break;
                                        case 122:
                                            System.out.println("donner le numero: ");
                                            tour.supprimer_personnel(LireClavier.nextInt());
                                            break;
                                        case 1221:
                                            System.out.println("donner le numero de matricule de ce employeur");
                                            tour.supprimer_personnel(LireClavier.next());
                                            break;
                                        case 123:
                                            System.out.println("donner le numero: ");
                                            tour.afficher_employeur(LireClavier.nextInt());
                                            break;
                                        case 124:
                                            System.out.println("les employeur sont: ");
                                            tour.afficher_employeurs();
                                            break;
                                        case 125:
                                            System.out.println("donner le numero: ");
                                            tour.redefinir_employeur(LireClavier.nextInt());
                                            break;
                                        case 126:
                                            System.out.println("veuillez saisir le numero,l'heure de debut et l'heure de fin de travail: ");
                                            numero = LireClavier.nextInt();
                                            int hdepart = LireClavier.nextInt();
                                            int hfin = LireClavier.nextInt();
                                            System.out.println("la disponibilite est: " + tour.disponibilite_employeur(numero, hdepart, hfin));
                                            break;
                                        case 127:
                                            System.out.println("le nombre d'employeurs est: " + tour.compter_employeur());
                                            break;
                                        case 128:
                                            System.out.println("donner le numero de ce employeur");
                                            System.out.println("le delai de travail est: " + tour.delai_travail(LireClavier.nextInt()));
                                            break;
                                        case 120:
                                            System.out.println("aurevoir");
                                            break;
                                        default:
                                            System.out.println("choix incorrecte");
                                    }
                                } while (choix != 120);
                                break;
                            case 13:
                                System.out.println("la somme des salaires est de: " + tour.get_salaires() + "DT");
                                break;
                            case 14:
                                System.out.println("le nombre des employeurs est: " + tour.compter_lesemplyeurs());
                                break;
                            case 15:
                                System.out.println("le nombre maximale des employeurs est : " + tour.max_employeur());
                                break;
                            case 10:
                                System.out.println("Au revoir!!");
                                break;
                            default:
                                System.out.println("Choix incorrecte");
                        }
                    } while (choix != 10);
                    break;
                //menu de gestion des vols													
                case 2:
                    do {
                        Menu.Vol();
                        switch (choix = LireClavier.nextInt()) {
                            case 21:
                                Vol v = new Vol();
                                v.saisi_vol();
                                tour.ajouter_vol(v);
                                break;
                            case 211:
                                v = new Vol();
                                v.vol_aleatoire();
                                tour.ajouter_vol(v);
                                ;
                                break;
                            case 22:
                                System.out.println("donner le numero de cette voyage: ");
                                tour.supprimer_vol(LireClavier.nextInt());
                                break;
                            case 23:
                                System.out.println("les voyages disponibles sont: ");
                                tour.lesVols();
                                break;
                            case 24:
                                System.out.println("donner le numero du vol: ");
                                numero = LireClavier.nextInt();
                                System.out.println("la disponibilite est: " + tour.disponibilite_places(numero));
                                break;
                            case 25:
                                System.out.println("donner le numero de cette voyage: ");
                                numero = LireClavier.nextInt();
                                tour.afficher_vol(numero);
                                break;
                            case 26:
                                System.out.println("donner le numero des 2 voyages: ");
                                int numero1 = LireClavier.nextInt();
                                int numero2 = LireClavier.nextInt();
                                tour.permuter_voyages(numero1, numero2);
                                break;
                            case 27:
                                System.out.println("donner le numero de cette voyage: ");
                                numero = LireClavier.nextInt();
                                tour.redefinir_voyage(numero);
                                break;
                            case 28:
                                System.out.println("le nombre de voyage organise est: " + tour.compter_voyages());
                                break;
                            case 281:
                                System.out.println("le nombre maximale des voyages est: " + tour.max_voyages());
                                break;
                            case 29:
                                System.out.println("donner le numero du voyage: ");
                                System.out.println("le nombre de places disponible est: " + tour.PlacesDisponibles(LireClavier.nextInt()));
                                break;
                            case 20:
                                System.out.println("aurevoir");
                                break;
                            default:
                                System.out.println("choix incorrecte");
                        }
                    } while (choix != 20);
                    break;
//gestion des machines
                case 3:
                    do {
                        Menu.Machine();
//gestion des avions
                        switch (choix = LireClavier.nextInt()) {
                            case 31:
                                do {
                                    Menu.Avion();
                                    switch (choix = LireClavier.nextInt()) {
                                        case 311:
                                            Machine v = new Avion();
                                            ((Avion) v).saisir_avion();
                                            tour.ajouter_machine(v);
                                            break;
                                        case 3111:
                                            v = new Avion();
                                            ((Avion) v).avion_aleatoire();
                                            tour.ajouter_machine(v);
                                            ;
                                            break;
                                        case 312:
                                            System.out.println("donner le numero de cette avion: ");
                                            tour.supprimer_machine(LireClavier.nextInt());
                                            ;
                                            break;
                                        case 3121:
                                            System.out.println("donner le modele de cet avion");
                                            tour.supprimer_machine(LireClavier.next());
                                            break;
                                        case 313:
                                            tour.afficher_avions();
                                            break;
                                        case 314:
                                            System.out.println("donner le numero: ");
                                            tour.afficher_machine(LireClavier.nextInt());
                                            break;
                                        case 315:
                                            System.out.println("donner le numero de cette avion: ");
                                            tour.redefinir_machine(LireClavier.nextInt());
                                            System.out.println("redefinition termine avec succes");
                                            break;
                                        case 316:
                                            System.out.println("le nombre des avion est: " + tour.compter_avion());
                                            break;
                                        case 310:
                                            System.out.println("aurevoir");
                                            break;
                                        default:
                                            System.out.println("choix incorrecte");
                                    }
                                } while (choix != 310);
                                break;
//autre machine
                            case 32:
                                do {
                                    Menu.AutreMachine();
                                    switch (choix = LireClavier.nextInt()) {
                                        case 321:
                                            Machine m = new Machine();
                                            tour.ajouter_machine(m);
                                            break;
                                        case 3211:
                                            m = new Machine();
                                            m.definir_aleatoirement();
                                            tour.ajouter_machine(m);
                                            ;
                                            break;
                                        case 322:
                                            System.out.println("donner le numero de cette avion: ");
                                            tour.supprimer_machine(LireClavier.nextInt());
                                            break;
                                        case 3221:
                                            System.out.println("donner le modele de cet avion");
                                            tour.supprimer_machine(LireClavier.next());
                                            break;
                                        case 323:
                                            tour.autres_machines();
                                            break;
                                        case 324:
                                            System.out.println("donner le numero: ");
                                            tour.afficher_machine(LireClavier.nextInt());
                                            break;
                                        case 325:
                                            System.out.println("donner le numero de cette machine: ");
                                            tour.redefinir_machine(LireClavier.nextInt());
                                            System.out.println("redefinition termine avec succes");
                                            break;
                                        case 326:
                                            System.out.println("le nombre des machines est de: " + tour.compter_machines());
                                            break;
                                        case 320:
                                            System.out.println("aurevoir");
                                            break;
                                        default:
                                            System.out.println("choix incorrecte");
                                    }
                                } while (choix != 320);
                                break;
                            case 33:
                                System.out.println("la consommation des machines est de :" + tour.get_consommations() + "DT");
                                break;
                            case 34:
                                System.out.println("le nombre maximale des machines est: " + tour.max_machine());
                                break;
                            case 30:
                                System.out.println("Aurevoir");
                                break;
                            default:
                                System.out.println("choix incorrecte");
                        }
                    } while (choix != 30);
                    break;
//gestion des passagers
                case 4:
                    do {
                        Menu.Passager();
                        numero = 0;
                        char choix2 = 0;
                        switch (choix = LireClavier.nextInt()) {
                            case 41:
                                System.out.println("donner le numero de voyage: ");
                                numero = LireClavier.nextInt();
                                do {
                                    System.out.println("bebe(b) ou etudiant(e) ou simple passager(p) ou sortir (o)");
                                    Passager p;
                                    switch (choix2 = LireClavier.next().charAt(0)) {
                                        case 'b':
                                            p = new Bebe();
                                            ((Bebe) p).saisir_bebe();
                                            tour.ajouter_passager(p, numero);
                                            break;
                                        case 'e':
                                            p = new Etudiant();
                                            ((Etudiant) p).saisir_etudiant();
                                            tour.ajouter_passager(p, numero);
                                            break;
                                        case 'p':
                                            p = new Passager();
                                            p.saisir_passager();
                                            tour.ajouter_passager(p, numero);
                                            break;
                                        case 'o':
                                            System.out.println("aurevoir");
                                            break;
                                        default:
                                            System.out.println("choix incorrecte");
                                    }
                                } while (choix2 != 'o');
                                break;
                            case 411:
                                System.out.println("donner le numero de voyage: ");
                                numero = LireClavier.nextInt();
                                do {
                                    System.out.println("bebe(b) ou etudiant(e) ou simple passager(p) ou sortir (o)");
                                    Passager p;
                                    switch (choix2 = LireClavier.next().charAt(0)) {
                                        case 'b':
                                            p = new Bebe();
                                            ((Bebe) p).bebe_aleatoire();
                                            tour.ajouter_passager(p, numero);
                                            break;
                                        case 'e':
                                            p = new Etudiant();
                                            ((Etudiant) p).etudiant_aleaoire();
                                            tour.ajouter_passager(p, numero);
                                            break;
                                        case 'p':
                                            p = new Passager();
                                            p.passager_aleatoire();
                                            tour.ajouter_passager(p, numero);
                                            break;
                                        case 'o':
                                            System.out.println("aurevoir");
                                            break;
                                        default:
                                            System.out.println("choix incorrecte");
                                    }
                                } while (choix2 != 'o');
                                break;
                            case 42:
                                System.out.println("donner le numero de vol puis le numero de ce passager: ");
                                tour.supprimer_passager(LireClavier.nextInt(), LireClavier.nextInt());
                                break;
                            case 421:
                                System.out.println("donner e numero de vol puis le numero de passeport");
                                tour.supprimer_passager(LireClavier.nextInt(), LireClavier.next());
                                break;
                            case 43:
                                System.out.println("donner le numero du vol: ");
                                numero = LireClavier.nextInt();
                                System.out.println("les passagers associes a cette vol sont: ");
                                tour.les_passagers(numero);
                                break;
                            case 44:
                                System.out.println("donner le numero du vol,puis le numero de passager");
                                tour.redefinir_passager(LireClavier.nextInt(), LireClavier.nextInt());
                                ;
                                break;
                            case 45:
                                System.out.println("donner le numero de cette voyage puis le numero de passager: ");
                                System.out.println("le billet est de: " + tour.billet_passager(LireClavier.nextInt(), LireClavier.nextInt()));
                                break;
                            case 46:
                                System.out.println("donner le numero de cette vol: ");
                                System.out.println("le nombre de passagers est: " + tour.compter_passager(LireClavier.nextInt()));
                                break;
                            case 47:
                                System.out.println("donner le numero du vol,le numero ancien puis le numero nouveau: ");
                                tour.permuter_passagers(LireClavier.nextInt(), LireClavier.nextInt(), LireClavier.nextInt());
                                break;
                            case 48:
                                System.out.println("donner le ran du vol puis le numero de passager: ");
                                tour.afficher_unpassager(LireClavier.nextInt(), LireClavier.nextInt());
                                break;
                            case 40:
                                System.out.println("aurevoir");
                                break;
                            default:
                                System.out.println("choix incorrecte");
                        }
                    } while (choix != 40);
                    break;
//consulter le chiffre d'affaire
                case 5:
                    do {
                        Menu.ChiffreAffaire();
                        switch (choix = LireClavier.nextInt()) {
                            case 51:
                                System.out.println("donner le numero de cette vol: ");
                                System.out.println("le chiffre d'affaire de cette vol est: " + tour.CA_vol(LireClavier.nextInt()) + "DT");
                                break;
                            case 52:
                                System.out.println("le chiffre d'affaire des vols est: " + tour.CA_lesVols() + "DT");
                                break;
                            case 53:
                                System.out.println("le profit est: " + tour.get_profit() + "DT");
                                break;
                            case 54:
                                System.out.println("les depenses sont: " + tour.get_charge() + "DT");
                                break;
                            case 55:
                                System.out.println("les impots sont de:" + tour.impots() + "DT");
                                break;
                            case 50:
                                System.out.println("aurevoir");
                                break;
                            default:
                                System.out.println("choix incorrecte");
                        }
                    } while (choix != 50);
                    break;
                case 198:
                    Menu.Aide();
                    LireClavier.next();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix incorrecte");
            }
        } while (choix != 0);
    }
}
