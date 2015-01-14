package nl.reusenit.oca.ch03.garbagecollection;

public class GarbageTruck {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		// The StringBuffer object is not eligible for collection
		sb = null;
		// Now the StringBuffer object is eligible for collection
		
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("Goodbye");
		System.out.println(s1);
		// At this point the StringBuffer "Hello" is not eligible for collection
		s1 = s2;		// Redirect s1 to refer to the "Goodbye" object
		// Now the StringBuffer "Hello" is eligible for collection
		
	}

}
