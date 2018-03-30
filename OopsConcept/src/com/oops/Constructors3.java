package com.oops;

class Constructors3 {
 
	public static void main(String[] args) {
	
	Student2 stu1=new Student2(99);
	stu1.show();
	
	
	}}	
class Student2{
	int a;
	
	
	 Student2() {
		
	
		
		System.out.println("Student2 4 arg");
	}
	Student2(int a){
		this();//(this is called constructor chaining)
		System.out.println("hello");
		this.a=a;
		
	}
	
	void show(){
		System.out.println(a);
	}
	
}