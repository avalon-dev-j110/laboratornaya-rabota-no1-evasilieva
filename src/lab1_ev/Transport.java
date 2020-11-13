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
public abstract class Transport implements ITransport {
          
    private Text name;
    
    private Transport() {};
    protected Transport (Text name) {};
    
    
    protected abstract void print();
             
    
    public static void main(String[] args) {
                         
    }
    
}