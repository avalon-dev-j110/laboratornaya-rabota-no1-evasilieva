/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_ev;

/**
 *
 * @author Eva
 */
public class Student extends Man {
    
    private Number gradebook;
    
    public Student() {}
    public Student (String LastName, String FirstName, String MiddleName) {}
    public Student (String LastName, String FirstName, String MiddleName,
            String Date, String Document, Number gradebook) {}           

    
    @Override
    public void setDocument(String Document) {
        super.setDocument(Document);
        System.out.println("Student:setDocument()");  
    }
               
}
