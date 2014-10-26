package nl.reusenit.oca.ch01.accesmodifiers;

class Moo {

	public void useZoo() {
		Zoo z = new Zoo();
		System.out.println("Zoo says, " + z.coolMethod());
	}

}
