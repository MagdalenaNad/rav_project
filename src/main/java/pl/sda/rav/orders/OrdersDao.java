package pl.sda.rav.orders;

import pl.sda.rav.users.User;
import pl.sda.rav.vehicles.Vehicles;

import java.time.LocalDate;
import java.util.List;

public class OrdersDao {

    private List<Order> orders;

    public void makeOrder(String customer, Vehicles vehicles, OrderPeriod orderPeriod ){
        orders.add(new Order(customer,vehicles, orderPeriod));
    }

    public boolean isAvalible(String vin, LocalDate start, LocalDate stop){
        for (Order order : orders) {
            if (order.getVehicle().getVin().equals(vin)) return !order.getOrderPeriod().isIncluded(start,stop);
        }
        return true;
    }

}
