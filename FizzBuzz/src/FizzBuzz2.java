public class FizzBuzz2 {

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " osztható 15-tel");

			} else if (i % 3 == 0) {
				System.out.println(i + " osztható 3-mal");
			} else if (i % 5 == 0) {
				System.out.println(i + " osztható 5-tel");
			} else {
				System.out.println(i);
			}

		}
	}

}
