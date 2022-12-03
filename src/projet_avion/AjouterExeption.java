package projet_avion;
import java.util.*;
public class AjouterException extends Exception {

    public AjouterException() {
    }

    public String toString() {
        return ("vous ne pouver pas ajouter un element puisque le tableau est sature!!");
    }
}