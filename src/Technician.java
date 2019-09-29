/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uvenu
 */
public class Technician extends Person{
    int empId;
    String phoneNum;
    
    //constructors
    public Technician() {
        this.empId = 1001;
           
    }

    public Technician(int empId, String name) {
        this.empId = empId;
        super.setName(name);
    }

    public Technician(int empId, String phoneNum, String name) {
        super(name);
        this.empId = empId;
        this.phoneNum = phoneNum;
    }
    
    
    //getter and setter
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
  
    //Overriden toString method
    @Override
    public String toString() {
        return "Technician " + "EmpId : " + empId + "\nname :" + name + "Phone :"+phoneNum+ '\n';
    }   
    
} // end of class
