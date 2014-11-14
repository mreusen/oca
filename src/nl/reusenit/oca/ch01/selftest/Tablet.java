package nl.reusenit.oca.ch01.selftest;

interface Gadget {
	void doStuff();
}

abstract class Electronic {
	void getPower() {
		System.out.println("power");
	}
}

public class Tablet extends Electronic implements Gadget {
	public void doStuff() {										// must be PUBLIC !!!
		System.out.println("show book");
	}

	public static void main(String[] args) {
		new Tablet().doStuff();
	}

}
