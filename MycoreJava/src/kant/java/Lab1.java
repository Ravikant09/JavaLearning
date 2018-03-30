


package kant.java;

public class Lab1 {
	public static void main(String arg[]) {
		showClassinfo("JLC");

		Student1 stu = new Student1();
		showClassinfo(stu);
		Object obj = new Object();
		showClassinfo(obj);

	}

	static void showClassinfo(Object obj) {
		Class cls = obj.getClass();
		System.out.println("class name" + cls.getName());
		Class scls = cls.getSuperclass();
		if (scls != null)
			System.out.println("super class" + scls.getName());
		else
			System.out.println("no superclass");
	}
}

class Person {
}

class Student1 extends Person {
}