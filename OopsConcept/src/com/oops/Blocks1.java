package com.oops;

public class Blocks1 {

	public static void main(String[] args) {
		System.out.println(Hello1.a);
	}

}
class Hello1{
	static int a;
	{
		a=10;
		System.out.println(a);
	}
}