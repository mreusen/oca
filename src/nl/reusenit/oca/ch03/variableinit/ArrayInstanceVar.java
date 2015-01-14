package nl.reusenit.oca.ch03.variableinit;

public class ArrayInstanceVar {

	static int [] year = new int[100];
	
	public static void main(String[] args) {

		for (int i = 0;i<100;i++) {
			System.out.println("year[" + i + "] = " + year[i]);
		}

	}

}
