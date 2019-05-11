package pl.sda.rav;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdersDao {

    private List<Order> orders= new ArrayList<>();

    public void makeOrder(String customer, Vehicles vehicles,OrderPeriod orderPeriod ){
        orders.add(new Order(customer,vehicles, orderPeriod));
    }

    public boolean isAvalible(String vin, LocalDate start, LocalDate stop){
        for (Order order : orders) {
            if (order.getVehicle().getVin().equals(vin)) {
                if(order.getOrderPeriod().isIncluded(start, stop)) return false;
            }
        }
        return true;
    }

}
