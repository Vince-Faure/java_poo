package fr.webforce.exo_ordinateur;

public class Driver {
    public static void main(String[] args) {
        Ordinateur ordi = new Ordinateur(
                "Apple",
                "Mac Studio",
                "2022",
                TypeOrdinateur.DESKTOP,
                null,
                "1 To",
                "64 Go",
                "Apple silicon"
        );
        ordi.afficherDetails();
        ordi.executerProgramme("Chrome");
    }

    // 1 octet == 1 Byte == 8 bits => 256 possibilités => 0 à 255 == 2^8
}
