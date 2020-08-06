import java.util.Scanner;

public class BasicArithmeticExtended {

	public static void main(String[] args) {
		int procedure = 0;
		System.out.println("Üdvözöllek az Alapműveletek programban!");
		while (procedure != 6) {
			System.out.println("");
			System.out.println("1. Összeadás");
			System.out.println("2. Kivonás");
			System.out.println("3. Szorzás");
			System.out.println("4. Osztás");
			System.out.println("5. Maradékképzés");
			System.out.println("6. Kilépés");
			System.out.print("   a művelet? ");
			Scanner scn = new Scanner(System.in);
			procedure = scn.nextInt();
			if (procedure == 6) {
				break;
			}
			if (procedure < 1 || procedure > 6) {
				continue;
			}
			System.out.print("   első operandus   : ");
			int firstNumber = scn.nextInt();
			System.out.print("   második operandus: ");
			int secondNumber = scn.nextInt();
			System.out.print("   az eredmény      : ");

			switch (procedure) {
			case 1->
				System.out.println(firstNumber + secondNumber);
				
			case 2 ->
				System.out.println(firstNumber - secondNumber);
			case 3->
				System.out.println(firstNumber * secondNumber);
			case 4->{
				if (secondNumber == 0) {
					System.out.println("\r"+"   Nullával nem lehet osztani.");
					continue;
				}
				
				System.out.println(firstNumber / secondNumber);
			}
			case 5->{
				if (secondNumber == 0) {
					System.out.println("\r"+"   Nullával nem lehet osztani.");
					continue;
				}
				System.out.println(firstNumber % secondNumber);
			}
			}
		}
		System.out.println("");
		System.out.println("Viszlát!");
	}
	
}
