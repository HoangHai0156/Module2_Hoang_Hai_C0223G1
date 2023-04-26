package demerging_use_queue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String name;
    private boolean isMale;
    private LocalDate DOB;

    public Employee(String name, boolean isMale, String DOB) {
        this.name = name;
        this.isMale = isMale;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.DOB = LocalDate.parse(DOB,formatter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.DOB = LocalDate.parse(DOB,formatter);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", DOB=" + DOB +
                '}';
    }
}
