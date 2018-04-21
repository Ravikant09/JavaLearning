package alangPackage;

public class Tostring {

	public static void main(String[] args) {
		Student5 st1= new Student5(99,"sei");
System.out.println(st1);
System.out.println("\n  Default implementation ");
String cname=st1.getClass().getName();
int hc=st1.hashCode();
String hx=Integer.toHexString(hc);
String msg=cname+ "@"+hx;
System.out.println(msg);
	}}
class Student5{
	int sid;
	String name;
	Student5(int sid, String name){
		this.sid=sid;
		this.name=name;

	}

}
