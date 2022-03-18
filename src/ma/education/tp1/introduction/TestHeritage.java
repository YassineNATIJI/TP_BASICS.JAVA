package ma.education.tp1.introduction;

public class TestHeritage {
	
	Salle s1=new SalleCours(1, "Salle 1", 20);
	SalleCours s2= new SalleCours(2, "Salle 2", 20);
	SalleCours s3= (SalleCours)s1;
	//dans la ligne si dessus , nous ne pouvons pas instancier de la C.fille vers la C.mere donc on doit utiliser le Cast
	SalleCours s4=s2;
	
	Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
	SalleCours s6= new SalleCours(2, "Salle 2", 20);
	// dans la ligne si dessous, nous avons 2 C.filles et il ya aucune relation entre eux
	//SalleCours s7=s5;
	SalleCours s8=s6;

}
