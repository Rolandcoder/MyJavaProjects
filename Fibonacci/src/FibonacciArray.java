public class FibonacciArray {

	public static void main(String[] args) {
		int fibo1 = 0;
		int fibo2 = 1;
		int fibo3;
		int index = 0;
		int[] fibo = new int[47];
		int lnt = fibo.length;
		System.out.println(lnt);

		for (int i = 0; i < 47; i++) {
			if (i < 3) {
				fibo[i] = fibo1;
				i++;
			}
			fibo3 = fibo1 + fibo2;
			fibo[i] = fibo3;
			fibo1 = fibo2;
			fibo2 = fibo3;
		}
		while (index < 47) {
			System.out.println(index + ". " + fibo[index++]);
		}
	}

}
