package fr.webforce.exemple_heritage;

public class Professeur extends Personne{
    private String matiere;

    public Professeur(String nom, String prenom, Integer age, String matiere) {
        super(nom, prenom, age);
        this.matiere = matiere;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
}
