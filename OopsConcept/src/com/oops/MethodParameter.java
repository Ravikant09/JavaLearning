package com.oops;

public class MethodParameter {
public static void main(String[] args) {
	 Hai1 h=new Hai1();
	 h.show('b');
	 h.show((char)66);
	 
}
}
class Hai1{
	void show(char x){
		System.out.println("show (char)");
		
	}
}