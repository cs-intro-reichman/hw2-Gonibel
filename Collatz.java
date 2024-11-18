// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String laps1 = args[0];
		String mode = args[1];
		int laps = Integer.parseInt(laps1);
		int counter = 0;

		if(mode.equals("v")) {

			if(laps ==1) {
				int caseone = 1;
				System.out.print("\n" + caseone);
				caseone = caseone * 3 + 1;
				System.out.print(" " + caseone);

				while (caseone != 1) {
					if (caseone% 2 == 0) {
						caseone = caseone / 2;
						System.out.print(" " + caseone);
						counter++;
					} else {
						caseone = caseone * 3 +1;
						System.out.print(" " + caseone);
						counter++;
					}
					System.out.print(" ("+counter+")");

				}
			} else {


		
		for(int i = 1; i <= laps; i++) {
			int seed = i;
			counter = 0;
			System.out.print("\n"+seed);
			if (seed == 1){seed = seed *3 +1; System.out.print(" " + seed);}
			while (seed !=1) {
				if (seed % 2 == 0) {
					seed = seed / 2;
					System.out.print(" " + seed);
					counter++;
				} else {
					seed = seed * 3 +1;
					System.out.print(" " + seed);
					counter++;
				}
			}
			System.out.println(" ("+counter+")");
			
		}
	}
		System.out.println("Every one of the first " + laps + " hailstone sequences reached 1.");
	} else {
		System.out.println("Every one of the first " + laps + " hailstone sequences reached 1.");
	}

	}
}
