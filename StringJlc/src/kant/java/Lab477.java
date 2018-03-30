package kant.java;

public class Lab477 {
public static void main(String arg[]){
	String str="jlc india";
	System.out.println("convert string to byte");
	byte bt[]=str.getBytes();
	System.out.println("byte array");
	for(int i=0;i<bt.length;i++){
		byte b=bt[i];
		System.out.println(i+"\t"+b+"\t"+(char)b);
	}
}
}
