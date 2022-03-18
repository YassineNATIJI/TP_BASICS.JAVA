package ma.education.tp2.statickeyword;

public class Etudiant {
	public long id;
	public String nom;
	public static int nbEtudiants;
	
// 3.1 - oui
// 3.2 - oui
// 3.3 - non 
	
	public Etudiant (long id, String nom,int nb) {
		this.id = id;
		this.nom = nom;
		nbEtudiants+=nb;
		}

	
	
	
}
