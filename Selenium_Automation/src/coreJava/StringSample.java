package coreJava;

public class StringSample {

	public static void main(String args[]) {
		for (int i = 10; i > 5; i--) {
			System.out.println("the value of i is " + i);
		}

		String abc;
		abc = "Shriya";

		String xyz = "Selenium";

		System.out.println(abc);
		System.out.println(xyz);
		System.out.println(abc + " " + xyz);

		System.out.println(abc.toUpperCase());
		System.out.println(xyz.toLowerCase());
		// length / Index
		System.out.println(abc.length());
		System.out.println(abc.charAt(4));
		// System.out.println(xyz.getChars(0,7,'e',2));System.out.println(xyz.getChars(0,7,'e',6));;

		String a = "Apple";
		String b = "apple";

		if (a.equalsIgnoreCase(b)) {
			System.out.println("both the String are equal");
		} else {
			System.out.println("both the String are NOT equal");
		}
		if (a.contains("le")) {
			System.out.println("matching");
		} else {
			System.out.println("NOT matching");
		}
	}
}
