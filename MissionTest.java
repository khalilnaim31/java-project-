package uphf.astro.modele;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MissionTest {

    private MISSION mission;
    private DIRECTEUR directeur;
    private CORPSCELESTE lune;
    private LocalDate date;

    @BeforeEach
    void setUp() {
        directeur = new DIRECTEUR(1, "Dupont", "Jean", "M", "0600000000");
        lune = new CORPSCELESTE("C2", "Lune", false);
        date = LocalDate.of(2026, 12, 25);
        mission = new MISSION(42, "Artemis", lune, date, 15000.0, directeur);
    }

    @Test
    void gettersRenvoientLesValeursDuConstructeur() {
        assertEquals(42, mission.getId());
        assertEquals("Artemis", mission.getNom());
        assertSame(lune, mission.getCorpsCeleste());
        assertEquals(date, mission.getDateLancement());
        assertEquals(15000.0, mission.getBudget(), 0.001);
        assertSame(directeur, mission.getDirecteur());
    }

    @Test
    void etatInitialEstPlanifiee() {
        assertEquals(EtatMission.PLANIFIEE, mission.getEtat());
    }

    @Test
    void pasReussieAuDepart() {
        assertFalse(mission.isReussie());
    }
}
