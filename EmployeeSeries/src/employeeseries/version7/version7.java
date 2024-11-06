/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version7;

/**
 *
 * @author User
 */
public class version7 {
    public static void main(String[] args) {
        HourlyEmployee test1 = new HourlyEmployee(140, 200, 1001, new Name("Summi", "Derama", "Balansag"), new Date(2004, 8, 5), new Date(2024, 9, 15));
        PieceWorkerEmployee test2 = new PieceWorkerEmployee(15000, 40, 1002, new Name("Arnold", "Najera", "Jr"), new Date(2004, 8, 5), new Date(2024, 9, 15));
        CommissionEmployee test3 = new CommissionEmployee(50000, 1003, new Name("Soojin", "Seo", "S"), new Date(2004, 5, 5), new Date(2024, 9, 15));
        BasePlusCommissionEmployee test4 = new BasePlusCommissionEmployee(15000, 2000, 1004, new Name("Ari", "Yeh", "A"), new Date(2004, 5, 5), new Date(2024, 9, 15));
        BasePlusCommissionEmployee test5 = new BasePlusCommissionEmployee(24000, 1224, 1005, new Name("Ari", "Princess", "A"), new Date(2004, 4, 5), new Date(2024, 9, 24));

        EmployeeRoster emplist = new EmployeeRoster();
        emplist.addEmployee(test1);
        emplist.addEmployee(test2);
        emplist.addEmployee(test3);
        emplist.addEmployee(test4);
        emplist.addEmployee(test5);

        System.out.printf("\nCount of HE: %d\n", emplist.countHE());
        emplist.displayHE();

        System.out.printf("\nCount of PWE: %d\n", emplist.countPWE());
        emplist.displayPWE();

        System.out.printf("\nCount of CE: %d\n", emplist.countCE());
        emplist.displayCE();

        System.out.printf("\nCount of BPCE: %d\n", emplist.countBPCE());
        emplist.displayBPCE();

        emplist.displayAllEmployee();

        emplist.removeEmployee(1004);
        System.out.printf("Count of CE: %d\n", emplist.countCE());
        System.out.printf("Count of PWE: %d\n", emplist.countPWE());
        System.out.printf("Count of BPCE: %d\n", emplist.countBPCE());
        System.out.printf("Count of HE: %d\n", emplist.countHE());

        emplist.displayAllEmployee();
    }
}
