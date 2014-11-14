package nl.reusenit.oca.ch01.enums;

// conceptual example of how you can think
// about enums

class CoffeeSizeClass {

	public static final CoffeeSizeClass BIG = new CoffeeSizeClass("BIG", 0) ;

	public static final CoffeeSizeClass HUGE = new CoffeeSizeClass("HUGE", 0) ;

	CoffeeSizeClass (String enumName, int index) {
		// stuff here
	}
	
	public static void main(String[] args) {
		System.out.println(CoffeeSizeClass.BIG);
	}

}
