package com.oops;

public class Overriding {
public static void main(String[] args) {
	
	
	H2 h=new H2();
		h.add1();
		
		
		
	}}

	class H1 {
		void add1() {
			System.out.println("hello1");

		}
	}

	class H2 extends H1{
			void add1(){
				System.out.println("hello2");
			}
		}
