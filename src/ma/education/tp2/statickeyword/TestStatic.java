package ma.education.tp2.statickeyword;

public class TestStatic {

	public static void main(String[] args) {
		Etudiant e1= new Etudiant(1, "AHMED", 20);
		Etudiant e2= new Etudiant(2, "SAID", 30);
		System.out.println(e1.id +" "+e1.nom+" "+Etudiant.nbEtudiants);
		System.out.println(e2.id +" "+e2.nom+" "+Etudiant.nbEtudiants);
// 9 - il a laiss� la valeur prec�dente et il a addition� la prochaine valeur car � cause d'incrementation qu'on a fait , et static plus ou moins garde la derni�re valeur mais dans nos cas il a les combin� mais en fin de compte c'est la derniere valeur  
	}
	
	

}
