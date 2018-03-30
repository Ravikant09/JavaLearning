package kant.java;

public class Lab1a{
public static void main (String [] arg){
	String st1="jlc";
	String st2=new String ("jlc");
	

	String st3=st2.intern();
System.out.println(st1==st2);
System.out.println(st1==st3);
System.out.println(st2==st3);
System.out.println();
String st4="ok".intern();
String st5="ok";
System.out.println(st4==st5);

}}
