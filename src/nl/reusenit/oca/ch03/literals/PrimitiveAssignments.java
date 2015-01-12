package nl.reusenit.oca.ch03.literals;

public class PrimitiveAssignments {

	public static void main(String[] args) {
		
		PrimitiveAssignments p = new PrimitiveAssignments();
		p.go();
	}

	public void go() {
		int x = 7;			// primitive assignment
		int y = x + 2;		// primitive assignment with an expression
		int z = x * y;
		
		byte a = 27;
		byte b = 7;
		/*
		 * byte c = a + b;		not possible without a cast
		 */
		byte c = (byte) (a + b);
		
	}
}
