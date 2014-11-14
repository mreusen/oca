package nl.reusenit.oca.ch01.interfaces;

public interface DeclareInterface {

	// Interface variables are by default PUBLIC, STATIC and FINAL
	// the order doesn't matter, the  MODIFIERS are NOT REQUIRED 
	public static final int num = 4;
	public final static int nr = 4;
	static public final int numberr = 4;
	public final int number = 4;
	int anyNumber = 9;
	/* constants must be initialized
	 * int number;		/ not allowed, must be initialized
	 */
	
	// Interface method's are by default PUBLIC and ABSTRACT
	// the declaration of these modifiers is OPTIONAL
	public abstract void method1();
	public void method2();
	abstract void method3();
	
	void method4 ();	// 
}

interface Interface1 {
	
	int doStuff();
	/*
	 * doStuff()	/ return type is REQUIRED
	 */
}

// Interface can extend more than 1 interface
interface Interface2 extends DeclareInterface, Interface1 {

	int doMoreStuff();	
}

abstract class AbstractClass {
	
	int number;
	
	void nonAbstractStuff() {
		// any code goes here
	}

	abstract int doAbstractStuff();
}

class ClassUseInterface extends AbstractClass implements Interface2 {

	int doAbstractStuff() {
		return 9;
	}
	
	void doClassStuf() {
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int doStuff() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doMoreStuff() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}