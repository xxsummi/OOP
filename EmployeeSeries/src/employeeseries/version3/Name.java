/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version3;

/**
 *
 * @author User
 */
public class Name {
    public String fname;
    public String lname;
    public char mid;

    public Name() {
    }

    public Name(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Name(String fname, String lname, char mid) {
        this.fname = fname;
        this.lname = lname;
        this.mid = mid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public char getMid() {
        return mid;
    }

    public void setMid(char mid) {
        this.mid = mid;
    }

    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return lname + ", " + fname + " " + mid + ".\n";
    }

    
    
}
