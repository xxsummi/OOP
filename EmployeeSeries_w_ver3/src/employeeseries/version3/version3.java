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
        
        System.out.println("\n----------Hourly Employee--------");
        HourlyEmployee hourlyEmp1=new HourlyEmployee(46f, 120, 1224, new Name("Soojin", "Seo", 'S'), new Date(24, 12, 2004), new Date(24, 1, 2024));
        hourlyEmp1.displayHourlyEmployee();
        
        
        System.out.println("\n\n----------Piece Worker Employee--------");
        PieceWorkerEmployee pieceEmp1=new PieceWorkerEmployee(80, 12.5, 1224, new Name("Soojin", "Seo", 'S'), new Date(24, 12, 2004), new Date(24, 1, 2024));
        pieceEmp1.displayPieceWorkerEmployee();
        
        System.out.println("\n\n----------Commission Employee--------");
        CommisionEmployee commEmp1=new CommisionEmployee(5000, 1224, new Name("Soojin", "Seo", 'S'), new Date(24, 12, 2004), new Date(24, 1, 2024));
        commEmp1.displayCommisionEmployee();
        
        System.out.println("\n\n----------Base Plus Commission Employee--------");
        BasedPlusCommisionEmployee baseEmp1=new BasedPlusCommisionEmployee(6000, 2000, 1224, new Name("Soojin", "Seo", 'S'), new Date(24, 12, 2004), new Date(24, 1, 2024));
        baseEmp1.displayBasedPlusCommisionEmployee();
    }
}
