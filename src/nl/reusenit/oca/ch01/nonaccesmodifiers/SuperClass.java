package nl.reusenit.oca.ch01.nonaccesmodifiers;

class SuperClass {

	// final prevents a method from being overriden
	public final void showSample() {
		System.out.println("One thing.");
	}
	
	public void getRecord(int fileNumber, final int recNumber) {
		int reccie = recNumber;
		fileNumber++;
		privateMethod();
	}
	
	private String privateMethod() {
		return "privaatje";
	}
}
