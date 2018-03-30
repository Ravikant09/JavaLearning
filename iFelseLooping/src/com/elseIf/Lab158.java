package com.elseIf;

import java.io.IOException;
import java.util.Scanner;

public class Lab158 {

	public static void main(String[] args) throws IOException {
		System.out.println("for loop");
		System.out.println("enter the value");
	
		char ch=(char)System.in.read();
		for(int i=1; i<=ch;i++){
			for(int j=1; j<=i;j++){
				System.out.print(ch);
				ch++;
		}
			System.out.println();
		}

	}}
