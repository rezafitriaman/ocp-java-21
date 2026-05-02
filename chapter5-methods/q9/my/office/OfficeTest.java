package my.office;

import my.company.Employee;

public class OfficeTest {
    public static void main(String[] args) {
        System.out.println(Employee.password); // pacakge static var | compiler error
        Employee emp = new Employee(7, "HR"); // package constructor | compiler error
        System.out.println(emp.id); // private var | compiler error
        System.out.println(Employee.officeNumber); // public static
        System.out.println(Employee.dept); // protected static | compiler error
    }
}