package alangPackage;

public class Equals {

	public static void main(String[] args) {
		String st1= new String ("sri");
		String st2=  new String("sri");
		String  st3 =new String ("ravi");
		System.out.println("using==op");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println("using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));
	}

}
