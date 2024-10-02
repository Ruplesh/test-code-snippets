package StreamApiQuestions.util;

import StreamApiQuestions.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee("Employee Name1", 25, "Software Developer", 4000000);
        Employee e2 = new Employee("Employee Name2", 35, "Manager", 6000000);
        Employee e3 = new Employee("Employee Name3", 45, "Team Lead", 6600000);
        Employee e4 = new Employee("Employee Name4", 55, "Vice President", 8000000);
        Employee e5 = new Employee("Employee Name5", 35, "Software Developer", 4000000);
        Employee e6 = new Employee("Employee Name6", 34, "Software Developer", 5000000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        return employees;
    }
}
