package com.oops;

class Constructors {
 
	public static void main(String[] args) {
	
	Student stu1=new Student(99,"sri","sri@gmail",99999);
	stu1.show();
	Student stu2=new Student(88,"vas","vas@gmail");
	stu2.show();
	Student stu3=new Student(77,"sd");
	stu3.show();
	Student stu4=new Student();
	stu4.show();
	
	}}	
class Student{
	int sid;
	String sname;
	String email;
	long phone;
	 Student(int sid, String sname, String email, long phone) {
		
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		System.out.println("student 4 arg");
	}
	Student(int sid, String sname, String email) {
		
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		System.out.println("student 3 arg");
	}
	Student(int sid, String sname) {
		
		this.sid = sid;
		this.sname = sname;
		System.out.println("student 2 arg");
	}
     Student(int sid) {
		
		this.sid = sid;
		System.out.println("student 1 arg");
	}
	Student() {
		System.out.println("student 0 arg");	
	}
	
	void show(){
		System.out.println(sid+"\t"+sname+"\t"+email+"\t"+phone);
	}
	
}