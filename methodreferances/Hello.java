package com.bct.java8features.methodreferances;
interface ConstructorInterface{

	Hello display(String say);
	
}

 class Hello {
Hello(String say) {
		System.out.println("good mrning guys....!!"+say);
	}
	
public class Contructormethodreferece{
	

	public static void main(String[] args) {
	
		 ConstructorInterface ref=Hello::new;
		ref.display("how are doing..!!");

	}

}
}
