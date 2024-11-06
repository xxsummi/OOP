/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version6;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }
    
    public BasePlusCommissionEmployee(double totalSales, double baseSalary){
        super(totalSales);
        this.baseSalary=baseSalary;
    }
    
    public BasePlusCommissionEmployee(double totalSales, double baseSalary, int empID, Name empName){
        super(totalSales, empID, empName);
        this.baseSalary=baseSalary;
    }
    
    public BasePlusCommissionEmployee(double totalSales, double baseSalary, int empID, Name empName, Date birthDate, Date dateHired) {
        super(totalSales, empID, empName, birthDate, dateHired);
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;
    }

    public void displayBasedPlusCommisionEmployee(){
        super.display();
        System.out.println("Base Salary: " + baseSalary + "\nTotal  Salary: "  + computeSalary());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Base Salary: ").append(baseSalary);
        sb.append('\n');
        return sb.toString();
    }
    
}
