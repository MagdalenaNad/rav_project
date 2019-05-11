package pl.sda.rav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.rav.orders.OrderPeriod;

import java.time.LocalDate;

class OrderPeriodTest {

    @Test
    void ShouldIncluded() {
        //given
        OrderPeriod orderPeriod = new OrderPeriod(LocalDate.of(2019,4, 10), LocalDate.of(2019, 4, 18));
        LocalDate t1 = LocalDate.of(2019, 4, 1);
        LocalDate t2 = LocalDate.of(2019, 4, 9);
        LocalDate t3 = LocalDate.of(2019, 4, 13);
        LocalDate t4 = LocalDate.of(2019, 4, 23);
        // when
        boolean shouldIncluded = orderPeriod.isIncluded(t1,t3);
        boolean shouldNotIncluded = orderPeriod.isIncluded(t1,t2);
        boolean shouldIncluded1 = orderPeriod.isIncluded(t3,t4);
        boolean shouldIncluded2 = orderPeriod.isIncluded(t1,t4);

        //then
        Assertions.assertTrue(shouldIncluded);
        Assertions.assertFalse(shouldNotIncluded);
        Assertions.assertTrue(shouldIncluded1);
        Assertions.assertTrue(shouldIncluded2);

    }
}