package ma.education.tp.abstractkeyword;

public abstract class FormeGeometrique {

	double surface;
	
public abstract double calculerSurface();
public void afficherSurface() {
	System.out.println(this.surface);
}
}
