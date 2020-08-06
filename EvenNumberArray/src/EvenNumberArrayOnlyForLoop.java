public class EvenNumberArrayOnlyForLoop {

	public static void main(String[] args) {
		int number = 42;
		int nextNumber;
		int[] numbers = new int[20];
		for (int i = 0; i < 20; i++) {
			numbers[i] = number;
			System.out.print(numbers[i] + " ");
			nextNumber = number + 2;
			number = nextNumber;
		}
		System.out.println("");
		for (int i = 19; i > -1; i--) {
			System.out.print(numbers[i] + " ");

		}
	}

}
