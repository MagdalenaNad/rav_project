package pl.sda.rav;

import java.time.LocalDate;

// klasa pojazdy -> root
public abstract class Vehicles{  // pojazdy
    private String vin;  // identyfikator
    private String name; // nazwa
    private int productionDate;  // data (rok) produkcji

    public Vehicles(String vin, String name, int productionDate) {
        this.vin = vin;
        this.name = name;
        this.productionDate = productionDate;
    }



    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "vin='" + vin + '\'' +
                ", name='" + name + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }
}  // class Vehicles
