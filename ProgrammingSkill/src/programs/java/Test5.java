package programs.java;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
	System.out.println(" whether leap year or not");
	Scanner sc= new Scanner(System.in);
	int year=sc.nextInt();
	if ((year%400==0)||((year%4==0)&&year%100!=0)){
		System.out.println("YEAR"+year+"is the leap year");
	}else{
		System.out.println("year"+year+"not leap year");
	}

	}

}
