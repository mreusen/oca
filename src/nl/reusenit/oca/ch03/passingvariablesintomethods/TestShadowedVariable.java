package nl.reusenit.oca.ch03.passingvariablesintomethods;

public class TestShadowedVariable {

	Bar myBar = new Bar();
	
	void changeIt(Bar myBar) {
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt() is " + myBar.barNum);
		myBar = new Bar();					// local parameter myBar is the shadowing variable
		myBar.barNum = 420;					//   scope is only within the changeIt() method
		System.out.println("myBar.barNum in changeIt() is now " + myBar.barNum);
	}
	
	public static void main(String[] args) {
		
		TestShadowedVariable s = new TestShadowedVariable();
		System.out.println("s.myBar.barNum is " + s.myBar.barNum);
		s.changeIt(s.myBar);
		System.out.println("s.myBar.barNum after changeIt() is " + s.myBar.barNum);

	}

}

class Bar {
	int barNum  = 28;
}
