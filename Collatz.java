// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int i;
		int counter = 2;
		for (int j = 1; j <= seed; j++) {
			i = j;
			if (i == 1) {
				i = 4;
				if(mode.equals("v")) {System.out.print("1 ");}
			}
			while (i != 1) {
				if(mode.equals("v")) {System.out.print(i + " ");}
				if (i % 2 == 0) {
					i = i / 2;
				}
				else
				{
					i = i * 3 + 1;
				}
				counter++;
			}
			if(mode.equals("v")) {System.out.print("1 (" + counter + ")\n");}
			counter = 1;
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");


	}
}
