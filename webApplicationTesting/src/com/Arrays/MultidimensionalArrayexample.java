package com.Arrays;

public class MultidimensionalArrayexample {
	public static void main(String[] args) {
		String array1[][] = new String[3][3];

		array1[0][0] = "Rajendra";
		array1[0][1] = "Good Boy";

		array1[1][0] = "Sai Krishna";
		array1[1][1] = " Best Friend " ;

		array1[2][0] =" Sampath ";
		array1[2][1] =" Best Friend ";

		/*
		System.out.println(array1[0][0]);
		System.out.println(array1[0][1]);

		System.out.println(array1[1][0]);
		System.out.println(array1[1][1]);
		*/

		for(int rowIndex=0;rowIndex<=2;rowIndex++)
		{

		for(int rowOfCellIndex=0;rowOfCellIndex<=1;rowOfCellIndex++)
		{
		System.out.println(array1[rowIndex][rowOfCellIndex]);
		}

		}

		System.out.println(" ####################### ");

		for(int rowIndex=0;rowIndex<array1.length;rowIndex++)
		{

		for(int rowOfCellIndex=0;rowOfCellIndex<array1.length;rowOfCellIndex++)
		{
		System.out.print(array1[rowIndex][rowOfCellIndex]);
		}

		System.out.println();

		}
		}

			}

