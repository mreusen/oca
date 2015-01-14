package nl.reusenit.oca.ch03.variableinit;

public class PrimitiveInstanceVar {

	int year;
	public static void main(String[] args) {
		PrimitiveInstanceVar p = new PrimitiveInstanceVar();
		p.showYear();
	}

	public void showYear() {
		System.out.println("int year = " + year);
	}
}
