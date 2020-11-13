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
public class Train extends Transport {
    
    public static TransportType TRAIN;
    
    public Train(Text name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println("TRAIN: Sapsan");
    }

    @Override
    public void move() {
        System.out.println("Train is using railways to move");
    }
    

    
}
