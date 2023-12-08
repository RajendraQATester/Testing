package com.UserdefinedMethods;

public class MethodsExample2 {
	// Method names should be always Unique
	public void addition()
	{
	
	int var1=30;
	int var2=50;
	int var3;
	var3=var1+var2;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3);
	}
	public static void main(String[] args) {

	MethodsExample2 m2 = new MethodsExample2();
	m2.addition();
	System.out.println();

	m2.subtraction();

	}

	public void subtraction()
	{
	int var1=30;
	int var2=50;
	int var3;

	var3=var1-var2;
	System.out.println(" The value of the variable var3 after Subtraction is :- "+var3);
	}


	}

	
