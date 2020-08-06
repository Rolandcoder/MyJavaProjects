import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayRotation1 {

	private static final int ARRAY_LENGTH = 20;
	private static final int STEP_LIMIT1 = -120, STEP_LIMIT2 = 120;
	private static final int RANDOM_LOWER_LIMIT = 10;
	private static final int RANDOM_UPPER_LIMIT = 100;

	public static void main(String[] args) {
		int[] numbers = produceNumbers();
		System.out.printf("Az eredeti tömb: %n%s", textToString(numbers));
		System.out.printf("%n%n");
		int stepNumber = inputCount();
		System.out.printf("A rotált tömb: %n%s", textToString(rotate(numbers, stepNumber)));
	}

	private static String textToString(int[] data) {
		String s = Arrays.toString(data);
		return s.substring(1, s.length() - 1);
	}

	private static int[] produceNumbers() {
		int[] numbers = new int[ARRAY_LENGTH];
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = RANDOM_LOWER_LIMIT + rand.nextInt(RANDOM_UPPER_LIMIT - RANDOM_LOWER_LIMIT);
		}
		return numbers;
	}

	private static int inputCount() {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.printf("Add meg a lépések számát (%d ≤ N ≤ %d)!%n", STEP_LIMIT1, STEP_LIMIT2);
		do {
			System.out.print("N = ");
			number = sc.nextInt();
			System.out.printf("%n");
		} while (number < STEP_LIMIT1 || number > STEP_LIMIT2);
		sc.close();
		return number;
	}

	private static int[] rotate(int[] rawArray, int step) {
		step = Math.floorMod(step, ARRAY_LENGTH);
		int[] rotatedNumbers = new int[ARRAY_LENGTH];
		System.arraycopy(rawArray, rawArray.length - step, rotatedNumbers, 0, step);
		System.arraycopy(rawArray, 0, rotatedNumbers, step, rotatedNumbers.length - step);
		return rotatedNumbers;
	}

}
