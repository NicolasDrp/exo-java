package exoheritage;

public class Rectangle extends Quadrilatere  {
	
	
	public Rectangle(double cote1,double cote2) {
		super(cote1,cote2, cote1, cote2);
	}
	
	
	public double perimetre() {
		return cote1*2+cote2*2;
	}
	
}
