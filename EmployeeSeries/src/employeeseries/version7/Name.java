/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version7;

/**
 *
 * @author User
 */
public class Name {
    public String fname;
    public String lname;
    public String mid;

    public Name() {
    }

    public Name(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Name(String fname, String lname, String mid) {
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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public void displayName(){
        System.out.print(lname + ", " + fname);
        if(mid!=null){
            System.out.print(", " + mid.charAt(0) + ".");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.lname).append(", ").append(this.fname);
        if (!this.mid.equals("")) {
            result.append(" ").append(this.mid.charAt(0)).append(".");
        }
        return result.toString();
    }
    
}
