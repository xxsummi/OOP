/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version3;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }
    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, int empID, Name name) {
        super(empID, name);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, int empID, Name name, Date birthDate, Date dateHired) {
        super(empID, name, birthDate, dateHired);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(){
        int pieces = totalPiecesFinished;
        double sal=0;
        
        sal+=(ratePerPiece*10)*(pieces/100);
        
        sal+=ratePerPiece*totalPiecesFinished;
        return sal;
    }
    
    public void displayPieceWorkerEmployee(){
        System.out.println(toString()  + "Total  Salary: " + computeSalary());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Total Pieces Finished: ").append(totalPiecesFinished);
        sb.append("\nRatePerPiece: ").append(ratePerPiece);
        sb.append('\n');
        return sb.toString();
    }
}
