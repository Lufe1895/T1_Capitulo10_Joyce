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
public class LabCourse extends CollegeCourse{
    

    public LabCourse(String department, Integer cNumber, Integer credits) {
        super(department, cNumber, credits);
        if(department=="BIO" || department == "CHM" || department == "CIS" || department == "PHY"){
            super.setCost();
            super.calculateFee();
        }
    }
    
    public void display(){
        if("BIO".equals(super.getDepartment()) || "CHM".equals(super.getDepartment()) || "CIS".equals(super.getDepartment()) || "PHY".equals(super.getDepartment())){
            System.out.println("This is a Lab Course\nDepartmen: "+super.getDepartment()+
                "\nCourse number: "+super.getcNumber()+
                "\nCredits: "+super.getCredits()+
                "\nFee for the course: $"+super.getFee());
        }else{
            System.out.println("Departmen: "+super.getDepartment()+
                "\nCourse number: "+super.getcNumber()+
                "\nCredits: "+super.getCredits()+
                "\nFee for the course: $"+super.getFee());
        }
        
    }
    
    
}
