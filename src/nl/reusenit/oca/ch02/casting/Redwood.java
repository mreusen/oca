package nl.reusenit.oca.ch02.casting;

public class Redwood extends Tree{

	public static void main(String[] args) {
		new Redwood().go();
	}

	void go() {
		/*
		 * Redwood r = new Tree();	can't convert Tree to Redwood
		 */
		Tree t = new Redwood();
		Redwood r  = (Redwood) t;
		
		go2(new Redwood(), new Redwood());
		System.out.println("   OK");
		go2((Redwood) new Tree(), new Redwood());
		System.out.println("   OK");
	}
	
	void go2(Tree t1, Redwood r1) {
		System.out.println("first go2()");
		Redwood r2 = (Redwood) t1;
		System.out.println("second go2()");
		Tree t2 = (Tree) r1;
	}
}

class Tree {
	
}