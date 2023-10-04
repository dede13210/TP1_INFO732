import java.util.ArrayList;
import java.util.Objects;

public class Village {
    private String nom;
    private ArrayList<Quartier> listQuartier;

    public Village(String nom, ArrayList<Quartier> listQuartier) {
        this.nom = nom;
        this.listQuartier = listQuartier;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Village{" +
                "nom='" + nom + '\'' +
                ", listQuartier=" + listQuartier +
                '}';
    }

    public ArrayList<Quartier> getListQuartier() {
        return listQuartier;
    }
    public void afficherHabitants(String nom){
        for(Habitant h : trouverQuartier(nom).getListHabitant()){
            System.out.println(h.toString());
        }
    }
    public Quartier trouverQuartier(String nomQuartier){
        for(Quartier q:listQuartier){
            if (Objects.equals(q.getNom(), nomQuartier)){
                return q;
            }
        }
        return null;
    }
    public void convoquer(String quartier, String nnigHabitant, String message){
        trouverQuartier(quartier).trouverHabitant(nnigHabitant).convoquer(message);
    }
}
