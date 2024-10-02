/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version3;

/**
 *
 * @author User
 */
public class CommisionEmployee extends Employee{
    private double totalSales;
    
    public CommisionEmployee() {
    }

    public CommisionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public CommisionEmployee(double totalSales, int empID, Name empName) {
        super(empID, empName);
        this.totalSales = totalSales;
    }
    
    public CommisionEmployee(double totalSales, int empID, Name empName, Date birthDate, Date dateHired) {
        super(empID, empName, birthDate, dateHired);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(){
        double salary=0;
        if(totalSales < 10000){
            salary=totalSales*0.05;
        } else if(totalSales>=10000 && totalSales<100000){
            salary=totalSales*0.10;
        } else if(totalSales>=100000 && totalSales<1000000){
            salary=totalSales*0.20;
        } else if(totalSales>=1000000){
            salary=totalSales*0.30;
        }
        return salary;
    }
    
    public void displayCommisionEmployee(){
         System.out.println(toString()  + "Total  Salary: "  + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Total Sales: ").append(totalSales);
        sb.append('\n');
        return sb.toString();
    }
}
