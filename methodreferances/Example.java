package com.bct.java8features.methodreferances;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		 //Create a collection
        String[] stringarr= {
                "yuu","ko","mm","bgy"
        };
       /*
        * method reference to an instance method of an arbitary object of a particular tyoe
        */
        Arrays.sort(stringarr,String::compareToIgnoreCase);
        for(String data:stringarr) {
            System.out.println(data);
        }
        
    }

	public void newmethod() {
		// TODO Auto-generated method stub
		
	}

	public void existingMethod(String string) {
		// TODO Auto-generated method stub
		
	}



}

