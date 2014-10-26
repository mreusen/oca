package nl.reusenit.oca.ch01.bounce;

public interface Bounceable {

	int MAX_HEIGHT = 100;

	void bounce();
	void setBounceFactor(int bf);
	void setSpeed(int s);
}
