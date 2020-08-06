public class EvenNumberArray {

	public static void main(String[] args) {
		int number = 42;
		int[] numbers = new int[20];
		for (int i = 0; i < 20; i++) {
			numbers[i] = number;
			if (i == 19) {
				System.out.println(numbers[i]);
				break;
				}
			System.out.print(numbers[i] + "; ");
			number = number + 2;
		}
		for (int i = 19; i > -1; i--) {
			if (i == 0) {
				System.out.println(numbers[i]);
				break;
			}
			System.out.print(numbers[i] + "; ");

		}
	}

}