package uphf.astro.modele;

public abstract class ENGIN {
	private int id;
	private String nom;
	private POSITION position;
	private EtatEngin etat;
	
	public ENGIN(int id,String nom,POSITION position) {
		this.id = id;
		this.nom = nom;
		this.position = position;
		this.etat = EtatEngin.DISPONIBLE;
	}
	@override
	public void deplacer(POSITION nouvellePosition) {
		this.position = nouvellePosition;
	}
	public void mettreEnPanne(){
		this.etat = EtatEngin.EN_PANNE;
	}
	public void remettreEnService(){
		this.etat = EtatEngin.DISPONIBLE;
	}
}
