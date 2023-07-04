package fr.webforce.exo_ordinateur;

public class Ordinateur {
    private String marque;
    private String modele;
    private String annee;
    private TypeOrdinateur typeOrdinateur;
    private String tailleEcran;
    private String capStockage;
    private String ram;
    private String processseur;

    public Ordinateur(String marque, String modele, String annee, TypeOrdinateur typeOrdinateur, String tailleEcran, String capStockage, String ram, String processseur) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.typeOrdinateur = typeOrdinateur;
        this.tailleEcran = tailleEcran;
        this.capStockage = capStockage;
        this.ram = ram;
        this.processseur = processseur;
    }

    public void afficherDetails() {
        String str = "Ordinateur{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", annee='" + annee + '\'' +
                ", typeOrdinateur=" + typeOrdinateur +
                ", tailleEcran='" + tailleEcran + '\'' +
                ", capStockage='" + capStockage + '\'' +
                ", ram='" + ram + '\'' +
                ", processseur='" + processseur + '\'' +
                '}';
        System.out.println(str);
    }

    public void executerProgramme(String programme) {
        System.out.printf("%s est en train de s'ouvrir!\n", programme);
    }

}
