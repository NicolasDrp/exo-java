package exoheritage;

public class Etudiant {

	private String nom = "Kevin"; 
	private String prenom = "Dunor";
	private String classe = "2nd M";
	private double notes[] = {12,13.5,4,20,19,11,16,1};
	
	
	public double moyenne() {
		
		double moyenne = 0;
		
		for(int i=0 ; i<notes.length;i++) {
			moyenne = moyenne + notes[i];
		}
		moyenne = moyenne / notes.length;
		return moyenne;
	}
	
	
	
	/**
	 * @return the nom
	 */
	public final String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public final void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public final String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public final void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the classe
	 */
	public final String getClasse() {
		return classe;
	}
	/**
	 * @param classe the classe to set
	 */
	public final void setClasse(String classe) {
		this.classe = classe;
	}
	/**
	 * @return the notes
	 */
	public final double[] getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public final void setNotes(double[] notes) {
		this.notes = notes;
	}
	

	
	
	
	
}
