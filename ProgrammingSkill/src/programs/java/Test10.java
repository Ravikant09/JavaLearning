package programs.java;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		System.out.println("print sum of n even number");
		System.out.println("enter a no.");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++){
			if(n%2==0){
				sum =sum+i;
				System.out.println("sum"+sum);
			}
		}

	}

}
