import java.util.Scanner;

public class SpreadsheetColumnLabel {

	public static void main(String[] args) {
		System.out.println("Add meg az oszlop N sorszámát (N ≥ 0)!");
		int number = 0;
		System.out.printf("Az oszlop címkéje: %s", getColumnLabel(getColumnNumber(number)));
	}

	private static int getColumnNumber(int number) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("N = ");
			number = sc.nextInt();
		} while (number < 0);
		sc.close();
		return number;
	}

	public static String getColumnLabel(int columnNumber) {
		char c = (char) ('A' + (columnNumber % 26));
		if (columnNumber < 26) {
			return Character.toString(c);
		} else {
			return getColumnLabel(columnNumber / 26 - 1) + c;
		}
	}

}
