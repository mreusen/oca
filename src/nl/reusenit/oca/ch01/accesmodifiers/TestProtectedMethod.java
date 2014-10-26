package nl.reusenit.oca.ch01.accesmodifiers;

import nl.reusenit.oca.ch01.ProtectedMethodClass;

public class TestProtectedMethod extends ProtectedMethodClass {

	public void useProtectedMethod () {
		// testProtectedMethod is protected, only access by subclass
		this.testProtectedMethod();
		System.out.println("x = " + x);
	}

	public void otherMethod() {
		
		ProtectedMethodClass pm = new ProtectedMethodClass();
		/* no access to testProtectedMethod() using a reference
		pm.testProtectedMethod();
		*/
		// public method is visible
		pm.visibleMethod();
		
		// Child inherits protected variable x
		System.out.println("x = " + x);
	}
}
