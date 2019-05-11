package pl.sda.rav.vehicles;

public class Amphibians extends Vehicles {
    private double displacementTon;  // wyporność w tonach
    private int maxDistanceKm;       // zasięg w kilometrach
    private int maxDistanceMiles;    // zasięg w milach morskich

    // konstruktor
    public Amphibians(String vin, String name, int productionDate, double displacementTon, int maxDistanceKm, int maxDistanceMiles) {
        super(vin, name, productionDate);
        this.displacementTon = displacementTon;
        this.maxDistanceKm = maxDistanceKm;
        this.maxDistanceMiles = maxDistanceMiles;
    }  // konstruktor

    public double getDisplacementTon() {
        return displacementTon;
    }

    public void setDisplacementTon(double displacementTon) {
        this.displacementTon = displacementTon;
    }

    public int getMaxDistanceKm() {
        return maxDistanceKm;
    }

    public void setMaxDistanceKm(int maxDistanceKm) {
        this.maxDistanceKm = maxDistanceKm;
    }

    public int getMaxDistanceMiles() {
        return maxDistanceMiles;
    }

    public void setMaxDistanceMiles(int maxDistanceMiles) {
        this.maxDistanceMiles = maxDistanceMiles;
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                super.toString()+
                "displacementTon=" + displacementTon +
                ", maxDistanceKm=" + maxDistanceKm +
                ", maxDistanceMiles=" + maxDistanceMiles +
                '}';
    }
} // class Amphibians extends Vehicles
