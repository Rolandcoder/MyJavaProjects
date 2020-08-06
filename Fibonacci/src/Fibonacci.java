public class Fibonacci {

	public static void main(String[] args) {
		int fibo1 = 0;
		int fibo2 = 1;
		int fibo3;
		int index = 0;

		while (index < 47) {
			if (index < 3) {
				System.out.print(index++);
				System.out.println(". " + fibo1);
			}
			fibo3 = fibo1 + fibo2;
			System.out.print(index);
			System.out.println(". " + fibo3);
			fibo1 = fibo2;
			fibo2 = fibo3;
			index++;
		}
	}

}
