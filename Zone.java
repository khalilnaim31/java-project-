import java.util.Set;
import java.util.HashSet;

public class Zone {
    private POSITION position;
    private boolean cartographie;
    private TypeTerrain typeTerrain;
    private int interetScientifique;
     private Set<Class<? extends Engin>> explorePar;
    public Zone(POSITION position, TypeTerrain typeTerrain, int interetScientifique) {
        this.position = position;
        this.typeTerrain = typeTerrain;
        this.interetScientifique = interetScientifique;
        this.cartographie = false;
        this.explorePar = new HashSet<>();
        this.typeVehicule = new HashSet<>();
    }
    void marquerExploration (   Class<? extends Engin> enginClass) {
        explorePar.add(enginClass);
    }
    void settypeVehicule(boolean typeVehicule) {
        this.typeVehicule = typeVehicule;
    }
    public POSITION getPosition() {
        return position;
    }
    public boolean isCartographie() {
        return cartographie;
    }
    public TypeTerrain getTypeTerrain() {
        return typeTerrain;
    }
    public int getInteretScientifique() {
        return interetScientifique;
    }
}