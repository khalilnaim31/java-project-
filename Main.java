package fr.univ;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Personne> personnes = new ArrayList<>();
        Personne pers = new Personne();
        pers.setid(12);
        pers.setnom("paul");
        pers.settaille(3.5f);
        Personne p2 = new Personne();
        p2.setid(2);
        p2.setnom("Marie");
       p2.settaille(3.2f);
       personnes.add(pers);
       personnes.add(p2);
       Jsonb jsonb = JsonbBuilder.create();
       String json = jsonb.toJson(pers);
       System.out.println(json);
       Personne pers2 = jsonb.fromJson(json , Personne.class);
       System.out.println(pers2.getid());
        System.out.println(pers2.getnom());
        System.out.println(pers2.gettaille());
        String jsonliste = jsonb.toJson(personnes);
        System.out.println(jsonliste);


    }
}