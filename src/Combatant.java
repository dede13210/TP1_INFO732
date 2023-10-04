public class Combatant extends Habitant{
    private String specialite;

    public Combatant(String nnig, String nom, String prenom, String adresse, String specialite) {
        super(nnig, nom, prenom, adresse);
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Combatant{" +
                "nnig='" + this.getNnig() + '\'' +
                ", nom='" + this.getNom() + '\'' +
                ", prenom='" + this.getPrenom() + '\'' +
                ", adresse='" + this.getAdresse() + '\'' +
                "specialite='" + specialite + '\'' +
                '}';
    }
}
