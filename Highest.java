package highest;
//Package is a grouping of related types providing access protection and name 
//space management
import java.util.Scanner;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions

public class Highest {
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
	//Highest is class name. Java is case in-sensitive which means identifier Hello and hello would different meaning in Java	

	public static void main(String[] args) {
//Java Program processing starts from the main() method which is a mandatory part of every program 		
//static used to prepare a field,method or inner classes as a class field.
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here

		// TODO Auto-generated method stub
		int x,y,z,a;//declaring a  value to the integer and x,y,z,a holds the values
		//to initialize values we have take the variables

		System.out.println("Enter the three numbers");
//System is a final class in java.lang package
//out is a static member field of system class and it's type PrintStream
//println is a method of PrintStream class and it means print in next line
//Inside the brackets is value which to be printed		

		Scanner in=new Scanner(System.in);
	//to scan values which we initialize
		x=in.nextInt();//scans next token of the input as int
		y=in.nextInt();//scans next token of the input as int
		z=in.nextInt();//scans next token of the input as int
		a=z>(x>y?x:y)?z:((x>y)?x:y);
		//we use ternary operator to find largest number
		//returns one of two values depending on the value of a boolean expression 
		System.out.println("Print numbers:"+a);
	}

}
