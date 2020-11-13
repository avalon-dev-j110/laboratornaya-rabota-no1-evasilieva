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
public class Man {
    
    private String LastName;
    private String FirstName;
    private String MiddleName;
    private String Date;
    private String Document;
    
    
      protected Man() {
        this(null, null, null, null, null);          
    }
    
      protected Man (String LastName, String FirstName, String MiddleName) {
        this(LastName, FirstName, MiddleName, null, null);           
    }
   
    protected Man (String LastName, String FirstName, String MiddleName, 
            String Date, String Document) {
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.Date = Date;
        this.Document = Document;    
    }
    
                  
    public final void setDate(String Date) {
        this.Date = Date;
        System.out.println("Man:setDate();"); 
    }

    public void setDocument(String Document) {
        this.Document = Document;
        System.out.println("Man:setDocument();");        
    }
                 
}
