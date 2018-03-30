package kant.java;
public class lab1a3{
	  
	public static void main(String arg[]){
		System.out.println("main started");
		String st1=new String ("JLCINDIA");
		
		char ch[]= new char[st1.length()];   
		for (int i=0;i<st1.length();i++){
			ch[i]=st1.charAt(i);
//			for(int r=0;r<st1.length();r++){
				System.out.println(ch[i]);
				
//			}
		}
		
	}
}
