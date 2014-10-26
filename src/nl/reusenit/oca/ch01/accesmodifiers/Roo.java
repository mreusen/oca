package nl.reusenit.oca.ch01.accesmodifiers;

class Roo {

/*	private String doRooThings() {  */
	String doRooThings() {
		return "fun";
	}
}

class UseRoo {
	
	public void testIt() {
		Roo r = new Roo();
		System.out.println(r.doRooThings());
	}
}