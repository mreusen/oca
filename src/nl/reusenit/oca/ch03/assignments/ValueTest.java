package nl.reusenit.oca.ch03.assignments;

public class ValueTest {

	public static void main(String[] args) {

		ValueTest v = new ValueTest();
		v.go();
	}

	public void go() {
		int a = 10;
		System.out.println("a = " + a);
		int b = a;
		b = 30;
		System.out.println("a = " + a + " after change to b");
	}
}
