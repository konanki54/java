package com.bct.java8features.methodreferances;


	import java.util.ArrayList;
	import java.util.List;



	public class Assignments {



	   public static void main(String[] args) {
	        List<Integer> re=new ArrayList<Integer>();
	        re.add(12);
	        re.add(24);
	        re.add(42);
	        re.add(64);
	        re.add(90);
	        //using lambda
	       for(int data:re) {
	           if(data%2==0) {
	               System.out.println("even num "+data);
	           }else {
	               System.out.println("odd num "+data);
	           }
	       }
	        
	    }



	}


