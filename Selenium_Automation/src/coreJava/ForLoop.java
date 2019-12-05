package coreJava;

public class ForLoop {
	public static void main(String args[]) {
		//for(initilize the variable;condition;increment/decrement)
		for (int i = 21; i > 4; i++) {
			System.out.println("the value of i is: " + i);
			
			if(i>30) {
				break;
			}
		}
		
		//Nested For loop: loop with in the loop
		for (int i = 0; i < args.length; i++) {
			
			for (int j = 0; j < args.length; j++) {
				
			}
		}
		
		
	}

}
