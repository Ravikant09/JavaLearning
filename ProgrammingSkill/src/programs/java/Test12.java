package programs.java;

import java.util.Scanner;

public class Test12 {
public static void main(String[] args) {
	System.out.println("print n natural even no.");
	System.out.println("enter a no.");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1; i<=n; i++)
		if (i%2==0){
			System.out.println(i);
}
}
}