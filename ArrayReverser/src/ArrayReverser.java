
public class ArrayReverser {

	public static void main(String[] args) {
		String[] dayOfWeeks = { "hetfo", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap" };
		System.out.println("A hét napjai:");
		for (int i = 0; i < dayOfWeeks.length -1; i++) {
			System.out.print(dayOfWeeks[i]+"; ");

			
		}
		System.out.println(dayOfWeeks[dayOfWeeks.length-1]);
		System.out.println("");
	
//	String[] reverseDaysOfWeek = new String [7];
		System.out.println("A hét napjai fordított sorrendben:");
		for (int i = 6; i > dayOfWeeks.length-7; i--) {
			System.out.print(dayOfWeeks[i]+ "; ");
		}
		System.out.println(dayOfWeeks[dayOfWeeks.length - 7]);
		System.out.println("");
		System.out.println("A hét napjai fordított sorrendben (ismét):");
		for (int i = 0; i < dayOfWeeks.length -1; i++) {
			System.out.print(dayOfWeeks[i]+"; ");
			
			
		}
		System.out.println(dayOfWeeks[dayOfWeeks.length-1]);
		
	}

}
