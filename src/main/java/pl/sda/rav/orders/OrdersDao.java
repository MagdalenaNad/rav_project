package pl.sda.rav.orders;

import pl.sda.rav.vehicles.Vehicles;

import java.time.LocalDate;
import java.util.*;

public class OrdersDao {

    private List<Order> orders = new ArrayList<>();

    public void makeOrder(String customer, Vehicles vehicles, OrderPeriod orderPeriod ){
        orders.add(new Order(customer,vehicles, orderPeriod));
    }

    public boolean isAvalible(String vin, LocalDate start, LocalDate stop){
        for (Order order : orders) {
            if (order.getVehicle().getVin().equals(vin)) {
                if(order.getOrderPeriod().isIncluded(start,stop)) return false;
            }
        }
        return true;
    }

    public List<Order> clientHistory(String customer){
        List<Order> clientHistoryList = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCustomer().equals(customer)) clientHistoryList.add(order);
        }
        return clientHistoryList;
    }

    public Map<String,List<Order>> mapOfClientsHistory(){
        Map<String, List<Order>> mapOfClients = new HashMap<>();
        Set<String> customers = new HashSet<>();
        for (Order order : orders) {
            customers.add(order.getCustomer());
        }
        for (String customer : customers) {
            mapOfClients.put(customer,clientHistory(customer));
        }
        return mapOfClients;
    }

}
