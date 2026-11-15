package uphf.astro.modele;

public class ROVER extends ENGIN implements  Preleveur {
	public ROVER(int id , String nom, POSITION position) {
		super(id, nom, position);
		
	}
	@ovveride
	public void deplacer(POSITION position) {
		this.position = position;
	}
	@ovveride
	public Echantillon prelevable(Zone zone) {
		return zone.getEchantillon();
	}
	
}
