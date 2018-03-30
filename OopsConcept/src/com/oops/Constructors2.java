package com.oops;

class Constructors2 {
 
	public static void main(String[] args) {
	
	Student1 stu1=new Student1(99,"sri");
	stu1.show();
	Student1 stu2=new Student1(88,"vas");
	stu2.show();

	
	}}	
class Student1{
	int sid;
	String sname;
	String email;
	
	 Student1(int sid, String sname) {
		
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		
		System.out.println("Student1 4 arg");
	}
	
	
	void show(){
		System.out.println(sid+"\t"+sname);
	}
	
}