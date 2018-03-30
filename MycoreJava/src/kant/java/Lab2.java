package kant.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ravi", "Verma", "Anmol", "ravi");
		List<String> namefilter = list.stream().filter(s -> s.equals("ravi")).collect(Collectors.toList());
		for (String names : namefilter) {
			System.out.println(names);
		}
	}
}
