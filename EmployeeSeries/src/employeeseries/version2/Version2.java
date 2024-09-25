/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version2;

/**
 *
 * @author User
 */
public class Version2 {
    public static void main(String[] args) {
        System.out.println("----------HOURLY EMPLOYEE----------");
        HourlyEmployee emp1 = new HourlyEmployee();
        emp1.setEmpID(100); 
        emp1.setEmpName("Josh");
        emp1.setTotalHoursWorked(40);
        emp1.setRatePerHour(15.0);
        System.out.println("Constructor 1");
        emp1.displayHourlyEmployee(); 
        
        Employee e1 = new Employee("John Doe", 101);
        HourlyEmployee emp2 = new HourlyEmployee(e1);
        emp2.setTotalHoursWorked(38); 
        emp2.setRatePerHour(20.0);
        System.out.println("\nConstructor 2");
        emp2.displayHourlyEmployee();

        HourlyEmployee emp3 = new HourlyEmployee(e1, 45, 22.0);
        System.out.println("\nConstructor 3");
        emp3.displayHourlyEmployee(); 

        HourlyEmployee emp4 = new HourlyEmployee(50, 18.5);
        emp4.setEmpID(102);  
        emp4.setEmpName("Chris Evans");
        System.out.println("\nConstructor 4");
        emp4.displayHourlyEmployee();

        HourlyEmployee emp5 = new HourlyEmployee(22.5f, 50, "Jane Smith", 103);
        System.out.println("\nConstructor 5");
        emp5.displayHourlyEmployee();
        
        System.out.println("\n\n----------PIECE WORKER EMPLOYEE----------");
        PieceWorkerEmployee pe1 = new PieceWorkerEmployee();
        pe1.setEmpID(200);  
        pe1.setEmpName("Default Worker");
        pe1.setTotalPiecesFinished(80);
        pe1.setRatePerPiece(12.5);
        System.out.println("Constructor 1: ");
        pe1.displayPieceWorkerEmployee();

        Employee temp1 = new Employee("John Doe", 201);
        PieceWorkerEmployee pe2 = new PieceWorkerEmployee(temp1);
        pe2.setTotalPiecesFinished(150);  
        pe2.setRatePerPiece(10.0);
        System.out.println("\nConstructor 2");
        pe2.displayPieceWorkerEmployee();
        
        PieceWorkerEmployee pe3 = new PieceWorkerEmployee(e1, 110, 8.0);
        System.out.println("\nConstructor 3");
        pe3.displayPieceWorkerEmployee(); 

        PieceWorkerEmployee pe4 = new PieceWorkerEmployee(200, 15.0);
        pe4.setEmpID(202); 
        pe4.setEmpName("Chris Evans");
        System.out.println("\nConstructor 4");
        pe4.displayPieceWorkerEmployee();

        PieceWorkerEmployee pe5 = new PieceWorkerEmployee(180, 20.0, "Jane Smith", 203);
        System.out.println("\nConstructor 5");
        pe5.displayPieceWorkerEmployee();
        
System.out.println("\n\n----------COMMISSION EMPLOYEE----------");
        CommisionEmployee ce1 = new CommisionEmployee();
        ce1.setEmpID(300);
        ce1.setEmpName("Default Commission Worker");
        ce1.setTotalSales(5000);
        System.out.println("Constructor 1:");
        ce1.displayCommisionEmployee();

        Employee temp2 = new Employee("Alice Johnson", 301);
        CommisionEmployee ce2 = new CommisionEmployee(temp2);
        ce2.setTotalSales(15000);
        System.out.println("\nConstructor 2:");
        ce2.displayCommisionEmployee();

        CommisionEmployee ce3 = new CommisionEmployee(25000, temp2);
        System.out.println("\nConstructor 3:");
        ce3.displayCommisionEmployee();

        CommisionEmployee ce4 = new CommisionEmployee(10000);
        ce4.setEmpID(302);
        ce4.setEmpName("Bob Brown");
        System.out.println("\nConstructor 4:");
        ce4.displayCommisionEmployee();

        CommisionEmployee ce5 = new CommisionEmployee(80000, "Charlie Black", 303);
        System.out.println("\nConstructor 5:");
        ce5.displayCommisionEmployee();
System.out.println("\n\n-----------BASE PLUS COMMISSION EMPLOYEE-----------");
        BasedPlusCommisionEmployee bpce1 = new BasedPlusCommisionEmployee();
        bpce1.setEmpID(400);
        bpce1.setEmpName("Default Base Plus Worker");
        bpce1.setTotalSales(6000);
        bpce1.setBaseSalary(2000);
        System.out.println("Constructor 1:");
        bpce1.displayBasedPlusCommisionEmployee();

        Employee temp4 = new Employee("David Smith", 401);
        BasedPlusCommisionEmployee bpce2 = new BasedPlusCommisionEmployee(temp4);
        bpce2.setTotalSales(20000);
        bpce2.setBaseSalary(3000);
        System.out.println("\nConstructor 2:");
        bpce2.displayBasedPlusCommisionEmployee();

        BasedPlusCommisionEmployee bpce3 = new BasedPlusCommisionEmployee(30000, temp4);
        bpce3.setBaseSalary(2500);
        System.out.println("\nConstructor 3:");
        bpce3.displayBasedPlusCommisionEmployee();
        BasedPlusCommisionEmployee bpce4 = new BasedPlusCommisionEmployee(15000, 4000);
        bpce4.setEmpID(402);
        bpce4.setEmpName("Eve White");
        System.out.println("\nConstructor 4:");
        bpce4.displayBasedPlusCommisionEmployee();

        BasedPlusCommisionEmployee bpce5 = new BasedPlusCommisionEmployee(90000, 403, "Frank Black", 5000);
        System.out.println("\nConstructor 5:");
        bpce5.displayBasedPlusCommisionEmployee();

        
        
        
        
        
//        // Employee instances
//        Employee emp1 = new Employee("John Doe", 101);
//        Employee emp2 = new Employee("Jane Smith", 102);
//        Employee emp3 = new Employee(); // Default constructor
//        emp3.setEmpID(103);
//        emp3.setEmpName("Seo Soojin");
//
//        // Commission Employee instances
//        CommisionEmployee commEmp1 = new CommisionEmployee(); // Default constructor
//        CommisionEmployee commEmp2 = new CommisionEmployee(1500); // Total sales only
//        CommisionEmployee commEmp3 = new CommisionEmployee(emp1); // Using Employee object
//        CommisionEmployee commEmp4 = new CommisionEmployee("Alice Johnson", 201); // Using name and ID
//        CommisionEmployee commEmp5 = new CommisionEmployee(emp2, 2500); // Using Employee object and total sales
//        CommisionEmployee commEmp6 = new CommisionEmployee(250000, emp3); // Using sales, name, and ID
//        CommisionEmployee commEmp7 = new CommisionEmployee(3000, "Bob Brown", 202); // Using sales, name, and ID
//
//        // Based Plus Commission Employee instances
//        BasedPlusCommisionEmployee basedCommEmp1 = new BasedPlusCommisionEmployee(); // Default constructor
//        BasedPlusCommisionEmployee basedCommEmp2 = new BasedPlusCommisionEmployee(emp1); // Using Employee object
//        BasedPlusCommisionEmployee basedCommEmp3 = new BasedPlusCommisionEmployee(2000, emp2); // Using total sales and Employee object
//        BasedPlusCommisionEmployee basedCommEmp4 = new BasedPlusCommisionEmployee(3000, 500); // Using sales and base salary
//        BasedPlusCommisionEmployee basedCommEmp5 = new BasedPlusCommisionEmployee(10000, 203, "Charlie Green", 600); // Full constructor
//
////        // Hourly Employee instances
//        HourlyEmployee hourlyEmp1 = new HourlyEmployee(); // Default constructor
//        HourlyEmployee hourlyEmp2 = new HourlyEmployee(emp1); // Using Employee object
//        HourlyEmployee hourlyEmp3 = new HourlyEmployee("Soyeon", 124);
//        HourlyEmployee hourlyEmp4 = new HourlyEmployee(45, 20); // Hours, rate
//        HourlyEmployee hourlyEmp5 = new HourlyEmployee(emp2, 40, 25); // Employee object, hours, rate
//        HourlyEmployee hourlyEmp6 = new HourlyEmployee(50, 15, "Diana Black", 204); // Hours, rate, name, ID
//
//        // Piece Worker Employee instances
//        PieceWorkerEmployee pieceWorkerEmp1 = new PieceWorkerEmployee(); // Default constructor
//        PieceWorkerEmployee pieceWorkerEmp2 = new PieceWorkerEmployee(emp2); // Using Employee object
//        PieceWorkerEmployee pieceWorkerEmp3 = new PieceWorkerEmployee("Cho Miyeon", 1224); // Pieces, rate
//        PieceWorkerEmployee pieceWorkerEmp4 = new PieceWorkerEmployee(200, 5.0); // Pieces, rate
//        PieceWorkerEmployee pieceWorkerEmp5 = new PieceWorkerEmployee(emp1, 300, 4.0); // Employee object, pieces, rate
//        PieceWorkerEmployee pieceWorkerEmp6 = new PieceWorkerEmployee(400, 3.5, "Eve White", 205); // Pieces, rate, name, ID
//
//        // Display employee information using all constructors
//        emp1.displayEmployee();
//        emp2.displayEmployee();
//        emp3.displayEmployee(); // Default employee
//
//        commEmp1.displayCommisionEmployee();
//        commEmp2.displayCommisionEmployee();
//        commEmp3.displayCommisionEmployee();
//        commEmp4.displayCommisionEmployee();
//        commEmp5.displayCommisionEmployee();
//        commEmp6.displayCommisionEmployee();
//        commEmp7.displayCommisionEmployee();
//
//        basedCommEmp1.displayBasedPlusCommisionEmployee();
//        basedCommEmp2.displayBasedPlusCommisionEmployee();
//        basedCommEmp3.displayBasedPlusCommisionEmployee();
//        basedCommEmp4.displayBasedPlusCommisionEmployee();
//        basedCommEmp5.displayBasedPlusCommisionEmployee();
//
//        hourlyEmp1.displayHourlyEmployee(); // Default hourly employee
//        hourlyEmp2.displayHourlyEmployee(); // Using Employee object
//        hourlyEmp3.displayHourlyEmployee();
//        hourlyEmp4.displayHourlyEmployee();
//        hourlyEmp5.displayHourlyEmployee();
//        hourlyEmp6.displayHourlyEmployee();
//        
//        pieceWorkerEmp1.displayPieceWorkerEmployee(); // Default piece worker
//        pieceWorkerEmp2.displayPieceWorkerEmployee(); // Using Employee object
//        pieceWorkerEmp3.displayPieceWorkerEmployee();
//        pieceWorkerEmp4.displayPieceWorkerEmployee();
//        pieceWorkerEmp5.displayPieceWorkerEmployee();
//        pieceWorkerEmp6.displayPieceWorkerEmployee();
    }
}
