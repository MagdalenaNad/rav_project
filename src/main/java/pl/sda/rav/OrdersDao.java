package pl.sda.rav;

import java.time.LocalDate;
import java.util.List;

public class OrdersDao {

    private List<Order> orders;

    public void makeOrder(User customer, Vehicles vehicles,OrderPeriod orderPeriod ){
        orders.add(new Order(customer,vehicles, orderPeriod));
    }

    public boolean isAvalible(String vin, LocalDate start, LocalDate stop){

        return false;
    }

}
