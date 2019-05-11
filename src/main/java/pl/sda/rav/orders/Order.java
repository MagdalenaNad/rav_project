package pl.sda.rav.orders;

import pl.sda.rav.vehicles.Vehicles;

public class Order {
    private static int COUNT=1;
    private int id;
    private String customer;
    private Vehicles vehicle;
    private OrderPeriod orderPeriod;

    public Order(String customer, Vehicles vehicle, OrderPeriod orderPeriod) {
        this.id = COUNT++;
        this.customer = customer;
        this.vehicle = vehicle;
        this.orderPeriod = orderPeriod;
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public Vehicles getVehicle() {
        return vehicle;
    }

    public OrderPeriod getOrderPeriod() {
        return orderPeriod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id: " + id +
                ", custome: " + customer +
                ", vehicle: " + vehicle +
                ", orderPeriod: " + orderPeriod +
                '}';
    }
}
