// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code

		String laps1 = args[0];
		int laps = Integer.parseInt(laps1);
		double sum = 1.0;
		int counter = 1;

		for( int i = 3; i < laps; i = i + 2) {
			if (counter % 2 == 1) {
				sum -= (1.0/i);
			} else {
				sum += (1.0/i);
			}
			counter++;
		}
		
		sum = sum * 4;

		System.out.println("pi, approximated:     " + Math.PI);
		System.out.println("pi according to Java:     " + sum);

	}
}
