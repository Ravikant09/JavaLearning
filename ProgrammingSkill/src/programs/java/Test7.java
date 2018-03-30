package programs.java;

import java.util.Scanner;

public class Test7 {
	
	public static void main(String[] args) {
	System.out.println("sum of the first n natural no.");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a no.");
	int sum=0;
	int n= sc.nextInt();
	if (n>=1){
	for(int i=0; i<=n; i++){
	sum=sum+i;
	System.out.println("sum"+sum);
	}
	}
	}
}
