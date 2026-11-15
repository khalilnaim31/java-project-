public class Echantillon  {
    private double masse;
    private TypeEchantillon typeechantilon;
    private Zone position;
    public Echantillon() {
        return;
    }
    public Echantillon(double masse,TypeEchantillon typeechantilon,Zone position) {
        this.masse = masse;
        this.typeechantilon = typeechantilon;
        this.position = position;
    }
    public double getMasse() {
        return masse;
    }
    public TypeEchantillon getTypeechantilon() {
        return typeechantilon;
    }
    public Zone getPosition() {
        return position;
    }
}