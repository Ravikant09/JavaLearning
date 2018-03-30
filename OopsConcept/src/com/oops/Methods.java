package com.oops;

public class Methods {

	public static void main(String[] args) {
	Test h=null;
	h.show();
	h=new Test();
	h.show();           
	Test.show();
	}
	}
class Test{
	static void show(){
		System.out.println("static show");
	}
}
