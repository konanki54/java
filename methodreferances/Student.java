package com.bct.java8features.methodreferances;

import java.util.function.BiFunction;



interface movie{
    //A method-abstract method
    public void disp();
}



class Addition {
    static int addition(int num1,int num2) {
        return num1+num2;
    }
}





public class Student {
    public void mymethod() {
        System.out.println("Instance method");
        System.out.println("-------------I have been referen----------------");
    }



   public static void main(String[] args) {
        //creating object to class--STudent
        Student ref=new Student();
      //method reference using to create object to class--Myinterface
        Myinterface rr=ref::mymethod;
        //calling the method of function interface
        rr.disp();
        //create an object to class Addition
        BiFunction<Integer,Integer,Integer> addition=Addition::addition;
        int sum=addition.apply(11,3);
        System.out.println(sum);
        



   }



}