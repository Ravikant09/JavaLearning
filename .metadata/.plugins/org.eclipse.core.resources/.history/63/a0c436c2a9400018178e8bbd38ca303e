package alangPackage;

public class Equals2 {

	public static void main(Student7[] args) {
		Student7 st1= new Student7 (88,"sri");
		Student7 st2=  new Student7(88,"sri");
		Student7  st3 =new Student7 (99,"ravi");
		System.out.println("using==op");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println("using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));
		
		
	}

}
class Student7{
	String name;
	int no;
 Student7( int no,String name) {
		this.name =name;
		this.no=no;
}
public  boolean equals(Object obj){
	if (obj instanceof Student7){
		Student7 st=(Student7)obj;
		return this.no==st.no && this.name.equals(st.name);
	}
	return false;
	
		
	}
}











