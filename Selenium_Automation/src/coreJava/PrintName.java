package coreJava;

public class PrintName {
	public static void product() {

		int x = 10;
		int y = 8;
		int z = x * y;
		System.out.println("the product is ");
		System.out.println(z);
		
			
	}
	
	public static void add() {
		int x = 15;
		int y = 8;
		int w=x+y;
		System.out.println("the sum is ");
		System.out.println(w);
}
	public static void difference() {
		int x=50;
		int y=20;
		int u=x-y;
		System.out.println("the difference is");
		System.out.println(u);
	}

	public static void main(String[] args) {
		System.out.println("My name is Shriya");
		product();
		add();
		difference();
	}
}