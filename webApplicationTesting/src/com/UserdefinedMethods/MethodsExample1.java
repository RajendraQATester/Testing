package com.UserdefinedMethods;

public class MethodsExample1 {


	// * User defined Methods are created for Re-Usability Purpose

	// User Defined Method
	// User defined methods can be created either Above the Main Method OR below the Main method
	// User defined Methods should never be created within the Main Method

	public void rajii()
	{
	System.out.println(" Rajendra is a Functional Test lead ");
	}

	public static void main(String[] args)
	{
	// The execution Process always starts from the Main method
	// Creating an Object for the Current Class
	MethodsExample1 hello = new MethodsExample1();
	hello.rajii(); // using the Object - calling the User defined Method
	System.out.println();

	// MethodExample1 test = new MethodExample1();
	// test.rajii();

	hello.shamu();

	}
	public void shamu()
	{
	System.out.println(" Shamu is Functional Automation Test Lead ");
	System.out.println();
	System.out.println(" Rajii is Functional Automation Test Engineer ");
	}

	}


	
