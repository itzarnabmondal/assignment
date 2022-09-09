package com.demo;

/**
 * JAVA Q1
 * @author "Arnab Mondal"
 */

 // Emp Class
class Employee {

    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    // Non Parameterized Constructor
    public Employee() {

    }

    // Parameterized Constructor
    public Employee(long id, String name, String address, long phone) {
        employeeId = id;
        employeeName = name;
        employeeAddress = address;
        employeePhone = phone;
    }

    // Method 1
    public double calculateSalary() {
        double Salary = (basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 10));
        return Salary;
    }

    // Method 2
    public double calculateTransportAllowance() {
        double transportAllowance = 15 * basicSalary / 100;
        return transportAllowance;
    }

}

// Manager Class ( sub class of Employee )
class Manager extends Employee {

    // Parameterized Constructor
    public Manager(long id, String name, String address, long phone, double salary) {
        employeeId = id;
        employeeName = name;
        employeeAddress = address;
        employeePhone = phone;
        basicSalary = salary;
    }

}

// Trainee Class ( sub class of Employee )
class Trainee extends Employee {

    // Parameterized Constructor
    public Trainee(long id, String name, String address, long phone, double salary) {
        employeeId = id;
        employeeName = name;
        employeeAddress = address;
        employeePhone = phone;
        basicSalary = salary;
    }
}

public class InheritanceActivity {
    public static void main(String[] args) {

        // Creating Manager class object
        Manager manager = new Manager(126534L, "Peter", "Chennai India", 237844L, 65000);
        System.out.println("Salary of Manager: " + manager.calculateSalary());
        System.out.println("Transport Allowance for manager: " + manager.calculateTransportAllowance());

        // Creating Trainee class object
        Trainee trainee = new Trainee(29846L, "Jack", "Mumbai India", 442085L, 45000);
        System.out.println("Salary of Trainee: " + trainee.calculateSalary());
        System.out.println("Transport Allowance for trainee: " + trainee.calculateTransportAllowance());
    }
}