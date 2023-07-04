package fr.webforce.exemple_heritage;

public class Eleve extends Personne {
    private String cours;

    public Eleve(String nom, String prenom, Integer age, String cours) {
        super(nom, prenom, age);
        this.cours = cours;
    }
    
    

    @Override
	public void affichage() {
		String str = String.format(
				"Je suis un Eleve qui se nomme : %s %s.", 
				this.getPrenom(), this.getNom().toUpperCase()
				);
		System.out.println(str);
	}



	public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }
}
