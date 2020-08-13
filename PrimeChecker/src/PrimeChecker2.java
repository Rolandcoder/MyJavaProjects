import java.util.Scanner;

public class PrimeChecker2 {

	public static void main(String[] args) {
		int testNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Prímszám ellenőrző program.");
		System.out.println("Add meg az N ellenőrzendő számot (2 ≤ N ≤ 1000000).");
		do {
			System.out.print("N = ");
			testNumber = sc.nextInt();

		} while (testNumber < 2 || testNumber > 1_000_000);
		int number = (int) Math.sqrt(testNumber);
		boolean prime = true;
		System.out.print("Az N szám kerekített négyzetgyöke: ");
		System.out.println(number);
		if (testNumber == 2) {

		} else if (testNumber % 2 == 0) {
			prime = false;
		} else {
			for (int divisor = 3; divisor <= number; divisor += 2) {
				if (testNumber % divisor == 0) {
					prime = false;
					System.out.printf("Az N szám Maradék nélküli osztója: %d\n",divisor);
					break;
				}
			}
		}

		if (prime) {
			System.out.println("A szám prímszám.");
		} else {
			System.out.println("A szám nem prímszám.");
		}
	}

}