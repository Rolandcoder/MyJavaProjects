import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame2 {

	public static final int TIP_MAX = 15;

	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		printBriefing();
		if (firstRound()) {
			nextRound();
		}
	}

	private static boolean playSession(int random) {
		System.out.printf("Megvan a kitalálandó szám.%n");
		for (int i = 1; i <= TIP_MAX; i++) {
			System.out.printf("%d. tipp: ", i);
			int userTip = sc.nextInt();
			if (userTip == 0) {
				System.out.printf("%nViszlát!");
				return false;
			} else if (random > userTip) {
				System.out.printf("   nagyobb, mint %d%n", userTip);
			} else if (random < userTip) {
				System.out.printf("   kisebb, mint %d%n", userTip);

			} else {
				if (i <= 2) {
					System.out.printf("Eltaláltad! Nagy szerencséd volt!%n");
				} else if (i < 8) {
					System.out.printf("Korán eltaláltad! Szerencsés vagy!%n");
				} else if (i == 8) {
					System.out.printf("Ok, időben eltaláltad!%n");
				} else if (i <= 15) {
					System.out.printf("Eltaláltad, bár lehettél volna kicsit gyorsabb is.%n");
				}
				break;
			}
			if (i == 15) {
				System.out.printf("Ez most nem sikerült. Gondold végig a tippelési stratégiát.%n");
				break;
			}
		}
		return true;
	}

	private static void nextRound() {
		String choice;
		for (; true;) {
			do {
				System.out.printf("%nKezdődhet a következő menet (i/n)? ");
				choice = sc.next();
			} while (!choice.equals("n") && !choice.equals("i"));
			if (choice.equals("n")) {
				System.out.printf("%nViszlát!");
				break;
			} else {
				if (!playSession(randomNumber())) {
					break;
				}
			}
		}
	}

	private static boolean firstRound() {
		String choice;
		do {
			System.out.print("Kezdődhet az első menet (i/n)? ");
			choice = sc.next();
		} while (!choice.equals("n") && !choice.equals("i"));
		if (choice.equals("n")) {
			System.out.printf("%nViszlát!");
			return false;
		} else {
			return playSession(randomNumber());

		}
	}

	private static int randomNumber() {
		return rand.nextInt(200) + 1;
	}

	private static void printBriefing() {
		System.out.printf("Üdvözöllek a számkitalálós játékban!%n"
				+ "A játék lényege, hogy a program \"gondol\" egy számra 1 és 200 közt, amit Neked ki kell találnod, mégpedig minél kevesebb tippeléssel.%n"
				+ "A program minden tipped után közli, hogy a kitalálandó szám kisebb vagy nagyobb, mint a tipp.%n"
				+ "Ha viszont a kettő éppen megegyezik, az aktuális menet véget ér - de ha akarod, kezdődhet a következő.%n"
				+ "Nulla megadásával bármikor, menet közben is ki tudsz lépni a programból.%n%n");
	}

}
