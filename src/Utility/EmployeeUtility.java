package Utility;

import Employee.Employee;

public class EmployeeUtility {

    // Method to display details of an employee
    public static void displayEmployeeDetails(Employee emp) {
        System.out.println(emp.getDetails());
    }

    // Method to compare salaries of two employees
    public static void compareSalaries(Employee emp1, Employee emp2) {
        if (emp1.getSalary() > emp2.getSalary()) {
            System.out.println(emp1.getName() + " has a higher salary than " + emp2.getName());
        } else if (emp1.getSalary() < emp2.getSalary()) {
            System.out.println(emp2.getName() + " has a higher salary than " + emp1.getName());
        } else {
            System.out.println(emp1.getName() + " and " + emp2.getName() + " have equal salaries.");
        }
    }
}
