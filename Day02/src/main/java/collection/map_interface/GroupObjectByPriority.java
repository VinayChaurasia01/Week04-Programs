package collection.map_interface;

import java.util.*;

// Employee class to represent an employee with name and department
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Override toString() to print employee name
    @Override
    public String toString() {
        return name;
    }
}

public class GroupObjectByPriority {
    public static void main(String[] args) {
        // Example list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Anuj", "HR"),
                new Employee("Bruce", "IT"),
                new Employee("Tony", "HR"),
                new Employee("Steve" , "HR")
        );

        // Call method to group employees by department and print result
        System.out.println(groupByDepartment(employees));
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            String department = emp.department; // Get the department key

            // If the department key does not exist, create a new list
            if (!departmentMap.containsKey(department)) {
                departmentMap.put(department, new ArrayList<>()); // Create an empty list
            }

            // Add the employee to the corresponding department list
            departmentMap.get(department).add(emp);
        }


        return departmentMap;
    }
}


