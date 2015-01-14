package nl.reusenit.oca.ch03.passingvariablesintomethods;

import java.awt.Dimension;

public class ReferenceTest {

	public static void main(String[] args) {

		Dimension d = new Dimension(5,10);
		int a = 1;
		
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Before modify() d.height = " + d.height);
		rt.modify(d);
		System.out.println("After modify() d.height = " + d.height);
		
		System.out.println("a before modify() = " + a);
		rt.modify(a);
		System.out.println("a after modify() = " + a);
		
	}

	public void modify(Dimension dim) {
		dim.height = dim.height + 1;
		System.out.println("dim.height = " + dim.height);
	}
	
	public void modify(int number) {
		number = number + 1;
		System.out.println("number = " + number);
	}
}
