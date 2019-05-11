package pl.sda.rav.vehicles;

import java.util.ArrayList;
import java.util.Collections;

// klasa do przechowywania i aktualizacji pojazdów
public class VehiclesDao {
    private ArrayList<Vehicles> vehiclesArrayList = new ArrayList<>();


    // met.: dodawanie pojazdu, nie powinna pozwalać na dodanie duplikatu
    public void addVehicle(Vehicles v) {
        // sprawdzenie, czy v to nie duplikat
        boolean dubel = false;
        for (Vehicles p:
             vehiclesArrayList) {
            if (p.equals(v)) dubel=true;
        } // for
        if (dubel==false) vehiclesArrayList.add(v);
    }

    public ArrayList<Vehicles> getVehiclesArrayList() {
        ArrayList<Vehicles> list = new ArrayList(vehiclesArrayList);
        Collections.sort(list);
        return list;
    }

}  // class VehiclesDao
