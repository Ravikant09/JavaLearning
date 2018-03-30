package com.elseIf;

public class Whileloop4 {

	public static void main(String[] args) {
char ch='a';
int rows=0;
do{
	int cols=0;
	do{
		System.out.print(ch+"");
		cols++;
		
	}while(cols<=rows);
	System.out.println();
	rows++;
	
	}while(rows<5);

	}
	
	
}