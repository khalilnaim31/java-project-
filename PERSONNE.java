package uphf.astro.modele;

public abstract class PERSONNE {
	private int id;
	private String nom;
	private String prenom;
	private String genre;
	private String telephone;
	public PERSONNE(int id , String nom, String prenom, String genre, String telephone) {
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.genre=genre;
		this.telephone=telephone;
	}
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getGenre() {
		return genre;
	}
	public String getTelephone() {
		return telephone;
	}
	void setId(int id) {
		this.id=id;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	public void setGenre(String genre) {
		this.genre=genre;
	}
	public void setTelephone(String telephone) {
		this.telephone=telephone;
	}
	
}


