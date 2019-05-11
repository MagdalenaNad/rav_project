package pl.sda.rav.orders;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.rav.orders.Order;
import pl.sda.rav.vehicles.Cars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class OrdersDaoTest {

    @Test
    void shouldAvalible() {

        //given
        OrdersDao ordersDao = new OrdersDao();
        List<Order> orders =new ArrayList<>();
        OrderPeriod orderPeriod = new OrderPeriod(LocalDate.of(2019,4, 10), LocalDate.of(2019, 4, 18));
        LocalDate t1 = LocalDate.of(2019, 4, 1);
        LocalDate t2 = LocalDate.of(2019, 4, 9);
        LocalDate t3 = LocalDate.of(2019, 4, 13);
        ordersDao.makeOrder("Pan", new Cars("MA84","Ford", 1987, "kombi", 400),orderPeriod);
        ordersDao.makeOrder("Pan", new Cars("MA65","Ford", 1982, "kombi", 400),orderPeriod);

        //when
        boolean shouldBeAvalible = ordersDao.isAvalible("MA84", t1, t2);
        boolean shouldBeNotAvalible = ordersDao.isAvalible("MA84", t2, t3);
        boolean shouldBeNotAvalible2 = ordersDao.isAvalible("MA65", t1, t3);

        //then
        Assertions.assertTrue(shouldBeAvalible);
        Assertions.assertFalse(shouldBeNotAvalible);
        Assertions.assertFalse(shouldBeNotAvalible2);



    }
}