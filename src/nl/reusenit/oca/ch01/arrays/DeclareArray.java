package nl.reusenit.oca.ch01.arrays;

public class DeclareArray {

	int[] key;		// square brackets before identifier (variable name)
	int [] k = new int[4];
	int keys [];	// legal but less readable, not recommended
	
	String[][][] dim3;
	Thread[] threads;
	
	String[] managerName[];		// legal but not recommended
	
	public void addKey(int index, int number) {
		key[index] = number;
		k[3] = 5;
	}
	
}
