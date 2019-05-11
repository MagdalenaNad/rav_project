package pl.sda.rav;

import java.util.ArrayList;
import java.util.Comparator;

// klasa do przechowywania i aktualizacji pojazdów
public class VehiclesDao implements Comparable<Vehicles>{
    private ArrayList<Vehicles> vehiclesArrayList;

    // konstruktor
    public VehiclesDao(ArrayList<Vehicles> vehiclesArrayList) {
        this.vehiclesArrayList = vehiclesArrayList;
    }// konstruktor

    public void addVehicle(Vehicles v) {
        vehiclesArrayList.add(v);
    }

    @Override
    public int compareTo(Vehicles v) {
return -1;
    //    return (v.getProductionDate().getYear());
    }

/*
    public ArrayList<Vehicles> getVehiclesArrayList() {
        return vehiclesArrayList.sort();
    }

    Comparator<Person> comparator = Comparator.comparing(Person::getName) .thenComparing(Person::getAge);
     */
}  // class VehiclesDao
