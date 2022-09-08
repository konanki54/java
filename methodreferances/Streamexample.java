package com.bct.java8features.methodreferances;

import java.util.ArrayList;
import java.util.List;

public class Streamexample {

	public static void main(String[] args) {
		
		// create a collection
		List<String>K=new ArrayList<String>();
		
		K.add("yu");
		K.add("abu");
		K.add("bab");
		K.add("kar");
		K.add("raj");
		
		
		//create a integer based collection and check the even and odd numbers
		//using lambda and stream
		
		//I would like to count the number of elements present in the list
		//without stream implementation
		int count=0;
		for(String ele:K) {
			if(ele.length()<=6);
			count++;
		}
		System.out.println("there are :"+count+"String with length less the 6");
		System.out.println("-------------------------------------");
		//lets apply straem now using lambda expression
		int number=(int) K.stream().filter(ele->ele.length()<6).count();
		System.out.println("there are :"+number +"String with length less than 6");

	}

}
