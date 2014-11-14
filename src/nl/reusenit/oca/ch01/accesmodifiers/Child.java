package nl.reusenit.oca.ch01.accesmodifiers;

public class Child extends Parent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child sc = new Child();
		sc.testIt();		
		staticMethod();
//		nonStaticMethod();  // not possible in a static method
	}

	public void testIt() {
		System.out.println("Variable x is " + x);
		staticMethod();
		nonStaticMethod();
	}
}
