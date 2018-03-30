package com.elseIf;

import java.io.IOException;
import java.util.Scanner;

public class Lab160 {

	public static void main(String[] args) throws IOException {
		System.out.println("for loop");
		System.out.println("enter the value");
	
		char ch='a';
		for(int i=1; i<=5;i++){
			for(int j=4; j>=i;j--){
				System.out.print(ch);
				ch++;
		}
			System.out.println();
		}

	}}
