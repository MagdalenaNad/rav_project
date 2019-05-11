package pl.sda.rav;

import java.time.LocalDate;
import java.time.Period;

public class OrderPeriod {
    private LocalDate start;
    private LocalDate stop;

    public OrderPeriod(LocalDate start, LocalDate stop) {
        this.start = start;
        this.stop = stop;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getStop() {
        return stop;
    }

    public int daysOfOrder(){
        Period between = Period.between(start, stop);
        return between.getDays();
    }

    @Override
    public String toString() {
        return "OrderPeriod: " +
                "from: " + start +
                " to: " + stop +
                ", days: " + daysOfOrder() ;
    }
}
