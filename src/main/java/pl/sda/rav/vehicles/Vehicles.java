package pl.sda.rav.vehicles;

import java.lang.*;
// klasa pojazdy -> root
public abstract class Vehicles implements Comparable<Vehicles>{  // pojazdy
    private String vin;  // identyfikator
    private String name; // nazwa
    private int productionDate;  // data (rok) produkcji

    public Vehicles(String vin, String name, int productionDate) {
        this.vin = vin;
        this.name = name;
        this.productionDate = productionDate;
    }

    @Override
    public int compareTo(Vehicles o) {
        if ((productionDate-o.productionDate) !=0){
            return ((productionDate-o.productionDate));
        }
        return name.compareTo(o.name);
    } // compareTo()

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
