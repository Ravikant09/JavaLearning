
package programs.java;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("read two number and display its remainder without using% operator");
		System.out.println("enter a and b value");
	 int a =sc.nextInt();
	 int b=sc.nextInt();
	 int rem= a-(a/b)*b;
	 System.out.println("remainder"+rem);
		
		
	}

}
