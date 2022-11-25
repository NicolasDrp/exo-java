package exoheritage;

public class Quadrilatere implements FormeGeometrique {

	protected double cote1;
	protected double cote2;
	protected double cote3;
	protected double cote4;
	
	
	public Quadrilatere(double cote1,double cote2,double cote3,double cote4){
		this.cote1 = cote1;
		this.cote2 = cote2;
		this.cote3 = cote3;
		this.cote4 = cote4;
	}
	
	
	public double perimetre() {
		return this.cote1+this.cote2+this.cote3+this.cote4;
	}
	
	
	
	
	
	/**
	 * @return the cote1
	 */
	public final double getCote1() {
		return cote1;
	}
	/**
	 * @param cote1 the cote1 to set
	 */
	public final void setCote1(double cote1) {
		this.cote1 = cote1;
	}
	/**
	 * @return the cote2
	 */
	public final double getCote2() {
		return cote2;
	}
	/**
	 * @param cote2 the cote2 to set
	 */
	public final void setCote2(double cote2) {
		this.cote2 = cote2;
	}
	/**
	 * @return the cote3
	 */
	public final double getCote3() {
		return cote3;
	}
	/**
	 * @param cote3 the cote3 to set
	 */
	public final void setCote3(double cote3) {
		this.cote3 = cote3;
	}
	/**
	 * @return the cote4
	 */
	public final double getCote4() {
		return cote4;
	}
	/**
	 * @param cote4 the cote4 to set
	 */
	public final void setCote4(double cote4) {
		this.cote4 = cote4;
	}
	
	
}
