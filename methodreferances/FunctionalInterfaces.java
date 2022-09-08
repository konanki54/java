package com.bct.java8features.methodreferances;

import java.util.function.IntBinaryOperator;



//default interfaces
interface Myinterface{
      default void newmethod() {
        System.out.println("newly added default method.");
    }

	
}
//Inheritances concepts
class Example implements Myinterface{
    public void existingMethod(String message) {
        System.out.println("helllo : "+message);
}
interface Myfunctionalinterface{
    //single abstract method1
    public int addMethod(int a,int b);
        
}
public class FunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // lambda operation
        Myfunctionalinterface sum=(a,b)->a+b;
        System.out.println("rsult is : "+sum.addMethod(23, 12));
        //predefined functions interface
        //lambda operation
        System.out.println("--------------printed--------------------- ");
        IntBinaryOperator add=(a,b)->a+b;
        System.out.println("result : "+add.applyAsInt(23, 13));
        //creating an object to the class Example
        Example insta=new Example();
        insta.newmethod();
        insta.existingMethod("time up");
		

	}
}
	}