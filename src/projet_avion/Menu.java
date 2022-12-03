package projet_avion;
public class Menu {

    public static void Principale() {
        System.out.println("                     _________*Le menu*_________");
        System.out.println("        (1).gestion du personnel. ***  (2).gestion   des   vols.");
        System.out.println("        (3).gestion des machines. ***  (4).gestion des passages.");
        System.out.println("                (5).consulter le chiffres d'affaires.       ");
        System.out.println("                      0.quitter le programme.");
        System.out.println("                      198.appuyer sur '198' pour l'aide.");
        System.out.println("            *******veuillez saisir votre choix*******    ");
        System.out.println("________________________________________________________________________________");
    }

    public static void Personnel() {
        System.out.println("________________________________________________________________________________");
        System.out.println("                 [Le menu:gestion du personnel(1)]");
        System.out.println("11.gestion des pilotes");
        System.out.println("12.gestion des simples employeurs");
        System.out.println("13.calculer les salaires");
        System.out.println("14.compter le nombre des employeurs");
        System.out.println("15.la taille maximale des employeurs");
        System.out.println("10.quitter");
        System.out.println("****veuillez saisir votre choix****");
        System.out.println("________________________________________________________________________________");
    }

    public static void Pilote() {
        System.out.println("________________________________________________________________________________");
        System.out.println("			[le menu:pilote]");
        System.out.println("111.ajouter un pilotes");
        System.out.println("1111.ajouter aleatoirement un pilote");
        System.out.println("112.licencier un pilote");
        System.out.println("1121.licencier a l'aide de numero de matricule");
        System.out.println("113.afficher des information a propos un pilote");
        System.out.println("114.afficher les pilotes");
        System.out.println("115.redefinir un pilote");
        System.out.println("116.disponibilite des pilotes");
        System.out.println("117.compter les pilotes");
        System.out.println("118.delai de travail de pilote");
        System.out.println("110.quitter");
        System.out.println("****veuillez saisir votre choix****");
        System.out.println("________________________________________________________________________________");
    }

    public static void Employeur() {
        System.out.println("________________________________________________________________________________");
        System.out.println("			[le menu:employeur]");
        System.out.println("121.ajouter un employeur");
        System.out.println("1211.ajouter aleatoirement un employeur");
        System.out.println("122.licencier un employeur");
        System.out.println("1221.licencier a l'aide de numero de matricule");
        System.out.println("123.afficher des information a propos un employeur");
        System.out.println("124.afficher les employeurs");
        System.out.println("125.redefinir un employeur");
        System.out.println("126.disponibilite des employeur");
        System.out.println("127.compter les employeur");
        System.out.println("128.delai de travail d'un employeur");
        System.out.println("120.quitter");
        System.out.println("****veuillez saisir votre choix****");
        System.out.println("________________________________________________________________________________");
    }

    public static void Vol() {
        System.out.println("________________________________________________________________________________");
        System.out.println("     [Le menu:gestion des vols (2)]");
        System.out.println("21.declarer et initialiser des voyages");
        System.out.println("211.declarer et initialiser aleatoirement une voyage");
        System.out.println("22.supprimer une voyage");
        System.out.println("23.afficher les voyages");
        System.out.println("24.disponibilites des places");
        System.out.println("25.afficher une voyage");
        System.out.println("26.permuter 2 voyages");
        System.out.println("27.redefinir une voyage");
        System.out.println("28.compter les voyages ");
        System.out.println("281.compter le nombre maximale des voyages");
        System.out.println("29.compter les places disponibles");
        System.out.println("20.quitter");
        System.out.println("*******veuillez saisir votre choix*******    ");
        System.out.println("________________________________________________________________________________");
    }

    public static void Machine() {
        System.out.println("________________________________________________________________________________");
        System.out.println("                [Le menu:gestion des machines(3)]");
        System.out.println("31.gestion des avions");
        System.out.println("32.autre machines");
        System.out.println("33.consommation des machine");
        System.out.println("34.compter le nombre maximales des machines");
        System.out.println("30.quitter");
        System.out.println("*******veuillez saisir votre choix*******    ");
        System.out.println("________________________________________________________________________________");
    }

    public static void Avion() {
        System.out.println("________________________________________________________________________________");
        System.out.println("        [Le menu:gestion des avions]");
        System.out.println("311.ajouter un avion ");
        System.out.println("3111.ajouter aleatoirement un avion");
        System.out.println("312.supprimer un avion");
        System.out.println("3121.supprimer un avion a l'aide de son modele");
        System.out.println("313.afficher les avions");
        System.out.println("314.afficher un avion");
        System.out.println("315.redefinir un avion");
        System.out.println("316.compter les avion");
        System.out.println("310.quitter");
        System.out.println("*******veuillez saisir votre choix*******    ");
        System.out.println("________________________________________________________________________________");
    }

    public static void AutreMachine() {
        System.out.println("________________________________________________________________________________");
        System.out.println("        [Le menu:autre machine]");
        System.out.println("321.ajouter une machine ");
        System.out.println("3211.ajouter aleatoirement une machine");
        System.out.println("322.supprimer une machine");
        System.out.println("3221.supprimer une machine a l'aide de son modele");
        System.out.println("323.afficher les machines");
        System.out.println("324.afficher une machine");
        System.out.println("325.redefinir une machines");
        System.out.println("326.compter les machine");
        System.out.println("320.quitter");
        System.out.println("            *******veuillez saisir votre choix*******    ");
        System.out.println("________________________________________________________________________________");
    }

    public static void Passager() {
        System.out.println("________________________________________________________________________________");
        System.out.println("                [Le menu:gestion des passagers(4)]");
        System.out.println("41.ajouter un passager");
        System.out.println("411.ajouter aleatoirement un passager");
        System.out.println("42.rejeter un passager par numero");
        System.out.println("421.rejeter un passager a l'aide de numero de passeport");
        System.out.println("43.afficher les passagers");
        System.out.println("44.redefinir un passager");
        System.out.println("45.calculer la tarif de billet d'une passager");
        System.out.println("46.compter le nombre de passagers");
        System.out.println("47.permuter deux passagers");
        System.out.println("48.afficher un passager");
        System.out.println("40.quitter");
        System.out.println("****veuillez saisir votre choix****");
        System.out.println("________________________________________________________________________________");
    }

    public static void ChiffreAffaire() {
        System.out.println("________________________________________________________________________________");
        System.out.println("                [Le menu:gestion des chiffres d'affaires(5)]");
        System.out.println("51.calculer le chiffre d'affaire d'une vol");
        System.out.println("52.calculer le chiffre d'affaire des tours");
        System.out.println("53.calculer le profit");
        System.out.println("54.calculer les depenses");
        System.out.println("55.calculer les impots");
        System.out.println("50.quitter");
        System.out.println("            *******veuillez saisir votre choix*******    ");
        System.out.println("________________________________________________________________________________");
    }

    public static void Aide() {
        System.out.println("#pour   ajouter,   supprimer   ou  afficher  des  information  a  propos");
        System.out.println("le    personnel   vous    devez    appuyer  sur    '1'.");
        System.out.println("#pour ajouter, annuler  ou afficher  des information  a  propos");
        System.out.println("les  voyage  disponible vous   devez   appuyer sur '2'.");
        System.out.println("#pour ajouter, supprimer ou afficher  des informations a propos");
        System.out.println("les machines de la societe vous devez appyuer  sur '3'.");
        System.out.println("#pour ajouter, supprimer ou  afficher  des information a propos");
        System.out.println("les  passagers d'une voyage vous devez appyuer sur '4'");
        System.out.println("#pour consulter le chiffre d'affaire, calculer le profit ou  les depenses");
        System.out.println("#vous       devez       appyuer      sur           '5' ");
        System.out.println("appyuer sur une touche pour continuer...");
    }
}