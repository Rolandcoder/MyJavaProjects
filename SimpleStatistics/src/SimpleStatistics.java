import java.util.Arrays;
import java.util.Scanner;

public class SimpleStatistics {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		greeting();
		int[] basicNumbers = addBasicNumber(requestNumber());
		System.out.printf("A számok tehát a következők: %s%n", arrayToText(basicNumbers));
		Arrays.sort(basicNumbers);
		System.out.printf("Növekvő sorrendben: %s%n", arrayToText(basicNumbers));
		printStatistics(basicNumbers);
		System.out.printf("%n");
		System.out.printf("Viszlát!");
		sc.close();
	}

	private static int countSum(int[] data) {
		int sum = 0;
		for (int d : data) {
			sum += d;
		}
		return sum;
	}

	private static int requestNumber() {
		int givenNumber;
		do {
			System.out.print("Add meg, hány számból álljon a sokaság (3 ≤ N ≤ 50): ");
			givenNumber = sc.nextInt();
		} while (givenNumber < 3 || givenNumber > 50);
		return givenNumber;
	}

	private static int[] addBasicNumber(int data) {
		int number;
		int[] array = new int[data];
		for (int i = 1; i <= data; i++) {
			System.out.printf("   A(z) %d szám: ", i);
			number = sc.nextInt();
			array[i - 1] = number;
		}
		System.out.printf("%n");
		return array;
	}

	private static void greeting() {
		System.out.println("Üdvözöllek az Alapstatisztika alkalmazásban!");
		System.out.printf("%n");
	}

	private static String arrayToText(int[] data) {
		String num = Arrays.toString(data);
		num = num.substring(1, num.length() - 1);
		return num;
	}

	private static double countMedian(int[] data) {
		double median;
		if (data.length % 2 == 0) {
			median = (data[data.length / 2] + data[data.length / 2 - 1]) / (double) 2;
			return median;
		} else {
			median = data[data.length / 2];
			return median;
		}
	}

	private static int[] countModus(int[] data) {
		int min = data[0];
		int max = data[data.length - 1];
		int[] counter = new int[max - min + 1];
		for (int d : data) {
			counter[d - min]++;
		}
		int maxFrequency = 0;
		for (int d : counter) {
			maxFrequency = Math.max(maxFrequency, d);
		}
		int cnt = 0;
		for (int d : counter) {
			if (d == maxFrequency) {
				cnt++;
			}
		}
		int[] modus = new int[cnt];
		cnt = 0;
		for (int i = 0, value = min; i < counter.length; i++, value++) {
			if (counter[i] == maxFrequency) {
				modus[cnt++] = value;
			}
		}
		return modus;
	}

	private static void printStatistics(int[] data) {
		int sum = countSum(data);
		double median = countMedian(data);

		System.out.printf("A legkisebb adat: %d%n", data[0]);
		System.out.printf("A legnagyobb adat: %d%n", data[data.length - 1]);
		System.out.printf("Az adatok összege: %d%n", sum);
		System.out.printf("A medián: %.2f%n", median);
		System.out.printf("A módusz: %s%n", arrayToText(countModus(data)));
		System.out.printf("Az átlag: %.2f%n", (double) sum / data.length);
	}

}