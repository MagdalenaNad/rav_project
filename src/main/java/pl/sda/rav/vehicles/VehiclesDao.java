package pl.sda.rav.vehicles;

import java.util.ArrayList;

// klasa do przechowywania i aktualizacji pojazdów
public class VehiclesDao {
    private ArrayList<Vehicles> vehiclesArrayList;

    // konstruktor
    public VehiclesDao(ArrayList<Vehicles> vehiclesArrayList) {
        this.vehiclesArrayList = vehiclesArrayList;
    }// konstruktor

    public void addVehicle(Vehicles v) {
        vehiclesArrayList.add(v);
    }



/*
    public ArrayList<Vehicles> getVehiclesArrayList() {
        return vehiclesArrayList.sort();
    }

    Comparator<Person> comparator = Comparator.comparing(Person::getName) .thenComparing(Person::getAge);
     */
}  // class VehiclesDao