import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		int testNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Prímszám ellenőrző program.");
		System.out.println("Add meg az N ellenőrzendő számot (2 ≤ N ≤ 1000000).");
		do {
			System.out.print("N = ");
			testNumber = sc.nextInt();

		} while (testNumber < 2 || testNumber > 1000000);
		boolean prime = true;
		if (testNumber == 2) {
			prime = true;
		} else if (testNumber % 2 == 0) {
			prime = false;
		}else {
			for (int divisor = 3; divisor < testNumber; divisor += 2) {
				if (testNumber % divisor == 0) {
					prime = false;
					break;
				}
				}
		}
		
		
		
	}

}