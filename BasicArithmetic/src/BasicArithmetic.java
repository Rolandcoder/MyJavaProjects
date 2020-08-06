import java.util.Scanner;

public class BasicArithmetic {

	public static void main(String[] args) {
		int procedure = 0;
		System.out.println("Üdvözöllek az Alapműveletek programban!");
		while (procedure != 5) {
			System.out.println("");
			System.out.println("1. Összeadás");
			System.out.println("2. Kivonás");
			System.out.println("3. Szorzás");
			System.out.println("4. Osztás");
			System.out.println("5. Kilépés");
			System.out.print("   a művelet? ");
			Scanner sc = new Scanner(System.in);
			procedure = sc.nextInt();
			if (procedure == 5) {
				break;

			} else if (procedure < 1 || procedure > 5) {
				continue;

			}
			System.out.print("   első operandus   : ");
			int firstNumber = sc.nextInt();
			System.out.print("   második operandus: ");
			int secondNumber = sc.nextInt();
			System.out.print("   az eredmény      : ");

			switch (procedure) {
			case 1:
				System.out.println(firstNumber + secondNumber);
				break;
			case 2:
				System.out.println(firstNumber - secondNumber);
				break;
			case 3:
				System.out.println(firstNumber * secondNumber);
				break;
			case 4:
				if (secondNumber == 0) {
					System.out.println("\r" + "   Nullával nem lehet osztani.");
					continue;
				}
				System.out.println(firstNumber / secondNumber);

			}
		}
		System.out.println("");
		System.out.println("Viszlát!");
	}

}
