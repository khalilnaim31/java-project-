package uphf.astro.modele;

import java.util.Random;
public interface Preleveur{
    Echantillon preleverEchantillon(Zone zone, Random random);
}