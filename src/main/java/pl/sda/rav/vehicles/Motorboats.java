package pl.sda.rav.vehicles;

// klasa łodzie motorowe
public class Motorboats extends Vehicles {
    private double displacementTon; // wyporność w tonach
    private int maxDistanceMiles;     // max zasięg w milach morskich

    // konstruktor
    public Motorboats(String vin, String name, int productionDate, double displacementTon, int maxDistanceMiles) {
        super(vin, name, productionDate);
        this.displacementTon = displacementTon;
        this.maxDistanceMiles = maxDistanceMiles;
    } // konstruktor

    public double getDisplacementTon() {
        return displacementTon;
    }

    public void setDisplacementTon(double displacementTon) {
        this.displacementTon = displacementTon;
    }

    public int getMaxDistanceMiles() {
        return maxDistanceMiles;
    }

    public void setMaxDistanceMiles(int maxDistanceMiles) {
        this.maxDistanceMiles = maxDistanceMiles;
    }

    @Override
    public String toString() {
        return "Motorboats{" +
                super.toString()+
                "displacementTon=" + displacementTon +
                ", maxDistanceMiles=" + maxDistanceMiles +
                '}';
    }
} //class Motorboats extends Vehicles
