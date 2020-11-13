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
public class A {
    
   private A a;
   private A a1;
   
   
   public A() {
       System.out.println("A:A()");
   }
   
   public A(A a) {
       this.a = a;
       System.out.println("A:A(A)");
   }
   
   protected A(A a, A a1) {
       this(a);
       this.a1 = a1;
       System.out.println("A:A(A,A)");       
   }
      
    
    public static void main(String[] args) {
        new A ();
        A g = new A (null, null);      
   
    }
public void a () {}
protected void a (A a) {}
private static void a (A a, A a1) {}

   
}   



