package nl.reusenit.oca.ch03.literals;

public class Literals {

	public static void main(String[] args) {

		/*
		 * byte 8 bits, short 16 bits, int 32 bits and long 64 bits
		 * float 32 bits, double 64 bits
		 * floating point literals (f.e. 12345.3) are defined as double (64 bits)
		 * char 16 bits, 2^16 = 65535
		 */
		
		Literals l = new Literals();
		l.decimalLiterals();
		l.binaryLiterals();
		l.octalLiterals();
		l.hexLiterals();
		l.longLiterals();
		l.floatLiterals();
		l.doubleLiterals();
		l.charLiterals();
		l.byteLiterals();
	}

	public void binaryLiterals () {
		int b1 = 0b10;
		int b2 = 0B10011;
		// int b3 = 12.5;						no decimals!!!!
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
	}

	public void byteLiterals () {
		byte b1 = 27;
		byte b2 = (byte) 27;
		byte b3 = 127;							// max value 2^7, 
												//  first bit is representing the sign
		// byte b4 = 128;						cast is needed
		byte b4 = (byte) 128;					// = -128 + (128 - 128) = -128
												//   or 10000000 flipping gives 01111111
												//   add 1 gives 10000000 -> -128
		byte b5 = (byte) 144;					// = -128 + (144 - 128) = -112
		byte b6 = (byte) 258;					// = -128 + (258 - 128) = +2
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		System.out.println("b5 = " + b5);
		System.out.println("b6 = " + b6);
	}

	public void charLiterals () {
		char c1 = '@';
		char c2 = '\u004e';					// Unicode, Letter 'N' (e = E)
		char c3 = 123;
		char c4 = (char)70000;				// needs a cast, out of char range (0 - 65536)
		char c5 = (char)-98;				// also legal
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
	}

	public void decimalLiterals () {
		int i1 = 10;
		int i2 = 100_000;					// int literal 100.000, Java 7 declaration
		int i3 = 32768;
		int i4 = 32769;
		int x = 'b';						// allowed!!
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);
		System.out.println("x = " + x);
	}

	public void doubleLiterals() {
		double d1 = 12345.67;
		double d2 = 123.45d;				// optional, not required
		double d3 = 456.789D;
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
	}

	public void floatLiterals () {
		float f1 = 0x10;
		float f2 = 123l;
		//float f3 = 12345.33;				// needs suffix "f"
											// compile-error: possible loss of precision
		float f3 = 12345.33f;
		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
		System.out.println("f3 = " + f3);
	}

	public void hexLiterals () {
		int h1 = 0x10;
		int h2 = 0XDeadcafe;
		System.out.println("h1 = " + h1);
		System.out.println("h2 = " + h2);
	}

	public void longLiterals () {
		long l1 = 0x10l;
		long l2 = 123L;
		long l3 = 077l;
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("l3 = " + l3);
	}

	public void octalLiterals () {
		int o1 = 017;						// 7 + 8 = 15
		int o2 = 0111;						// 1 + 8 + 64 = 73
		System.out.println("o1 = " + o1);
		System.out.println("o2 = " + o2);
	}

}
