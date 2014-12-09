package nl.reusenit.oca.ch02.initializationblocks;

public class Init {					// class Init has 2 oaverloaded constructors

	Init() {											// no-arg constructor
		System.out.println("no-arg constructor");
	}

	Init(int x) {										// 1-arg constructor
		System.out.println("1-arg constructor");
	}

	static {											// static init-block runs once
		System.out.println("1. static init-block");
	}

	{System.out.println("1. instance init-block");}		// instance init-block runs everytime
														//  a new instance is created

	static {
		System.out.println("2. static init-block");
	}

	{System.out.println("2. instance init-block");}

	public static void main(String[] args) {
		Init i1 = new Init();
		Init i2 = new Init(7);
	}

}
