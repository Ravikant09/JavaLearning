package com.oops;

public class MethodOverloading {
public static void main(String[] args) {
	Ravi h=new Ravi();
			int a=h.add(10,20);
	System.out.println("ddd"+a);
int b=	h.add(10, 20,30);
	System.out.println(b);
	
	
}
}
 class Ravi{
	 int add(int a,int b){
		 System.out.println("add(int,int)");
		 return a+b;
	 }
 int add(int a, int b, int c){
		 System.out.println("add(int,int,int)");
		 return a+b+c;
		 
 }
 }