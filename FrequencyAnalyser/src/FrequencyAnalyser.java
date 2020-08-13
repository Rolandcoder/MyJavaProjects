
public class FrequencyAnalyser {

	public static void main(String[] args) {
		int[] numbers = { 9, 20, 28, 25, 31, 12, 20, 34, 16, 36, 27, 9, 17, 13, 25, 30, 28, 29, 16, 19, 15, 34, 24, 18, 35, 33, 35, 15, 20, 18, 20,
				33, 26, 13, 10, 19, 12, 31, 9, 9, 31, 11, 21, 21, 23, 34, 24, 17, 13, 34, 18, 31, 11, 32, 33, 29, 12, 15, 10, 30, 34, 34, 30, 10, 15,
				28, 34, 18, 29, 14, 10, 36, 33, 29, 34, 22, 33, 10, 31, 9, 15, 36, 17, 29, 29, 10, 30, 36, 16, 26, 30, 14, 22, 26, 35, 20, 35, 29, 20,
				13, 13, 26, 21, 29, 27, 30, 26, 28, 12, 28, 22, 28, 13, 10, 32, 27, 17, 14, 20, 33, 18, 23, 24, 20, 20, 10, 33, 30, 22, 13, 33, 29,
				29, 31, 16, 18, 21, 19, 18, 9, 11, 23, 12, 12, 21, 29, 23, 10, 18, 21, 15, 27, 22, 13, 27, 19, 21, 26, 16, 29, 20, 28, 28, 13, 32, 21,
				36, 18, 32, 31, 33, 26, 35, 17, 10, 11, 22, 32, 15, 9, 13, 31, 35, 26, 16, 12, 31, 9, 33, 22, 26, 26, 9, 12, 13, 35, 23, 12, 24, 17,
				14, 22, 36, 26, 16, 28, 32, 19, 12, 28, 27, 26, 25, 16, 16, 26, 11, 25, 20, 31, 23, 14, 18, 14, 33, 20, 36, 13, 10, 12, 15, 11, 12,
				17, 17, 27, 29, 25, 22, 15, 27, 35, 27, 10, 10, 24, 33, 27, 13, 23, 23, 9, 36, 33, 35, 35, 32, 25, 22, 19, 36, 21, 32, 32, 23, 16, 18,
				26, 34, 24, 12, 16, 23, 32, 31, 12, 34, 23, 27, 17, 21, 26, 27, 34, 11, 17, 18, 31, 22, 29, 34, 35, 21, 27, 28, 33, 17, 9, 10, 27, 32,
				22, 21, 28, 16, 16, 12, 29, 18, 32, 18, 13, 11, 19, 16, 11, 9, 13, 19, 21, 23, 24, 32, 14, 14, 21, 11, 20, 20, 30, 22, 29, 10, 12, 22,
				21, 31, 10, 9, 13, 17, 33, 18, 14, 27, 29, 31 };
		System.out.printf("A tömböt %d egész szám alkotja.%n", numbers.length);
		System.out.printf("%n");
		int s = 0;
		int l = 0;
		for (int j = 0; j < numbers.length; j++) {          //detecting the smallest and largest number in numbers[]
			if (numbers[s] > numbers[j]) {
				s = j;
			}

			if (numbers[l] < numbers[j]) {
				l = j;

			}
		}
		int smallestNumber = numbers[s];
		int largestNumber = numbers[l];
		System.out.println("A tömbelemek gyakoriság statisztikája:");
		System.out.println("érték előfordulás");
		int[] numberArray = new int[largestNumber - smallestNumber + 1];
		int[] resultArray = new int[numberArray.length];
		for (int j = 0; j < numberArray.length; j++) {  // fill the numberArray[]
			numberArray[j] = smallestNumber;
			smallestNumber++;
		}
		for (int i = 0; i < numberArray.length; i++) {   // step the numberArray[] and the resultArray[] as well
			int cnt = 0;								// counting the repeated numbers
			for (int j = 0; j < numbers.length; j++) { //step the numbers[]
				if (numberArray[i] == numbers[j]) {	  // find the repeated numbers
					cnt++;
				}
			}
			resultArray[i] = cnt;
			System.out.printf("  %3d         %3d%n", numberArray[i], resultArray[i]);
		}
		for (int j = 0; j < resultArray.length; j++) {       
			if (resultArray[s] > resultArray[j]) {
				s = j;
			}
			
			if (resultArray[l] < resultArray[j]) {
				l = j;
				
			}
		}
		System.out.printf("%n");
		System.out.printf("A legritkább szám tehát a(z) %d (%d előfordulással), a leggyakoribb pedig a(z) %d (%d előfordulással).",numberArray[s], resultArray[s], numberArray[l],resultArray[l]);
		
	}

}
