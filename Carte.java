import java.util.List;
import java.util.ArrayList;
public class carte{
    private int largeur ; 
    private int hauteur ;
    private List<Zone> zones;
    public carte(int largeur , int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.zones = new ArrayList<>();
    }
  
    public void ajouterZone(Zone zone) {
        zones.add(zone);
    }
    public Zone getZone(int index) {
        return zones.get(index);
    }
    public int getLargeur() {
        return largeur;
    }
    public int getHauteur() {
        return hauteur;
    }
}