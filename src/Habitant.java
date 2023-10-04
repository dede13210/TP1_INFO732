public abstract class Habitant {
    private String nnig;
    private String nom;
    private String prenom;
    private String adresse;

    public Habitant(String nnig, String nom, String prenom, String adresse) {
        this.nnig = nnig;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public void convoquer(String message){
        System.out.println(this.nom+" "+message);
    }

    @Override
    public String toString() {
        return "Habitant{" +
                "nnig='" + nnig + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public String getNnig() {
        return nnig;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
