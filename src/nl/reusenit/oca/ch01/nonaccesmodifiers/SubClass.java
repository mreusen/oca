package nl.reusenit.oca.ch01.nonaccesmodifiers;

public class SubClass extends SuperClass {

//	public void showSample() {   can't override the final SuperClass method
		
//	}
	
	// this is not a override, but an oaverloaded method (same identifier but different arguments)!!
	public void showSample(String s) {
//		privateMethod();   not visible in subclass
	}
}
