package nl.reusenit.oca.c01declarationsandaccescontrol;

public class Audi extends Car {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("mooi");
	}

	@Override
	public void goFast() {
		setPrice(50000);
	}

	@Override
	public void goUpHill() {
		// TODO Auto-generated method stub
	}

}
