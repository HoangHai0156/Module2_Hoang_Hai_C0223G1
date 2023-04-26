package demerging_use_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingQueue {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Van A",true,"04/10/1988");
        employees[1] = new Employee("Van B",false,"04/10/1999");
        employees[2] = new Employee("Van C",true,"07/10/1988");
        employees[3] = new Employee("Nguyen A",true,"12/09/1989");
        employees[4] = new Employee("Tran B",false,"23/07/1992");
        employees[5] = new Employee("Le C",false,"04/10/2000");
        employees[6] = new Employee("Hoang E",true,"04/10/2001");
        employees[7] = new Employee("Tran A",false,"03/11/2000");
        employees[8] = new Employee("Pham H",true,"07/07/1999");
        employees[9] = new Employee("Luong K",false,"08/08/1998");

        DOBComparator comparator = new DOBComparator();
        Arrays.sort(employees,comparator);
        showEmployees(employees);

        Queue<Employee> femaleEmployee = new LinkedList<>();
        Queue<Employee> maleEmployee = new LinkedList<>();

        for (Employee employee: employees){
            if (employee.isMale()){
                maleEmployee.add(employee);
            }else femaleEmployee.add(employee);
        }

        Queue<Employee> output = new LinkedList<>();

        while (!femaleEmployee.isEmpty()){
            output.add(femaleEmployee.remove());
        }
        while (!maleEmployee.isEmpty()){
            output.add(maleEmployee.remove());
        }
        System.out.println(output);
    }
    public static void showEmployees(Employee[] employees){
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }
}
