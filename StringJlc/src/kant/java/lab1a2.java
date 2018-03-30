package kant.java;
public class lab1a2{
public static void main(String []arg){
	String st1="jlc";
	String st2="india";
	String st3=(st1+st2).intern();
	String st4= (st1+"india").intern();
	String st5 =("jlc"+ st2).intern();
	System.out.println(st3+"\t"+st4+"\t"+st5);
	System.out.println(st3==st4);
	System.out.println(st3==st5);
	System.out.println(st4==st5);
}
}