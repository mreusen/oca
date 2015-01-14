package nl.reusenit.oca.ch03.literals;

public class PrimitiveAssignments {

	public static void main(String[] args) {
		
		PrimitiveAssignments p = new PrimitiveAssignments();
		p.go();
		p.goCasting();
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
	
	public void goCasting() {
		int x = (int) 3.75;		// legal cast
		System.out.println("int x = " + x);
		
		long l = 130L;
		byte b = (byte) l;		// value is larger then 127
		System.out.println("byte b = " + b);
		
		float f = 234.56F;
		short s = (short) f;	
		System.out.println("short s = " + s);
		
		byte b1 = 7;
		b1 += 3;
		/*
		 *     /=  *=  -=  +=  will all put an implicit cast
		 */
		System.out.println("byte b1 = " + b1);
		
		byte b2 = 6;
		b2 = (byte) (b + 3);	// won't compile without a cast, b + 3 results in a int
		System.out.println("byte b2 = " + b2);
	}
}
