package ma.education.tp1.introduction;

public class Test {

	public static void main(String[] args) {
		
		Salle o1 = new Salle();
		Salle o2 = new Salle("Salle d'informatique");
		Salle o3 = new Salle(2,"Salle des cours");
		
		System.out.println(o1);
		System.out.println("le nom est :"+" "+ o2.nom);
		System.out.println("l'id et le nom sont :"+""+ o3.id+" "+","+" "+ o3.nom );
	
						
	}
	
	

}
