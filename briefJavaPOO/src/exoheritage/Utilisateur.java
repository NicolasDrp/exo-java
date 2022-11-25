package exoheritage;

public class Utilisateur {

	private String nom;
	private String prenom;
	private String date;
	private String email;
	private String login;
	private String motdepasse;
	
	
	public Utilisateur(String nom,String prenom,String date,String email,String login,String motdepasse) {
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.email = email;
		this.login = login;
		this.motdepasse = motdepasse;
	}

	
	public String connection (String log,String mdp) {
		
		if(this.login.equals(log) && this.motdepasse.equals(mdp)) {
			return "connection établie";
		}
		else {
			return "mot de passe ou nom d'utilisateur incorrect";
		}
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
	 * @return the date
	 */
	public final String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public final void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public final void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the login
	 */
	public final String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public final void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the motdepasse
	 */
	public final String getMotdepasse() {
		return motdepasse;
	}

	/**
	 * @param motdepasse the motdepasse to set
	 */
	public final void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
}
	
	
	
