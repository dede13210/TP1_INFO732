public class AncienCombatant extends Habitant{
    public AncienCombatant(String nnig, String nom, String prenom, String adresse) {
        super(nnig, nom, prenom, adresse);
    }
    @Override
    public String toString() {
        return "AncienCombatant{" +
                "nnig='" + this.getNnig() + '\'' +
                ", nom='" + this.getNom() + '\'' +
                ", prenom='" + this.getPrenom() + '\'' +
                ", adresse='" + this.getAdresse() + '\'' +
                '}';
    }
}
