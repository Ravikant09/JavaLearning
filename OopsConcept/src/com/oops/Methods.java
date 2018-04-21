package com.oops;

public class Methods {

	public static void main(String[] args) {
	Test h=null;
	Test.show();
	h=new Test();
	Test.show();
	Test.show();
	}
	}
class Test{
	static void show(){
		System.out.println("static show");
	}
}
