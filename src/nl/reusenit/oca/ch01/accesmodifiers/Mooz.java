package nl.reusenit.oca.ch01.accesmodifiers;

class Mooz extends Zoo {

	public void useMyCoolMethod() {
		// Does an instance of Mooz inherit the coolMethod()?
		System.out.println("Zoo says, " + this.coolMethod());
		// Works fine, Mooz can inherit the public coolMethod()
		
		// Can an instance of Mooz invoke coolMethod() on an instance of Zoo?
		Zoo z = new Zoo();
		System.out.println("Zoo says, " + z.coolMethod());
		// coolMethod is public, so Moo can invoke it on a Zoo reference
	}
}
