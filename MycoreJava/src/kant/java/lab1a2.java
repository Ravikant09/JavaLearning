package kant.java;
class lab1a2 {

	public static void main(String[] args) {
Student st1 =new Student(99,31244555);
Student st2= new Student(99,31244555);
Student st3= new Student(26,75894849);
Student st4=st1	;
	System.out.println(st1.hashCode());
System.out.println(st2.hashCode());
System.out.println(st3.hashCode());

System.out.println(st4.hashCode());
System.out.println(st1==st2);
System.out.println(st1==st3);
System.out.println(st1==st4);	
System.out.println(st3==st4);
	}}
class Student{
	int sid;
	long phone;
	Student(int sid,long phone){
		this.sid=sid;
		this.phone=phone;
		
	}}
	
