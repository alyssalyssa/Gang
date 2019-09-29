
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uvenu
 */
public class Installation {
    private String address = "Sydney";
    private LocalDate startDate;
    private int numZones;
    private int numOutlets;
    private LocalDate endDate;
    private Technician employee;

    //constructors
    public Installation() {
    }    

    public Installation(LocalDate startDate, int numZones, int numOutlets, LocalDate endDate, Technician employee) {
        this.startDate = startDate;
        this.numZones = numZones;
        this.numOutlets = numOutlets;
        this.endDate = endDate;
        this.employee = employee;
    }

    public Installation(LocalDate startDate, LocalDate endDate, Technician employee) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.employee = employee;
    }

    //getters and setters
    public int getNumZones() {
        return numZones;
    }

    public int getNumOutlets() {
        return numOutlets;
    }

    public void setNumZones(int numZones) {
        this.numZones = numZones;
    }

    public void setNumOutlets(int numOutlets) {
        this.numOutlets = numOutlets;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Technician getEmployee() {
        return employee;
    }

    public void setEmployee(Technician employee) {
        this.employee = employee;
    }

    //Overridden toString method
    @Override
    public String toString() {
        return "Installation \n" + "Address : " + address + "\nStart Date : " + startDate + "\nEnd Date : " + endDate + "\nEmployee : \n" + employee + '\n';
    }
    
     
}
