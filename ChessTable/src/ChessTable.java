
public class ChessTable {

	public static void main(String[] args) {
		String chessFigures = (" R | N | B | K | Q | B | N | R ");
		String chessFigures2 = (" P | P | P | P | P | P | P | P ");
		System.out.println(chessFigures);
		System.out.println("---+---+---+---+---+---+---+---");
		System.out.println(chessFigures2);
		System.out.println("---+---+---+---+---+---+---+---");

		for (int i = 1; i <= 4; i++) {
			System.out.println("   |   |   |   |   |   |   |   ");
			System.out.println("---+---+---+---+---+---+---+---");
		}

		System.out.println(chessFigures2.toLowerCase());
		System.out.println("---+---+---+---+---+---+---+---");
		System.out.println(chessFigures.toLowerCase());
	}

}
