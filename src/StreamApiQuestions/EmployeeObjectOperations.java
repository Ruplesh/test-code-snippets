package StreamApiQuestions;

import StreamApiQuestions.model.Employee;
import StreamApiQuestions.util.DataUtil;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeObjectOperations {

    public static void main(String[] args) {
        List<Employee> employees = DataUtil.getEmployees();

        System.out.println(employees.stream().map(e -> {
            e.setName(e.getName().toUpperCase());
            return e;
        }).toList());
        // Count employees by department
        Map<String, Long> employeeCountByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDesignation,  // Group by department
                        Collectors.counting()     // Count employees in each department
                ));
        System.out.println(employeeCountByDepartment);
        
        //Get the employees in each department and sort them with their name
        Map<String, List<Employee>> employeesGroupedByDesignation = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDesignation,  // Group by department
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(Employee::getName))  // Sort by name
                                        .collect(Collectors.toList())
                        )
                ));
        System.out.println(employeesGroupedByDesignation);

        // Get the employee with the maximum salary in each department
        Map<String, Optional<Employee>> maxSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDesignation,  // Group by department
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))  // Find max salary
                ));

        maxSalaryByDepartment.forEach((dept, emp) ->
                System.out.println(dept + ": " + emp.map(Employee::toString).orElse("No employees"))
        );
    }
}
