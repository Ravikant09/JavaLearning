package programs.java;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
	System.out.println("display no. of digits");
	System.out.println("enter a no.");
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	while(n!=0){
	int digit= n%10;
	System.out.println(digit);
	n=n/10;
	

	}
	}
}
