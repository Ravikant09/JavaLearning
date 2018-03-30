package com.oops;

public class MethodOverloading2 {
public static void main(String[] args) {
	Hai3 h= new Hai3();
	int a=h.add(10,20);
	System.out.println(a);
	String b=h.add("jlc",99);
	System.out.println(b);
	
 }
 }
class Hai3{
	int add(int a,int b){
		System.out.println("add(int,int)");
		return a+b;
	}
	String add(String a, int b){
		System.out.println("add(String,int)");
		return a+b;
	}
}