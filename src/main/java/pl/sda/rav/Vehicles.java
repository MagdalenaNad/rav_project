package pl.sda.rav;

import java.time.LocalDate;

// klasa pojazdy -> root
public abstract class Vehicles {  // pojazdy
    private String vin;  // identyfikator
    private String name; // nazwa
    private LocalDate productionDate;  // data produkcji

    public Vehicles(String vin, String name, LocalDate productionDate) {
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

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }


}  // class Vehicles
