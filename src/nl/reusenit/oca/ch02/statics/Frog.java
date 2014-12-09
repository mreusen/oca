package nl.reusenit.oca.ch02.statics;

public class Frog {

	static int count = 0;		// declare and initialize static variable
								// initialize is not necessary

	Frog() {
		count += 1;
	}

	Frog(int x) {
		count += 1;
	}

	public static void main(String[] args) {
		new Frog();
		new Frog(25);
		System.out.println("count = " + count);			// access the static variable
		System.out.println("count = " + Frog.count);	// also possible
	}

}
