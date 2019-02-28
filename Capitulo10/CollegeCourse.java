/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo10;

/**
 *
 * @author luisl
 */
public class CollegeCourse {
    private String department;
    private Integer cNumber;
    private Integer credits;
    private Double fee=0.0;
    private Double cost=120.0;

    public CollegeCourse(String department, Integer cNumber, Integer credits) {
        this.department = department;
        this.cNumber = cNumber;
        this.credits = credits;
        calculateFee();
    }
    
    void calculateFee(){
        this.fee=this.getCredits() * this.getCost();
    }
    
    void setCost(){
        this.cost+=50.0;
    }
    
    public void display(){
        System.out.println("Departmen: "+this.getDepartment()+
                "\nCourse number: "+this.getcNumber()+
                "\nCredits: "+this.getCredits()+
                "\nFee for the course: $"+this.getFee());
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the cNumber
     */
    public Integer getcNumber() {
        return cNumber;
    }

    /**
     * @param cNumber the cNumber to set
     */
    public void setcNumber(Integer cNumber) {
        this.cNumber = cNumber;
    }

    /**
     * @return the credits
     */
    public Integer getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    /**
     * @return the fee
     */
    public Double getFee() {
        return fee;
    }

    /**
     * @return the cost
     */
    public Double getCost() {
        return cost;
    }
    
    
}
