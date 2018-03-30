package com.oops;

public class MethodParameter2 {
public static void main(String[] args) {
	 Hai h=new Hai();
	 byte b=12;
	 h.show(b);
	 h.show((byte)12);
	 
}
}
class Hai{
	void show(byte x){
		System.out.println("show (byte)");
		
	}
}