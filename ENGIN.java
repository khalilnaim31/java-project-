package uphf.astro.modele;

public abstract class ENGIN {
	private String id;
	private String nom;
	private POSITION position;
	private String etat;
	public ENGIN() {
		return;
	}
	public ENGIN(String id,String nom,POSITION position) {
		this.id = id;
		this.nom = nom;
		this.position = position;
		this.etat = "DISPONIBLE";
	}
	public String getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public POSITION getPosition() {
		return position;
	}
	public void setPosition(POSITION position) {
		this.position = position;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
}
