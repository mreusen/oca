package nl.reusenit.oca.ch02.inheritance;

public class TestShapes {

	public static void main(String[] args) {
		PlayerPiece player = new PlayerPiece();
		TilePiece piece = new TilePiece();
		doShapes(player);
		doShapes(piece);
	}

	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}
}
