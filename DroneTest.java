package uphf.astro.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DroneTest {

    private DRONE drone;

    @BeforeEach
    void setUp() {
        drone = new DRONE(7, "Ingenuity", new POSITION(0, 0));
    }

    @Test
    void cartographierMarqueLaZone() {
        Zone zone = new Zone(new POSITION(2, 3), TypeTerrain.FALAISE, 7);
        assertFalse(zone.isCartographie());

        drone.cartographier(zone);

        assertTrue(zone.isCartographie());
    }

    @Test
    void droneEstUnCartographe() {
        assertTrue(drone instanceof Cartographe);
    }

    @Test
    void droneEstUnEngin() {
        assertTrue(drone instanceof ENGIN);
    }
}