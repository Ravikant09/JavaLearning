package kant.java;

public class Lab1a1 {

	public static void main(String[] args) {

		ftudent stu = new ftudent();

		stu.show();
	}
}

class ftudent {
	int sid;
	String sname;

	ftudent(int sid, String sname) {
		System.out.println("student 2 arg con");
		this.sid = sid;
		this.sname = sname;
	}

	ftudent() {
		System.out.println("student default con");
	}

	void show() {
		System.out.println(sid + "\t" + sname);

	}

}
