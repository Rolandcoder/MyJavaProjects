import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	private static final int ARRAY_LENGTH = 10;
	private static final double BOTTOM_LIMIT = 4.0;
	private static final double TOP_LIMIT = 6.0;

	public static void main(String[] args) {
		testSort();
		pessimalTest();
	}

	public static double[] sort(double[] numbers) {
		for (int i = 0; i <= numbers.length - 2; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					double tmp = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		return numbers;
	}

	public static void testSort() {
		double[] numbers = randomArray();
		double[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(copyNumbers);
		Arrays.sort(numbers);
		for (int i = 9, j = 0; i >= j; i--, j++) {
			double tmp = numbers[j];
			numbers[j] = numbers[i];
			numbers[i] = tmp;
		}
		if (Arrays.equals(copyNumbers, sort(numbers))) {
			System.out.println("A bubbleSort metódus jól működik");
		} else {
			System.out.println("Ezt nézd át mégegyszer.");
		}
	}

	private static double[] randomArray() {
		Random rand = new Random();
		double[] numbers = new double[ARRAY_LENGTH];
		for (int i = 0; i < numbers.length - 1; i++) {
			numbers[i] = rand.nextDouble()*(TOP_LIMIT-BOTTOM_LIMIT)+BOTTOM_LIMIT;
		}
		return numbers;
	}

	private static double[] pessimalArray(double[] numbers) {
		double tmp;
		for (int i = 0, j = numbers.length - 1; i <= j; i++, j--) {
			tmp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = tmp;
		}
		return numbers;
	}

	private static void pessimalTest() {
		double[] numbers = randomArray();
		Arrays.sort(numbers);
		if (numbers.equals(sort(pessimalArray(numbers)))) {
			System.out.println("A bubbleSort metódus átment a pessimal test-en is");
		} else {
			System.out.println("Próbáld meg újra");
		}
	}

}
