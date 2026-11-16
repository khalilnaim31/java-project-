package uphf.astro.modele;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DirecteurTest {

    private DIRECTEUR directeur;

    @BeforeEach
    void setUp() {
        directeur = new DIRECTEUR(1, "Dupont", "Jean", "M", "0600000000");
    }

    @Test
    void ajouterMissionNullLanceException() {
        assertThrows(IllegalArgumentException.class, () -> directeur.ajouterMission(null));
    }

    @Test
    void sansMissionAucuneReussie() {
        assertEquals(0, directeur.calculerNombreMissionReussies());
    }

    @Test
    void sansMissionBudgetNul() {
        assertEquals(0.0, directeur.calculerBudgetTotalMissionsReussites(), 0.001);
    }

    @Test
    void missionPlanifieeNeComptePas() {
        CORPSCELESTE mars = new CORPSCELESTE("C1", "Mars", true);
        MISSION mission = new MISSION(1, "Mission 1", mars, LocalDate.of(2026, 1, 1), 1000.0, directeur);
        directeur.ajouterMission(mission);

        assertEquals(0, directeur.calculerNombreMissionReussies());
        assertEquals(0.0, directeur.calculerBudgetTotalMissionsReussites(), 0.001);
    }
}