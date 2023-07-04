package fr.webforce.exemple_heritage;

public class Administration extends Personne {
    private String poste;

    public Administration(String nom, String prenom, Integer age, String poste) {
        super(nom, prenom, age);
        this.poste = poste;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
