package programs.java;

import java.io.IOException;

public class Test6 {
public static void main(String arg[]) throws IOException{
	System.out.println("to read a char and check uppercase lower case digit special");
	System.out.println("enter  a character");
	char ch =(char)System.in.read();
	if(ch>=65&&ch<=90)
		System.out.println("character is upper case"+ch);
	else if (ch>=97&&ch<=122)
		System.out.println("character is lower case"+ch);
	else if (ch>=48&&ch<=57)
	System.out.println("character is digit"+ch);
	else 
		System.out.println("character is special"+ch);
		
			
}
}
