package nl.reusenit.oca.ch01.nonaccesmodifiers;

public abstract class LegalClass {

	public abstract void doIt();   // method abstract, then Class must also be abstract
	
	public void legalMethod() {    // non-abstract metod in abstract Class -> no problemos
		
	}
}
