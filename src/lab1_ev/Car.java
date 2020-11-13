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
public class Car extends Transport{
    
    public static TransportType CAR;
    
    public Car(Text name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println("CAR: Volvo");
    }

    @Override
    public void move() {
        System.out.println("Car is using highways to move");
    }

  
       
}
