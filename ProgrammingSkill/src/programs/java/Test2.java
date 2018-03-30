package programs.java;

import java.util.Scanner;

public class Test2 {
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("to read two number and display its quotient with out using /operator");
	System.out.println("enter no. for division");
	int a= sc.nextInt();
	int b= sc.nextInt();
	int quotient=0;
	while (a>=b){
		a-=b;
		quotient++;
	}
	System.out.println("quotient is"+ quotient);
	
	}

}
