package pl.sda.rav.vehicles;

// klasa samochody
public class Cars extends Vehicles{
    private String bodyType; // typ nadwozia
    private int maxDistanceKm;  // zasięg w kilometrach

    // konstruktor
    public Cars(String vin, String name, int productionDate, String bodyType, int maxDistanceKm) {
        super(vin, name, productionDate);  // pola klasy nadrzędnej
        this.bodyType = bodyType;
        this.maxDistanceKm = maxDistanceKm;
    }  // konstruktor

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getMaxDistanceKm() {
        return maxDistanceKm;
    }

    public void setMaxDistanceKm(int maxDistanceKm) {
        this.maxDistanceKm = maxDistanceKm;
    }

    @Override
    public String toString() {
        return "Cars{" +
                super.toString()+
                "bodyType='" + bodyType + '\'' +
                ", maxDistanceKm=" + maxDistanceKm +
                '}';
    }
}  // class Cars extends Vehicles
