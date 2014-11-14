package nl.reusenit.oca.ch01.nonaccesmodifiers;

public final class FinalClass {

	String text;
}

/*
class FinalClassClient extends FinalClass {		// FinalClass cannot be subclassed
	FinalClass fc = new FinalClass();
}
*/

class Classie {
	FinalClass fc = new FinalClass();			// FinalClass can be instantiated
}

