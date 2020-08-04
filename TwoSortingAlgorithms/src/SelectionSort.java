import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	private static final int ARRAY_LENGTH = 10;
	private static final double BOTTOM_LIMIT = 8.0;
	private static final double TOP_LIMIT = 10.0;

	public static void main(String[] args) {
		testSort();
		pessimalTest();
	}

	private static double[] sort(double[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[minIndex] > numbers[j]) {
					minIndex = j;
				}
			}
			double tmp = numbers[minIndex];
			numbers[minIndex]=numbers[i];
			numbers[i] = tmp;
		}
		return numbers;
	}

	public static void testSort() {
		double[] numbers = randomArray();
		double[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(copyNumbers);
		if (Arrays.equals(copyNumbers, sort(numbers))) {
			System.out.println("A selectSort metódus jól működik");
		} else {
			System.out.println("Ezt nézd át mégegyszer.");
		}
	}

	private static double[] randomArray() {
		Random rand = new Random();
		double[] numbers = new double[ARRAY_LENGTH];
		for (int i = 0; i <= numbers.length - 1; i++) {
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
			System.out.println("A selectSort metódus átment a pessimal test-en is");
		} else {
			System.out.println("Próbáld meg újra");
		}
	}

}
