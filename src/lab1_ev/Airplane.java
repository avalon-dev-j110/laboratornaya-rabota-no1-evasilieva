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
public class Airplane extends Transport {
    
    public static TransportType AIRPLANE;
    
    public Airplane(Text name) {
        super(name);
    }

    @Override
    protected void print() {
       System.out.println("AIRPLANE: Boing");
    }

    @Override
    public void move() {
        System.out.println("Train is using sky to move");
    }

   
    
}
