package pl.sda.rav;

import java.time.LocalDate;

// klasa samochody
public class Cars extends Vehicles{
    private String bodyType; // typ nadwozia
    private int maxDistanceKm;  // zasięg w kilometrach

    public Cars(String vin, String name, LocalDate productionDate, String bodyType, int maxDistanceKm) {
        super(vin, name, productionDate);  // pola klasy nadrzędnej
        this.bodyType = bodyType;
        this.maxDistanceKm = maxDistanceKm;
    }

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
}  // class Cars extends Vehicles
