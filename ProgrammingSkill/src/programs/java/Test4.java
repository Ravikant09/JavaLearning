package programs.java;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" first n natural number");
		System.out.println(" enter no.");
		int n= sc.nextInt();
		if(n>=1){
			for(int i =1;i<=n; i++){
				System.out.println(""+n);
			}
		}

	}

}
