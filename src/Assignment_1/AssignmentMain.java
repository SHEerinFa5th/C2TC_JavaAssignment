package Assignment_1;

import Employee.Manager;
import Employee.Developer;
import Utility.EmployeeUtility;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager manager = new Manager("Alice", "M101", 80000, "HR");
        Developer developer = new Developer("Bob", "D102", 60000, "Java");

        // Display details using EmployeeUtilities
        System.out.println("=== Employee Details ===");
        EmployeeUtility.displayEmployeeDetails(manager);
        EmployeeUtility.displayEmployeeDetails(developer);

        // Compare their salaries
        System.out.println("\n=== Salary Comparison ===");
        EmployeeUtility.compareSalaries(manager, developer);
    }
}
