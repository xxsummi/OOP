/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version3;

/**
 *
 * @author User
 */
public class version3 {
    
    public static void main(String[] args){
        Employee emp1 = new Employee(1224, new Name("Soojin", "Seo", 'S'), new Date(24, 12, 2004), new Date(24, 1, 2024));
        emp1.display();
        
        HourlyEmployee hourlyEmp1=new HourlyEmployee(46f, 120, 1224, new Name("Soojin", "Seo", 'S'), new Date(24, 12, 2004), new Date(24, 1, 2024));
        hourlyEmp1.displayHourlyEmployee();
    }
}
