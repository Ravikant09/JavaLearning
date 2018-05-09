package com.oops;

public class Blocks2 {

	public static void main(String[] args) {
		System.out.println(Hello2.a);
	}

}
class Hello2{
	static int a;
	static{
		a=10;
		System.out.println(a);
	}
}