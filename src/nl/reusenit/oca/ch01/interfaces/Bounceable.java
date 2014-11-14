package nl.reusenit.oca.ch01.interfaces;

public interface Bounceable extends AnotherInterface {

	int MAX_HEIGHT = 100;

	void bounce();
	void setBounceFactor(int bf);
	void setSpeed(int s);
}
