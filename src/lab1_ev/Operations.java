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
public class Operations {   
      
   public static void main(String[] args) {
       Operations A = new Operations();
       int[] array = {1, 8};
      
//       System.out.println(A.isEven(2));

       System.out.println(A.bitNumber(array));
       

   }
    
    public boolean isEven (int number) {
        return ((number&1)!=1) ? true : false;
       
     }
    
    public int bitNumber (int[] array) {
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            while (i != 0) {
                counter++;
                i = i & (i-1);               

            }
                
        }
        return counter;
        
    }
  
         
}
