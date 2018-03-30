package kant.java;

import java.util.Scanner;

public class Lab1a1{
	public static void main (String arg[]){
		String st1="jlc";
		Scanner sc = new Scanner(System.in);
	System.out.println("enter jlc string");
	String st3= sc.nextLine();
	System.out.println("re enter jlc string ");
	String st4=sc.nextLine();
	String st5=st3.intern();
	String st6=st4.intern();
	System.out.println(st3==st4);
	System.out.println(st5==st6);
	System.out.println(st1==st5);
	
		
	}
}