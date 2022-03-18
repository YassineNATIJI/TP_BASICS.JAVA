package horspackage;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle {

	public static void main(String[] args) {
		Salle s2 = new Salle(2,"Salle B");
		System.out.println(s2.id+" , "+s2.nom);
	}
	public void afficher(Salle s) {
			System.out.println(s.id );
			System.out.println(s.nom );
			System.out.println(id );
			System.out.println(nom );

		

	}

}
