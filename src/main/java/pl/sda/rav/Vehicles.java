package pl.sda.rav;

import java.time.LocalDate;

// klasa pojazdy -> root
public class Vehicles {  // pojazdy
    private String vin;  // identyfikator
    private String name; // nazwa
    private LocalDate productionDate;  // data produkcji

    public Vehicles(String vin, String name, LocalDate productionDate) {
        this.vin = vin;
        this.name = name;
        this.productionDate = productionDate;
    }
}  // class Vehicles
