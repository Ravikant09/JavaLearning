package programs.java;

import java.util.Scanner;

public class Test1 {

public static void main (String arg[]){
	
	
	Scanner sc= new Scanner(System.in);
	System.out.println("read two no. and display the sum without using + operator");
System.out.println("enter a no. to be added");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	int carry;
	while (b!=0){
		carry =a&b;
		a=a^b;
		b=carry<<1;
	}
	System.out.println("sum is "+ a);
	
	}
}

















