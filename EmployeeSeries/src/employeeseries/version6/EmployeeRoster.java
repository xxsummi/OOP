/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version6;

/**
 *
 * @author User
 */

import java.util.ArrayList;
import java.util.List;

public class EmployeeRoster {
    private final int max;
    private final List<Employee> empList;

    public EmployeeRoster() {
        this.max = 50;
        empList = new ArrayList<>();
    }

    public EmployeeRoster(int max) {
        this.max = max;
        empList = new ArrayList<>();
    }

    public boolean addEmployee(Employee emp) {
        if (empList.size() < max) {
            return empList.add(emp);
        }
        return false;
    }

    public Employee removeEmployee(int id) {
        for (int i = 0; i < empList.size(); ++i) {
            if (empList.get(i).getEmpID() == id) {
                return empList.remove(i);
            }
        }
        return null;
    }

    public int countHE() {
        int n = 0;
        for (Employee emp : empList) {
            if (emp instanceof HourlyEmployee) {
                n++;
            }
        }
        return n;
    }

    public int countCE() {
        int n = 0;
        for (Employee emp : empList) {
            if (emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)) {
                n++;
            }
        }
        return n;
    }

    public int countBPCE() {
        int n = 0;
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                n++;
            }
        }
        return n;
    }

    public int countPWE() {
        int n = 0;
        for (Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) {
                n++;
            }
        }
        return n;
    }

    public void displayHE() {
        for (Employee emp : empList) {
            if (emp instanceof HourlyEmployee) {
                ((HourlyEmployee) emp).displayHourlyEmployee();
            }
        }
    }

    public void displayCE() {
        for (Employee emp : empList) {
            if (emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)) {
                ((CommissionEmployee) emp).display();
            }
        }
    }

    public void displayBPCE() {
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                ((BasePlusCommissionEmployee) emp).display();
            }
        }
    }

    public void displayPWE() {
        for (Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) {
                ((PieceWorkerEmployee) emp).display();
            }
        }
    }

    public void displayAllEmployee() {
        System.out.printf("\nAll Employees:\n");
        System.out.printf("%10s|%20s|%15s|%15s|%10s|%30s\n", "ID", "Name", "DateOfBirth", "DateHired", "Salary", "Type of Employee");
        for (Employee emp : empList) {
            System.out.printf("%10s|", emp.getEmpID());
            System.out.printf("%20s|", emp.getName());
            System.out.printf("%15s|", emp.getBirthDate());
            System.out.printf("%15s|", emp.getDateHired());
            System.out.printf("%,10.2f|", emp.computeSalary());
            System.out.printf("%30s|\n", emp.getClass().getSimpleName());
        }
        System.out.println();
    }
}
