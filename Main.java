package uphf.astro.modele;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DIRECTEUR directeur = new DIRECTEUR(1, "Dupont", "Jean", "M", "0600000000");
        CORPSCELESTE mars = new CORPSCELESTE("C1", "Mars", true);

        List<MISSION> missions = new ArrayList<>();
        MISSION m1 = new MISSION(1, "Ares", mars, LocalDate.of(2026, 3, 1), 15000.0, directeur);
        MISSION m2 = new MISSION(2, "Olympus", mars, LocalDate.of(2027, 6, 15), 22000.0, directeur);
        directeur.ajouterMission(m1);
        directeur.ajouterMission(m2);
        missions.add(m1);
        missions.add(m2);

        Carte carte = new Carte(100, 50);
        Zone zone = new Zone(new POSITION(2, 3), TypeTerrain.CRATERE, 8);
        carte.ajouterZone(zone);

        DRONE drone = new DRONE(7, "Ingenuity", new POSITION(0, 0));
        drone.cartographier(zone);

        Jsonb jsonb = JsonbBuilder.create();
        System.out.println(jsonb.toJson(directeur));
        System.out.println(jsonb.toJson(m1));
        System.out.println(jsonb.toJson(missions));
        System.out.println(jsonb.toJson(carte));
        System.out.println(jsonb.toJson(zone));
        System.out.println("Missions réussies : " + directeur.calculerNombreMissionReussies());
        System.out.println("Budget missions réussies : " + directeur.calculerBudgetTotalMissionsReussites());
    }
}