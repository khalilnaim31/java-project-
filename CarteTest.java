package uphf.astro.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarteTest {

    private Carte carte;

    @BeforeEach
    void setUp() {
        carte = new Carte(100, 50);
    }

    @Test
    void largeurEtHauteurCorrectes() {
        assertEquals(100, carte.getLargeur());
        assertEquals(50, carte.getHauteur());
    }

    @Test
    void ajouterZonePuisLaRecuperer() {
        Zone zone = new Zone(new POSITION(1, 2), TypeTerrain.PLAINE, 5);
        carte.ajouterZone(zone);

        assertSame(zone, carte.getZone(0));
    }

    @Test
    void lesZonesGardentLeurOrdre() {
        Zone z1 = new Zone(new POSITION(0, 0), TypeTerrain.PLAINE, 1);
        Zone z2 = new Zone(new POSITION(3, 4), TypeTerrain.CRATERE, 8);
        carte.ajouterZone(z1);
        carte.ajouterZone(z2);

        assertSame(z1, carte.getZone(0));
        assertSame(z2, carte.getZone(1));
    }

    @Test
    void getZoneSurCarteVideLanceException() {
        assertThrows(IndexOutOfBoundsException.class, () -> carte.getZone(0));
    }
}