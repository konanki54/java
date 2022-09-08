package com.bct.java8features.methodreferances;

/*
 * changes of interface on default and abstract method
 */
interface DefaultAndAstract{
	//default method
	default void print() {
		System.out.println("Another example of default method in the interface");
		System.out.println("interface is mainly developed to obtain 100% abstraction ");
	}
	//abstarct method--do not consist of method body
	public void myMethod(String message);
}

public class ChangesoffunctionalInterface implements DefaultAndAstract {
	//implementing abstract method
	public void myMethod(String message) {
		System.out.println("message is:"+message);
	}
	
	

	public static void main(String[] args) {
		//create an object to the class
		ChangesoffunctionalInterface instance=new ChangesoffunctionalInterface();
		//calling the default method
		instance.print();
		//calling the abstract method
		instance.myMethod("good af guys,its a lunch time!");
		
		
	}

}
