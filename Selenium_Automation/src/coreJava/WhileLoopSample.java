package coreJava;

public class WhileLoopSample {
	public static void main(String[] args) {
		int i=10;
		while (i>0) {
			System.out.println(i);
			i++;
			if (i>10) {
				break;
			}
		}//end of while loop
//		
//		//do while loop
//		do {
//			System.out.println(i);
//			i--;
//		} while (i>0);
	}

}
