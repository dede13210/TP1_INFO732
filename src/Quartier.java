import java.util.ArrayList;

public class Quartier {
    private String nom;
    private ArrayList<String> drapeau;
    private ArrayList<Habitant> listHabitant;

    public Quartier(String nom, ArrayList<String> drapeau, ArrayList<Habitant> listHabitant) {
        this.nom = nom;
        this.drapeau = drapeau;
        this.listHabitant = listHabitant;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<String> getDrapeau() {
        return drapeau;
    }
    public void afficherHabitants(){
        for(Habitant h : listHabitant){
            System.out.println(h.toString());
        }
    }

    public ArrayList<Habitant> getListHabitant() {
        return listHabitant;
    }
    public Habitant trouverHabitant(String nnigHabitant){
        for(Habitant h : listHabitant){
            if(h.getNnig().equals(nnigHabitant)){
                return  h;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Quartier{" +
                "nom='" + nom + '\'' +
                ", drapeau=" + drapeau +
                ", nombre d'habitant=" + listHabitant.size() +
                '}';
    }
}
