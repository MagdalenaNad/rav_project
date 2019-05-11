package pl.sda.rav.vehicles;

import java.util.ArrayList;
import java.util.Collections;

// klasa do przechowywania i aktualizacji pojazdów
public class VehiclesDao {
    private ArrayList<Vehicles> vehiclesArrayList = new ArrayList<>();


    public void addVehicle(Vehicles v) {
        vehiclesArrayList.add(v);
    }

    public ArrayList<Vehicles> getVehiclesArrayList() {
        ArrayList<Vehicles> list = new ArrayList(vehiclesArrayList);
        Collections.sort(list);
        return list;
    }

}  // class VehiclesDao
