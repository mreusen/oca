package nl.reusenit.oca.ch01.enums;

class Coffee2 {
	enum CoffeeSize2 { BIG, HUGE, OVERWHELMING};	// enum inside class
													// semicolon is optional here
	CoffeeSize2 size;
}

public class CoffeeTest2 {

	public static void main(String[] args) {
		Coffee2 drink = new Coffee2();
		drink.size = Coffee2.CoffeeSize2.HUGE;		// enclosing class name required
	}

}
