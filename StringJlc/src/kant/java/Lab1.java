package kant.java;
class lab1{
	public static void main (String arg []){
		String str= "jlc";
		String  temp = str;
		System.out.println(str);
		str= "jlc";
		System.out.println(str);
		System.out.println(str == temp);
		System.out.println("*********");
		Hello h1= new Hello (10,20);
		Hello t1=h1;
		System.out.println(h1);
		h1 =new Hello(35,76);
		System.out.println(h1);
		System.out.println(h1);
		System.out.println(h1==t1);
	}}
final class Hello{
	 final int x;
	 final int y;
	Hello (int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
	
		return x+"\t"+y;
	
		
	}
}