public class NonCombatant extends Habitant{

    public NonCombatant(String nnig, String nom, String prenom, String adresse) {
        super(nnig, nom, prenom, adresse);
    }

    @Override
    public String toString() {
        return "NonCombatant{" +
                "nnig='" + this.getNnig() + '\'' +
                ", nom='" + this.getNom() + '\'' +
                ", prenom='" + this.getPrenom() + '\'' +
                ", adresse='" + this.getAdresse() + '\'' +
                '}';
    }
}
