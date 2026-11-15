package uphf.astro.modele;

public class DRONE extends ENGIN implements Cartographe {

	public DRONE(int id,String nom,POSITION position) {
		super(id,nom,position);
	}	
	@ovveride
	public void deplacer(POSITION position) {
		this.position = position;
	}
	@ovveride
	public void cartographier(Zone zone) {
		zone.setCartographie(true);
	}
}
