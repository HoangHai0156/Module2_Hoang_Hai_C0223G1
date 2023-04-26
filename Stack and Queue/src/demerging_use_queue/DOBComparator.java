package demerging_use_queue;

import java.time.LocalDate;
import java.util.Comparator;

public class DOBComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDOB().compareTo(o2.getDOB());
    }
}
