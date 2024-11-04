/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version4;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    private int count;
    private final int max;
    Employee[] empList;
    
    public EmployeeRoster() {
        this.count = 0;
        this.max = 50;
        empList = new Employee[max];
    }
    
    public EmployeeRoster(int max) {
        this.count = 0;
        this.max = max;
        empList = new Employee[max];
    }
    
    public boolean addEmployee(Employee emp){
        if(count<max){
            empList[count++]=emp;
            return true;
        }
        return false;
    }
    
    public Employee removeEmployee(int id){
        Employee temp;
        for (int i=0; i<count; ++i){
            if(empList[i].empID==id){
                temp=empList[i];
                empList[i]=null;
                
                for(int j=i; j<count-1; ++j){
                    empList[j]=empList[j+1];
                }
                empList[count--]=null;
                return temp;
            }
        }
        return null;
    }
    
    public int countHE() {
        int n = 0;
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof HourlyEmployee) {
                n++;
            }
        }
        return n;
    }

    public int countCE() {
        int n = 0;
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof CommissionEmployee && !(empList[i] instanceof BasePlusCommissionEmployee)) {
                n++;
            }
        }
        return n;
    }

    public int countBPCE() {
        int n = 0;
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof BasePlusCommissionEmployee) {
                n++;
            }
        }
        return n;
    }

    public int countPWE() {
        int n = 0;
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                n++;
            }
        }
        return n;
    }

    public void displayHE() {
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof HourlyEmployee) {
                ((HourlyEmployee) empList[i]).displayHourlyEmployee();
            }
        }
    }

    public void displayCE() {
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof CommissionEmployee && !(empList[i] instanceof BasePlusCommissionEmployee)) {
                ((CommissionEmployee) empList[i]).display();
            }
        }
    }

    public void displayBPCE() {
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof BasePlusCommissionEmployee) {
                ((BasePlusCommissionEmployee) empList[i]).display();
            }
        }
    }

    public void displayPWE() {
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                ((PieceWorkerEmployee) empList[i]).display();
            }
        }
    }

    public void displayAllEmployee() {
         System.out.printf("\nAll Employees:\n");
        System.out.printf("%10s|%20s|%15s|%15s|%10s|%30s\n", "ID", "Name", "DateOfBirth", "DateHired", "Salary", "Type of Employee");
        for (int i = 0; i < count; ++i) {
            System.out.printf("%10s|", empList[i].getEmpID());
            System.out.printf("%20s|", empList[i].getName());
            System.out.printf("%15s|", empList[i].getBirthDate());
            System.out.printf("%15s|", empList[i].getDateHired());
            if (empList[i] instanceof BasePlusCommissionEmployee) {
                System.out.printf("%,10.2f|", ((BasePlusCommissionEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof CommissionEmployee) {
                System.out.printf("%,10.2f|", ((CommissionEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof HourlyEmployee) {
                System.out.printf("%,10.2f|", ((HourlyEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof PieceWorkerEmployee) {
                System.out.printf("%,10.2f|", ((PieceWorkerEmployee) empList[i]).computeSalary());
            }
            System.out.printf("%30s|\n", empList[i].getClass().getSimpleName());
        }
        System.out.println();
    }
    
}
