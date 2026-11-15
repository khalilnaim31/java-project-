package uphf.astro.modele;

public  class CORPSCELESTE {
	private String nom;
	private boolean atmosphere;
	private carte Carte;
	public CORPSCELESTE(String id,String nom, boolean atmoshpere) {
		this.id = id;
		this.nom = nom;
		this.atmsophere = atmosphere;		
	}
	public String getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public boolean hasAtmosphere() {
		return atmosphere;
	}

}
