package nl.reusenit.oca.ch03.scope;

public class Layout {

	static int s = 343;						// static variable
	int x;									// instance variable
	{int x = 7; int x2 = 5;}				// initialization block
											//  x2 is an init block variable, a flavor of local variable
	Layout() {								// constructor
		x += 8;		
		int x3 = 6;							//  x3 is an constructor block variable, a flavor of local variable
	}
	
	void doStuff() {						// method
		int y = 0;							// local variable
		for( int z = 0; z < 4; z++) {		// 'for' code block
			y += z + x;
			System.out.println("y = " + y);
		}
	}
	
	public static void main(String[] args) {
	
		Layout l = new Layout();
		l.doStuff();

	}

}
