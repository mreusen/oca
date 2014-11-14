package nl.reusenit.oca.ch01.enums;

import static java.lang.System.*;

enum CoffeeSize3 {
					// 8, 10 & 16 are passed through the constructor
	BIG(8),			// BIG(8) invokes the CoffeeSize3 constructor
	HUGE(10), 
	OVERWHELMING(16) {
		public String getLidCode() {		// override the method
			return "B";						// defined in enum CoffeeSize3
		}
	};		// semicolon is REQUIRED when more code follows

	CoffeeSize3(int ounces) {				// constructor
		this.ounces = ounces;
	}
	private int ounces;						// an instance variable
	public int getOunces() {
		return this.ounces;
	}
	
	public String getLidCode() {
		return "A";
	}
}

public class Coffee3 {
	CoffeeSize3 size;						// each instance of Coffee3 has an enum
	public static void main(String[] args) {
		Coffee3 drink = new Coffee3();
		drink.size = CoffeeSize3.BIG;
		Coffee3 drink1 = new Coffee3();
		drink1.size = CoffeeSize3.HUGE;
		Coffee3 drink2 = new Coffee3();
		drink2.size = CoffeeSize3.OVERWHELMING;

		out.println("ounces of " + drink.size + " is " + drink.size.getOunces());
		for (CoffeeSize3 cs: CoffeeSize3.values())
			out.println(cs + " " + cs.getOunces() + " " + cs.getLidCode());		
	}

}
