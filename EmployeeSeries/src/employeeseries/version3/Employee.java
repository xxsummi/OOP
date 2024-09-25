package employeeseries.version3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Employee {
    public  int empID; 
    public Name name;
    public  Date birthDate;
    public  Date dateHired;

    public Employee() {
    }

    public Employee(int empID, Name name) {
        this.empID = empID;
        this.name = new Name(name.getFname(), name.getLname(), name.getMid());
    }

    public Employee(Name name, Date birthDate, Date dateHired) {
        this.name = new Name(name.getFname(), name.getLname(), name.getMid());
        this.birthDate = new Date (birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
        this.dateHired = new Date (dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
    }

    public Employee(int empID, Name name, Date birthDate, Date dateHired) {
        this.empID = empID;
        this.name = new Name(name.getFname(), name.getLname(), name.getMid());
        this.birthDate = new Date (birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
        this.dateHired = new Date (dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = new Name(name.getFname(), name.getLname(), name.getMid());
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = new Date (birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = new Date (dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
    }

    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee\n");
        sb.append("empID: ").append(empID);
        sb.append("\nempName: ").append(name);
        sb.append("birthDate: ").append(birthDate);
        sb.append("\ndateHired: ").append(dateHired);
        sb.append("\n");
        return sb.toString();
    }
    
    
    
    
}
