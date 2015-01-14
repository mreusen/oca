package nl.reusenit.oca.ch03.variableinit;

import java.awt.Dimension;

public class AssigningOneRefVarToAnother {

	public static void main(String[] args) {

		Dimension a1 = new Dimension(5,10);
		System.out.println("a1.height = " + a1.height);
		
		Dimension b1 = a1;
		b1.height = 30;
		System.out.println("a1.height = " + a1.height + " after change to b");
		
		String x = "Java";
		String y = x;								// Both refers to the same String object
		
		System.out.println("y String = " + y);
		x = x + "Bean";								// changes only the object x refers to!!!!!
		/*
		 * For any other object where 2 references refer to the same object, 
		 *   both references see the changes because there is only a single object
		 * When change the String object, the VM will update the reference variable
		 *   to refer to a DIFFERENT object!!!!
		 */
		System.out.println("y String = " + y);
		System.out.println("x String = " + x);
		
		
		String s = "Fred";
		String t = s;
		t.toUpperCase();						// Produces a brand new String object
												//   which isn't assigned to a String variable
		/*
		 * So 2 objects where created, only 1 is referenced and s and t refer to it!!!!
		 */
		System.out.println("s = " + s);			// produces Fred
		System.out.println("t = " + t);			// produces Fred
		
		t = s.toUpperCase();
		System.out.println("s = " + s);			// produces Fred
		System.out.println("t = " + t);			// produces FRED
	}

}
