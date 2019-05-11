package pl.sda.rav;

import java.util.ArrayList;
import java.util.Comparator;

// klasa do przechowywania i aktualizacji pojazdów
public class VehiclesDao implements Comparator<Vehicles>{
    private ArrayList<Vehicles> vehiclesArrayList;

    public VehiclesDao(ArrayList<Vehicles> vehiclesArrayList) {
        this.vehiclesArrayList = vehiclesArrayList;
    }

    public void addVehicle(Vehicles vehicle) {
        vehiclesArrayList.add(vehicle);
    }

    @Override
    public int compare(Vehicles o1, Vehicles o2) {
        return (o1.-o2);
    }

/*
    public ArrayList<Vehicles> getVehiclesArrayList() {
        return vehiclesArrayList.sort();
    }

    Comparator<Person> comparator = Comparator.comparing(Person::getName) .thenComparing(Person::getAge);
     */
}  // class VehiclesDao
