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
        Employee emp1 = new Employee(1224, new Name("Soojin", "Seo", "South"), new Date(24, 12, 2004), new Date(24, 1, 2024));
        emp1.display();
        Date birthDate = new Date(24, 12, 2004);
        Date dateHired = new Date(24, 1, 2024);
        Name name = new Name("Miyeon", "Cho", "North");
        Name name2 = new Name("Shuhua", "Yeh");
        
        System.out.println("\n----------Hourly Employee--------");
        HourlyEmployee hourlyEmp1=new HourlyEmployee(46f, 120, 1224, new Name("Soojin", "Seo", "West"), new Date(24, 12, 2004), new Date(24, 1, 2024));
        hourlyEmp1.displayHourlyEmployee();
        
        HourlyEmployee hourlyEmp2=new HourlyEmployee(46f, 120, 452346, new Name("Soojin", "Seo", "East"));
        hourlyEmp2.setBirthDate(birthDate);
        hourlyEmp2.setDateHired(dateHired);
        hourlyEmp2.displayHourlyEmployee();
        
        HourlyEmployee hourlyEmp3=new HourlyEmployee(48f, 160);
        hourlyEmp3.setEmpID(324);
        hourlyEmp3.setName(name);
        hourlyEmp3.setDateHired(dateHired);
        hourlyEmp3.setBirthDate(dateHired);
        hourlyEmp3.displayHourlyEmployee();
        
        HourlyEmployee hourlyEmp4=new HourlyEmployee();
        hourlyEmp4.setEmpID(324);
        hourlyEmp4.setName(name);
        hourlyEmp4.setDateHired(dateHired);
        hourlyEmp4.setBirthDate(dateHired);
        hourlyEmp4.setTotalHoursWorked(48f);
        hourlyEmp4.setRatePerHour(180);
        hourlyEmp4.displayHourlyEmployee();
        
        System.out.println("\n\n----------Piece Worker Employee--------");
        PieceWorkerEmployee pieceEmp1=new PieceWorkerEmployee(80, 12.5, 1224, new Name("Soyeon", "Seo", "Sweet"), new Date(24, 12, 2004), new Date(24, 1, 2024));
        pieceEmp1.displayPieceWorkerEmployee();
        
        PieceWorkerEmployee pieceEmp2=new PieceWorkerEmployee(80, 12.5, 1224, new Name("Soyeon", "Seo", "Sweet"));
        pieceEmp2.setBirthDate(birthDate);
        pieceEmp2.setDateHired(dateHired);
        pieceEmp2.displayPieceWorkerEmployee();
        
        PieceWorkerEmployee pieceEmp3=new PieceWorkerEmployee(80, 12.5);
        pieceEmp3.setEmpID(324);
        pieceEmp3.setName(name);
        pieceEmp3.setDateHired(dateHired);
        pieceEmp3.setBirthDate(dateHired);
        pieceEmp3.displayPieceWorkerEmployee();
        
        PieceWorkerEmployee pieceEmp4=new PieceWorkerEmployee();
        pieceEmp4.setEmpID(324);
        pieceEmp4.setName(name2);
        pieceEmp4.setDateHired(dateHired);
        pieceEmp4.setBirthDate(dateHired);
        pieceEmp4.setRatePerPiece(12.5);
        pieceEmp4.setTotalPiecesFinished(120);
        pieceEmp4.displayPieceWorkerEmployee();
        
        System.out.println("\n\n----------Commission Employee--------");
        CommisionEmployee commEmp1=new CommisionEmployee(5000, 1224, new Name("Blood", "Seo", "Yoon"), new Date(24, 12, 2004), new Date(24, 1, 2024));
        commEmp1.displayCommisionEmployee();
        
        
        CommisionEmployee commEmp2=new CommisionEmployee(5000, 1224, new Name("Soyeon", "Seo", "Sweet"));
        commEmp2.setBirthDate(birthDate);
        commEmp2.setDateHired(dateHired);
        commEmp2.displayCommisionEmployee();
        
        CommisionEmployee commEmp3=new CommisionEmployee(5000);
        commEmp3.setEmpID(324);
        commEmp3.setName(name);
        commEmp3.setDateHired(dateHired);
        commEmp3.setBirthDate(dateHired);
        commEmp3.displayCommisionEmployee();
        
        CommisionEmployee commEmp4=new CommisionEmployee();
        commEmp4.setEmpID(324);
        commEmp4.setName(name2);
        commEmp4.setDateHired(dateHired);
        commEmp4.setBirthDate(dateHired);
        commEmp4.setTotalSales(4600);
        commEmp4.displayCommisionEmployee();
        
        System.out.println("\n\n----------Base Plus Commission Employee--------");
        BasedPlusCommisionEmployee baseEmp1=new BasedPlusCommisionEmployee(6000, 2000, 1224, new Name("Soojin", "Seo", "Roses"), new Date(24, 12, 2004), new Date(24, 1, 2024));
        baseEmp1.displayBasedPlusCommisionEmployee();
        
        BasedPlusCommisionEmployee baseEmp2=new BasedPlusCommisionEmployee(6000, 2000, 1224, new Name("Soojin", "Seo", "Roses"));
        baseEmp2.setBirthDate(birthDate);
        baseEmp2.setDateHired(dateHired);
        baseEmp2.displayBasedPlusCommisionEmployee(); 
        
        BasedPlusCommisionEmployee baseEmp3=new BasedPlusCommisionEmployee(6000, 2000);
        baseEmp3.setEmpID(324);
        baseEmp3.setName(name);
        baseEmp3.setDateHired(dateHired);
        baseEmp3.setBirthDate(dateHired);
        baseEmp3.displayCommisionEmployee();
        
        BasedPlusCommisionEmployee baseEmp4=new BasedPlusCommisionEmployee();
        baseEmp4.setEmpID(324);
        baseEmp4.setName(name2);
        baseEmp4.setDateHired(dateHired);
        baseEmp4.setBirthDate(dateHired);
        baseEmp4.setTotalSales(4600);
        baseEmp4.setBaseSalary(2400);
        baseEmp4.displayCommisionEmployee();
    }
}
