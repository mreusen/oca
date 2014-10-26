package nl.reusenit.oca.ch01;

public class ProtectedMethodClass {

	protected int x = 9;
	
	protected void testProtectedMethod() {
		System.out.println("test ok");
	}
	
	public void visibleMethod() {
		System.out.println("visible everywhere");
	}

}
