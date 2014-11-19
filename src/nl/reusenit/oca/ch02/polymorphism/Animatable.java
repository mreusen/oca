package nl.reusenit.oca.ch02.polymorphism;

import nl.reusenit.oca.ch02.inheritance.GameShape;

public interface Animatable {

	public void animate();
	
}

class PlayerPiece extends GameShape implements Animatable {
	
	public static void main(String[] args) {
		
		// PlayerPiece can be treated polymorphically as one of four things
		Object o = new PlayerPiece();
		PlayerPiece piece = new PlayerPiece();
		piece.displayShape();						// PlayerPiece IS-A GameShape
													//   PlayerPiece can be used to
													//   invoke the displayShape()
		GameShape shape = new PlayerPiece();
		shape.displayShape();
		Animatable mover = new PlayerPiece();
		// mover.displayShape();					// not possible
													// method invocation are based solely
													//   on the declared type of the reference
	}

	public void animate() {
		System.out.println("animating....");
	}
}